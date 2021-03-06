package fr.kazejiyu.ekumi.core.execution;

import static fr.kazejiyu.ekumi.core.ekumi.Status.CANCELLED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.FAILED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.RUNNING;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;

import java.util.Date;

import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;

import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.ekumi.impl.ExecutionImpl;
import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.core.execution.events.impl.StatusToEventAdapter;

/**
 * An {@link Execution} that relies on {@link Job Jobs} 
 * to run its activity in background. 
 */
public class BasicExecution extends ExecutionImpl {
	
	/** The background process that executes the activity */
	private Job job;
	
	public BasicExecution() {
		setContext(new BasicUnsafeContext());
	}
	
	@Override
	public boolean isRunning() {
		return getStatus() == RUNNING;
	}
	
	@Override
	public boolean isCancelled() {
		return getStatus() == CANCELLED;
	}
	
	@Override
	public void start() {
		Adapter adapter = new StatusToEventAdapter(getContext().getEvents());
		getActivity().eAdapters().add(adapter);
		
		setStartDate(new Date());
		
		setStatus(RUNNING);
		runActivityInBackground();                          
	}

	private void runActivityInBackground() {
		job = Job.create("Executing " + getActivity().getName(), (ICoreRunnable) monitor -> {
			context.setExecutionStatus(new BasicExecutionStatus(this, monitor));
			context.getEvents().hasStarted(this);
			
			try {
				getActivity().run(context.safe());
				
				setStatus(SUCCEEDED);
				context.getEvents().hasSucceeded(this);
				
			} catch (Exception e) {
				setStatus(FAILED);
			}
			
		});
		job.schedule();
	}
	
	@Override
	public void cancel() {
		status = CANCELLED;
	}
	
	@Override
	public void join() throws InterruptedExecutionException {
		try {
			if (job != null)
				job.join();
			
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new InterruptedExecutionException("The execution has been interrupted while joining", e);
		}
	}
	
}

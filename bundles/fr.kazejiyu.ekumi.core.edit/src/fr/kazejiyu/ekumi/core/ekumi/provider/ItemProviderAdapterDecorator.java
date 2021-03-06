package fr.kazejiyu.ekumi.core.ekumi.provider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderDecorator;

/**
 * An abstract decorator used to override the implementation of the item
 * providers generated by EMF.
 * 
 * @author Emmanuel CHEBBI
 */
public class ItemProviderAdapterDecorator extends ItemProviderDecorator 
										  implements Adapter.Internal, 
										  			 IEditingDomainItemProvider, 
										  			 IStructuredItemContentProvider, 
										  			 ITreeItemContentProvider, 
										  			 IItemLabelProvider, 
										  			 IItemPropertySource {
	
	private final List<Notifier> targets = new ArrayList<>();
	
	public ItemProviderAdapterDecorator(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Notifier getTarget() {
		if (targets.isEmpty())
			return null;
		
		return targets.get(targets.size() - 1);
	}

	@Override
	public void setTarget(Notifier newTarget) {
		targets.add(newTarget);
	}

	@Override
	public void unsetTarget(Notifier oldTarget) {
		targets.remove(oldTarget);
	}

}

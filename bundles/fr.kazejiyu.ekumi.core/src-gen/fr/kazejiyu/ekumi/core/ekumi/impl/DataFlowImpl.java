/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.DataFlow;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;

import fr.kazejiyu.ekumi.core.ekumi.Variable;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl#getInput <em>Input</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowImpl extends MinimalEObjectImpl.Container implements DataFlow {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Variable input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Variable output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EkumiPackage.Literals.DATA_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject) input;
			input = (Variable) eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.DATA_FLOW__INPUT, oldInput,
							input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Variable newInput) {
		Variable oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.DATA_FLOW__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject) output;
			output = (Variable) eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.DATA_FLOW__OUTPUT, oldOutput,
							output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Variable newOutput) {
		Variable oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.DATA_FLOW__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getDestination() {
		Activity destination = basicGetDestination();
		return destination != null && destination.eIsProxy() ? (Activity) eResolveProxy((InternalEObject) destination)
				: destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetDestination() {
		return output.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetDestination() {
		return getDestination() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getSource() {
		Activity source = basicGetSource();
		return source != null && source.eIsProxy() ? (Activity) eResolveProxy((InternalEObject) source) : source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetSource() {
		return input.getOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetSource() {
		return getSource() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EkumiPackage.DATA_FLOW__INPUT:
			if (resolve)
				return getInput();
			return basicGetInput();
		case EkumiPackage.DATA_FLOW__OUTPUT:
			if (resolve)
				return getOutput();
			return basicGetOutput();
		case EkumiPackage.DATA_FLOW__DESTINATION:
			if (resolve)
				return getDestination();
			return basicGetDestination();
		case EkumiPackage.DATA_FLOW__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EkumiPackage.DATA_FLOW__INPUT:
			setInput((Variable) newValue);
			return;
		case EkumiPackage.DATA_FLOW__OUTPUT:
			setOutput((Variable) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EkumiPackage.DATA_FLOW__INPUT:
			setInput((Variable) null);
			return;
		case EkumiPackage.DATA_FLOW__OUTPUT:
			setOutput((Variable) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EkumiPackage.DATA_FLOW__INPUT:
			return input != null;
		case EkumiPackage.DATA_FLOW__OUTPUT:
			return output != null;
		case EkumiPackage.DATA_FLOW__DESTINATION:
			return isSetDestination();
		case EkumiPackage.DATA_FLOW__SOURCE:
			return basicGetSource() != null;
		}
		return super.eIsSet(featureID);
	}

} //DataFlowImpl

/**
 */
package fr.kazejiyu.ekumi.core.ekumi.provider;

import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.StructuredLoop;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredLoopItemProvider extends ActivityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredLoopItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addActivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StructuredLoop_activity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StructuredLoop_activity_feature",
								"_UI_StructuredLoop_type"),
						EkumiPackage.Literals.STRUCTURED_LOOP__ACTIVITY, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EkumiPackage.Literals.STRUCTURED_LOOP__PRE_CONDITION);
			childrenFeatures.add(EkumiPackage.Literals.STRUCTURED_LOOP__POST_CONDITION);
			childrenFeatures.add(EkumiPackage.Literals.STRUCTURED_LOOP__ACTIVITY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns StructuredLoop.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StructuredLoop"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((StructuredLoop) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_StructuredLoop_type")
				: getString("_UI_StructuredLoop_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StructuredLoop.class)) {
		case EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION:
		case EkumiPackage.STRUCTURED_LOOP__POST_CONDITION:
		case EkumiPackage.STRUCTURED_LOOP__ACTIVITY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.STRUCTURED_LOOP__ACTIVITY,
				EkumiFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.STRUCTURED_LOOP__ACTIVITY,
				EkumiFactory.eINSTANCE.createMultipleInstances()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.STRUCTURED_LOOP__ACTIVITY,
				EkumiFactory.eINSTANCE.createStructuredLoop()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.STRUCTURED_LOOP__ACTIVITY,
				EkumiFactory.eINSTANCE.createScriptedTask()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.STRUCTURED_LOOP__ACTIVITY,
				EkumiFactory.eINSTANCE.createMultiChoice()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.STRUCTURED_LOOP__ACTIVITY,
				EkumiFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.STRUCTURED_LOOP__ACTIVITY,
				EkumiFactory.eINSTANCE.createParallelSplit()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == EkumiPackage.Literals.ACTIVITY__INPUTS
				|| childFeature == EkumiPackage.Literals.ACTIVITY__OUTPUTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

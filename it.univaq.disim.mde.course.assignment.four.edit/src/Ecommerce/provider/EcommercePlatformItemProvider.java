/**
 */
package Ecommerce.provider;


import Ecommerce.EcommerceFactory;
import Ecommerce.EcommercePackage;
import Ecommerce.EcommercePlatform;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Ecommerce.EcommercePlatform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EcommercePlatformItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcommercePlatformItemProvider(AdapterFactory adapterFactory) {
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

			addUrlPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EcommercePlatform_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EcommercePlatform_url_feature", "_UI_EcommercePlatform_type"),
				 EcommercePackage.Literals.ECOMMERCE_PLATFORM__URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EcommercePlatform_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EcommercePlatform_description_feature", "_UI_EcommercePlatform_type"),
				 EcommercePackage.Literals.ECOMMERCE_PLATFORM__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(EcommercePackage.Literals.ECOMMERCE_PLATFORM__CUSTOMERS);
			childrenFeatures.add(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PRODUCTS);
			childrenFeatures.add(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES);
			childrenFeatures.add(EcommercePackage.Literals.ECOMMERCE_PLATFORM__ORDERS);
			childrenFeatures.add(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PROMOTIONS);
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
	 * This returns EcommercePlatform.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EcommercePlatform"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EcommercePlatform)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EcommercePlatform_type") :
			getString("_UI_EcommercePlatform_type") + " " + label;
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

		switch (notification.getFeatureID(EcommercePlatform.class)) {
			case EcommercePackage.ECOMMERCE_PLATFORM__URL:
			case EcommercePackage.ECOMMERCE_PLATFORM__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__CUSTOMERS:
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCTS:
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES:
			case EcommercePackage.ECOMMERCE_PLATFORM__ORDERS:
			case EcommercePackage.ECOMMERCE_PLATFORM__PROMOTIONS:
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

		newChildDescriptors.add
			(createChildParameter
				(EcommercePackage.Literals.ECOMMERCE_PLATFORM__CUSTOMERS,
				 EcommerceFactory.eINSTANCE.createCustomer()));

		newChildDescriptors.add
			(createChildParameter
				(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PRODUCTS,
				 EcommerceFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES,
				 EcommerceFactory.eINSTANCE.createProductCategory()));

		newChildDescriptors.add
			(createChildParameter
				(EcommercePackage.Literals.ECOMMERCE_PLATFORM__ORDERS,
				 EcommerceFactory.eINSTANCE.createOrder()));

		newChildDescriptors.add
			(createChildParameter
				(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PROMOTIONS,
				 EcommerceFactory.eINSTANCE.createPromotion()));
	}

}

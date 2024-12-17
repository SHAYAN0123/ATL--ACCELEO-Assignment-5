/**
 */
package Ecommerce.impl;

import Ecommerce.EcommercePackage;
import Ecommerce.Shipment;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.ShipmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.impl.ShipmentImpl#getCourierName <em>Courier Name</em>}</li>
 *   <li>{@link Ecommerce.impl.ShipmentImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link Ecommerce.impl.ShipmentImpl#getEstimatedDelivery <em>Estimated Delivery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipmentImpl extends MinimalEObjectImpl.Container implements Shipment {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourierName() <em>Courier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourierName()
	 * @generated
	 * @ordered
	 */
	protected static final String COURIER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourierName() <em>Courier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourierName()
	 * @generated
	 * @ordered
	 */
	protected String courierName = COURIER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedDelivery() <em>Estimated Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDelivery()
	 * @generated
	 * @ordered
	 */
	protected static final Date ESTIMATED_DELIVERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedDelivery() <em>Estimated Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedDelivery()
	 * @generated
	 * @ordered
	 */
	protected Date estimatedDelivery = ESTIMATED_DELIVERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.SHIPMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.SHIPMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCourierName() {
		return courierName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourierName(String newCourierName) {
		String oldCourierName = courierName;
		courierName = newCourierName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.SHIPMENT__COURIER_NAME, oldCourierName, courierName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.SHIPMENT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEstimatedDelivery() {
		return estimatedDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedDelivery(Date newEstimatedDelivery) {
		Date oldEstimatedDelivery = estimatedDelivery;
		estimatedDelivery = newEstimatedDelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.SHIPMENT__ESTIMATED_DELIVERY, oldEstimatedDelivery, estimatedDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcommercePackage.SHIPMENT__ID:
				return getId();
			case EcommercePackage.SHIPMENT__COURIER_NAME:
				return getCourierName();
			case EcommercePackage.SHIPMENT__COST:
				return getCost();
			case EcommercePackage.SHIPMENT__ESTIMATED_DELIVERY:
				return getEstimatedDelivery();
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
			case EcommercePackage.SHIPMENT__ID:
				setId((Integer)newValue);
				return;
			case EcommercePackage.SHIPMENT__COURIER_NAME:
				setCourierName((String)newValue);
				return;
			case EcommercePackage.SHIPMENT__COST:
				setCost((Float)newValue);
				return;
			case EcommercePackage.SHIPMENT__ESTIMATED_DELIVERY:
				setEstimatedDelivery((Date)newValue);
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
			case EcommercePackage.SHIPMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case EcommercePackage.SHIPMENT__COURIER_NAME:
				setCourierName(COURIER_NAME_EDEFAULT);
				return;
			case EcommercePackage.SHIPMENT__COST:
				setCost(COST_EDEFAULT);
				return;
			case EcommercePackage.SHIPMENT__ESTIMATED_DELIVERY:
				setEstimatedDelivery(ESTIMATED_DELIVERY_EDEFAULT);
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
			case EcommercePackage.SHIPMENT__ID:
				return id != ID_EDEFAULT;
			case EcommercePackage.SHIPMENT__COURIER_NAME:
				return COURIER_NAME_EDEFAULT == null ? courierName != null : !COURIER_NAME_EDEFAULT.equals(courierName);
			case EcommercePackage.SHIPMENT__COST:
				return cost != COST_EDEFAULT;
			case EcommercePackage.SHIPMENT__ESTIMATED_DELIVERY:
				return ESTIMATED_DELIVERY_EDEFAULT == null ? estimatedDelivery != null : !ESTIMATED_DELIVERY_EDEFAULT.equals(estimatedDelivery);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", courierName: ");
		result.append(courierName);
		result.append(", cost: ");
		result.append(cost);
		result.append(", estimatedDelivery: ");
		result.append(estimatedDelivery);
		result.append(')');
		return result.toString();
	}

} //ShipmentImpl

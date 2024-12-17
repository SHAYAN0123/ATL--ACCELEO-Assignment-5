/**
 */
package Ecommerce;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Shipment#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.Shipment#getCourierName <em>Courier Name</em>}</li>
 *   <li>{@link Ecommerce.Shipment#getCost <em>Cost</em>}</li>
 *   <li>{@link Ecommerce.Shipment#getEstimatedDelivery <em>Estimated Delivery</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getShipment()
 * @model
 * @generated
 */
public interface Shipment extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getShipment_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.Shipment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Courier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courier Name</em>' attribute.
	 * @see #setCourierName(String)
	 * @see Ecommerce.EcommercePackage#getShipment_CourierName()
	 * @model required="true"
	 * @generated
	 */
	String getCourierName();

	/**
	 * Sets the value of the '{@link Ecommerce.Shipment#getCourierName <em>Courier Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courier Name</em>' attribute.
	 * @see #getCourierName()
	 * @generated
	 */
	void setCourierName(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(float)
	 * @see Ecommerce.EcommercePackage#getShipment_Cost()
	 * @model required="true"
	 * @generated
	 */
	float getCost();

	/**
	 * Sets the value of the '{@link Ecommerce.Shipment#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(float value);

	/**
	 * Returns the value of the '<em><b>Estimated Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Delivery</em>' attribute.
	 * @see #setEstimatedDelivery(Date)
	 * @see Ecommerce.EcommercePackage#getShipment_EstimatedDelivery()
	 * @model required="true"
	 * @generated
	 */
	Date getEstimatedDelivery();

	/**
	 * Sets the value of the '{@link Ecommerce.Shipment#getEstimatedDelivery <em>Estimated Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Delivery</em>' attribute.
	 * @see #getEstimatedDelivery()
	 * @generated
	 */
	void setEstimatedDelivery(Date value);

} // Shipment

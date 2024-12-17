/**
 */
package Ecommerce;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Order#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.Order#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link Ecommerce.Order#getOrderStatus <em>Order Status</em>}</li>
 *   <li>{@link Ecommerce.Order#getPaymentDetail <em>Payment Detail</em>}</li>
 *   <li>{@link Ecommerce.Order#getShipmentDetail <em>Shipment Detail</em>}</li>
 *   <li>{@link Ecommerce.Order#getOrderItems <em>Order Items</em>}</li>
 *   <li>{@link Ecommerce.Order#getTotalAmount <em>Total Amount</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getOrder_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.Order#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(Date)
	 * @see Ecommerce.EcommercePackage#getOrder_OrderDate()
	 * @model required="true"
	 * @generated
	 */
	Date getOrderDate();

	/**
	 * Sets the value of the '{@link Ecommerce.Order#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(Date value);

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #setTotalAmount(float)
	 * @see Ecommerce.EcommercePackage#getOrder_TotalAmount()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	float getTotalAmount();

	/**
	 * Sets the value of the '{@link Ecommerce.Order#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='orderItems-&gt;collect(\n        \tquantity * product.price * (if product.appliedPromotions-&gt;isEmpty() then 0 else product.appliedPromotions-&gt;collect(discountPercentage / 100)-&gt;max() endif))-&gt;sum()'"
	 * @generated
	 */
	float getTotalDiscount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='totalAmount &gt;= 100.0'"
	 * @generated
	 */
	boolean isEligibleForFreeShipping();

	/**
	 * Returns the value of the '<em><b>Order Status</b></em>' attribute.
	 * The literals are from the enumeration {@link Ecommerce.OrderStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Status</em>' attribute.
	 * @see Ecommerce.OrderStatus
	 * @see #setOrderStatus(OrderStatus)
	 * @see Ecommerce.EcommercePackage#getOrder_OrderStatus()
	 * @model required="true"
	 * @generated
	 */
	OrderStatus getOrderStatus();

	/**
	 * Sets the value of the '{@link Ecommerce.Order#getOrderStatus <em>Order Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Status</em>' attribute.
	 * @see Ecommerce.OrderStatus
	 * @see #getOrderStatus()
	 * @generated
	 */
	void setOrderStatus(OrderStatus value);

	/**
	 * Returns the value of the '<em><b>Payment Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Detail</em>' containment reference.
	 * @see #setPaymentDetail(Payment)
	 * @see Ecommerce.EcommercePackage#getOrder_PaymentDetail()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Payment getPaymentDetail();

	/**
	 * Sets the value of the '{@link Ecommerce.Order#getPaymentDetail <em>Payment Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Detail</em>' containment reference.
	 * @see #getPaymentDetail()
	 * @generated
	 */
	void setPaymentDetail(Payment value);

	/**
	 * Returns the value of the '<em><b>Shipment Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipment Detail</em>' containment reference.
	 * @see #setShipmentDetail(Shipment)
	 * @see Ecommerce.EcommercePackage#getOrder_ShipmentDetail()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Shipment getShipmentDetail();

	/**
	 * Sets the value of the '{@link Ecommerce.Order#getShipmentDetail <em>Shipment Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipment Detail</em>' containment reference.
	 * @see #getShipmentDetail()
	 * @generated
	 */
	void setShipmentDetail(Shipment value);

	/**
	 * Returns the value of the '<em><b>Order Items</b></em>' containment reference list.
	 * The list contents are of type {@link Ecommerce.OrderLineItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Items</em>' containment reference list.
	 * @see Ecommerce.EcommercePackage#getOrder_OrderItems()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OrderLineItem> getOrderItems();

} // Order

/**
 */
package Ecommerce;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Payment#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.Payment#getAmount <em>Amount</em>}</li>
 *   <li>{@link Ecommerce.Payment#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link Ecommerce.Payment#getPaidUsing <em>Paid Using</em>}</li>
 *   <li>{@link Ecommerce.Payment#getPaymentStatus <em>Payment Status</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getPayment()
 * @model
 * @generated
 */
public interface Payment extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getPayment_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.Payment#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see Ecommerce.EcommercePackage#getPayment_Amount()
	 * @model required="true"
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link Ecommerce.Payment#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Date</em>' attribute.
	 * @see #setPaymentDate(Date)
	 * @see Ecommerce.EcommercePackage#getPayment_PaymentDate()
	 * @model required="true"
	 * @generated
	 */
	Date getPaymentDate();

	/**
	 * Sets the value of the '{@link Ecommerce.Payment#getPaymentDate <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' attribute.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Paid Using</b></em>' attribute.
	 * The literals are from the enumeration {@link Ecommerce.PaymentMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid Using</em>' attribute.
	 * @see Ecommerce.PaymentMethod
	 * @see #setPaidUsing(PaymentMethod)
	 * @see Ecommerce.EcommercePackage#getPayment_PaidUsing()
	 * @model required="true"
	 * @generated
	 */
	PaymentMethod getPaidUsing();

	/**
	 * Sets the value of the '{@link Ecommerce.Payment#getPaidUsing <em>Paid Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Using</em>' attribute.
	 * @see Ecommerce.PaymentMethod
	 * @see #getPaidUsing()
	 * @generated
	 */
	void setPaidUsing(PaymentMethod value);

	/**
	 * Returns the value of the '<em><b>Payment Status</b></em>' attribute.
	 * The literals are from the enumeration {@link Ecommerce.PaymentStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Status</em>' attribute.
	 * @see Ecommerce.PaymentStatus
	 * @see #setPaymentStatus(PaymentStatus)
	 * @see Ecommerce.EcommercePackage#getPayment_PaymentStatus()
	 * @model required="true"
	 * @generated
	 */
	PaymentStatus getPaymentStatus();

	/**
	 * Sets the value of the '{@link Ecommerce.Payment#getPaymentStatus <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Status</em>' attribute.
	 * @see Ecommerce.PaymentStatus
	 * @see #getPaymentStatus()
	 * @generated
	 */
	void setPaymentStatus(PaymentStatus value);

} // Payment

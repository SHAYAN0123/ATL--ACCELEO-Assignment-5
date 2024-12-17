/**
 */
package Ecommerce;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Customer#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.Customer#getEmail <em>Email</em>}</li>
 *   <li>{@link Ecommerce.Customer#getDateJoined <em>Date Joined</em>}</li>
 *   <li>{@link Ecommerce.Customer#getCart <em>Cart</em>}</li>
 *   <li>{@link Ecommerce.Customer#getOrders <em>Orders</em>}</li>
 *   <li>{@link Ecommerce.Customer#getReviews <em>Reviews</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getCustomer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validEmail'"
 * @generated
 */
public interface Customer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getCustomer_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.Customer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see Ecommerce.EcommercePackage#getCustomer_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link Ecommerce.Customer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Date Joined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Joined</em>' attribute.
	 * @see #setDateJoined(Date)
	 * @see Ecommerce.EcommercePackage#getCustomer_DateJoined()
	 * @model
	 * @generated
	 */
	Date getDateJoined();

	/**
	 * Sets the value of the '{@link Ecommerce.Customer#getDateJoined <em>Date Joined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Joined</em>' attribute.
	 * @see #getDateJoined()
	 * @generated
	 */
	void setDateJoined(Date value);

	/**
	 * Returns the value of the '<em><b>Cart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart</em>' containment reference.
	 * @see #setCart(Cart)
	 * @see Ecommerce.EcommercePackage#getCustomer_Cart()
	 * @model containment="true"
	 * @generated
	 */
	Cart getCart();

	/**
	 * Sets the value of the '{@link Ecommerce.Customer#getCart <em>Cart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cart</em>' containment reference.
	 * @see #getCart()
	 * @generated
	 */
	void setCart(Cart value);

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' reference list.
	 * The list contents are of type {@link Ecommerce.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' reference list.
	 * @see Ecommerce.EcommercePackage#getCustomer_Orders()
	 * @model
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Reviews</b></em>' containment reference list.
	 * The list contents are of type {@link Ecommerce.Review}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviews</em>' containment reference list.
	 * @see Ecommerce.EcommercePackage#getCustomer_Reviews()
	 * @model containment="true"
	 * @generated
	 */
	EList<Review> getReviews();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='orders-&gt;size()'"
	 * @generated
	 */
	int getTotalOrders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \temail.matches(\'^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,}$\')'"
	 * @generated
	 */
	boolean validEmail(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Customer

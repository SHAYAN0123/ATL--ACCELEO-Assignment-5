/**
 */
package Ecommerce;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Cart#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.Cart#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link Ecommerce.Cart#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link Ecommerce.Cart#getCartContents <em>Cart Contents</em>}</li>
 *   <li>{@link Ecommerce.Cart#getCartTotal <em>Cart Total</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getCart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonEmptyCart'"
 * @generated
 */
public interface Cart extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getCart_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.Cart#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see Ecommerce.EcommercePackage#getCart_CreationDate()
	 * @model required="true"
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link Ecommerce.Cart#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Updated</em>' attribute.
	 * @see #setLastUpdated(Date)
	 * @see Ecommerce.EcommercePackage#getCart_LastUpdated()
	 * @model required="true"
	 * @generated
	 */
	Date getLastUpdated();

	/**
	 * Sets the value of the '{@link Ecommerce.Cart#getLastUpdated <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' attribute.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(Date value);

	/**
	 * Returns the value of the '<em><b>Cart Contents</b></em>' containment reference list.
	 * The list contents are of type {@link Ecommerce.CartContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart Contents</em>' containment reference list.
	 * @see Ecommerce.EcommercePackage#getCart_CartContents()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CartContent> getCartContents();

	/**
	 * Returns the value of the '<em><b>Cart Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cart Total</em>' attribute.
	 * @see #setCartTotal(float)
	 * @see Ecommerce.EcommercePackage#getCart_CartTotal()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	float getCartTotal();

	/**
	 * Sets the value of the '{@link Ecommerce.Cart#getCartTotal <em>Cart Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cart Total</em>' attribute.
	 * @see #getCartTotal()
	 * @generated
	 */
	void setCartTotal(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tcartContents-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean nonEmptyCart(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Cart

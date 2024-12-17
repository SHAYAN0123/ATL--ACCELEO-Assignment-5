/**
 */
package Ecommerce;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cart Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.CartContent#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.CartContent#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link Ecommerce.CartContent#getProducts <em>Products</em>}</li>
 *   <li>{@link Ecommerce.CartContent#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getCartContent()
 * @model
 * @generated
 */
public interface CartContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getCartContent_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.CartContent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see Ecommerce.EcommercePackage#getCartContent_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link Ecommerce.CartContent#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see Ecommerce.EcommercePackage#getCartContent_Price()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link Ecommerce.CartContent#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference.
	 * @see #setProducts(Product)
	 * @see Ecommerce.EcommercePackage#getCartContent_Products()
	 * @model required="true"
	 * @generated
	 */
	Product getProducts();

	/**
	 * Sets the value of the '{@link Ecommerce.CartContent#getProducts <em>Products</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Products</em>' reference.
	 * @see #getProducts()
	 * @generated
	 */
	void setProducts(Product value);

} // CartContent

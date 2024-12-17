/**
 */
package Ecommerce;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.EcommercePlatform#getCustomers <em>Customers</em>}</li>
 *   <li>{@link Ecommerce.EcommercePlatform#getProducts <em>Products</em>}</li>
 *   <li>{@link Ecommerce.EcommercePlatform#getProductCategories <em>Product Categories</em>}</li>
 *   <li>{@link Ecommerce.EcommercePlatform#getUrl <em>Url</em>}</li>
 *   <li>{@link Ecommerce.EcommercePlatform#getDescription <em>Description</em>}</li>
 *   <li>{@link Ecommerce.EcommercePlatform#getOrders <em>Orders</em>}</li>
 *   <li>{@link Ecommerce.EcommercePlatform#getPromotions <em>Promotions</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getEcommercePlatform()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueIDs'"
 * @generated
 */
public interface EcommercePlatform extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link Ecommerce.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see Ecommerce.EcommercePackage#getEcommercePlatform_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link Ecommerce.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see Ecommerce.EcommercePackage#getEcommercePlatform_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Product Categories</b></em>' containment reference list.
	 * The list contents are of type {@link Ecommerce.ProductCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Categories</em>' containment reference list.
	 * @see Ecommerce.EcommercePackage#getEcommercePlatform_ProductCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductCategory> getProductCategories();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see Ecommerce.EcommercePackage#getEcommercePlatform_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link Ecommerce.EcommercePlatform#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Ecommerce.EcommercePackage#getEcommercePlatform_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Ecommerce.EcommercePlatform#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link Ecommerce.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see Ecommerce.EcommercePackage#getEcommercePlatform_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Promotions</b></em>' containment reference list.
	 * The list contents are of type {@link Ecommerce.Promotion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promotions</em>' containment reference list.
	 * @see Ecommerce.EcommercePackage#getEcommercePlatform_Promotions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Promotion> getPromotions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if orders-&gt;notEmpty() then orders-&gt;collect(totalAmount)-&gt;sum() / orders-&gt;size() else 0.0 endif'"
	 * @generated
	 */
	float getAverageOrderValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tcustomers-&gt;forAll(c1, c2 | c1 &lt;&gt; c2 implies c1.email &lt;&gt; c2.email)'"
	 * @generated
	 */
	boolean uniqueCustomerEmails(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \tcustomers-&gt;forAll(c1, c2 | c1 &lt;&gt; c2 implies c1.id &lt;&gt; c2.id) and\n    \tproducts-&gt;forAll(p1, p2 | p1 &lt;&gt; p2 implies p1.id &lt;&gt; p2.id) and\n    \torders-&gt;forAll(o1, o2 | o1 &lt;&gt; o2 implies o1.id &lt;&gt; o2.id) and\n    \tpromotions-&gt;forAll(pr1, pr2 | pr1 &lt;&gt; pr2 implies pr1.id &lt;&gt; pr2.id)'"
	 * @generated
	 */
	boolean uniqueIDs(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EcommercePlatform

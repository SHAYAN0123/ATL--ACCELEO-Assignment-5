/**
 */
package Ecommerce;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.ProductCategory#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.ProductCategory#getDescription <em>Description</em>}</li>
 *   <li>{@link Ecommerce.ProductCategory#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getProductCategory()
 * @model
 * @generated
 */
public interface ProductCategory extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getProductCategory_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.ProductCategory#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Ecommerce.EcommercePackage#getProductCategory_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Ecommerce.ProductCategory#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' reference list.
	 * The list contents are of type {@link Ecommerce.Product}.
	 * It is bidirectional and its opposite is '{@link Ecommerce.Product#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' reference list.
	 * @see Ecommerce.EcommercePackage#getProductCategory_Products()
	 * @see Ecommerce.Product#getProductCategory
	 * @model opposite="productCategory"
	 * @generated
	 */
	EList<Product> getProducts();

} // ProductCategory

/**
 */
package Ecommerce;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Product#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link Ecommerce.Product#getPrice <em>Price</em>}</li>
 *   <li>{@link Ecommerce.Product#getStockQuantity <em>Stock Quantity</em>}</li>
 *   <li>{@link Ecommerce.Product#getDateAdded <em>Date Added</em>}</li>
 *   <li>{@link Ecommerce.Product#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link Ecommerce.Product#getAppliedPromotions <em>Applied Promotions</em>}</li>
 *   <li>{@link Ecommerce.Product#getProductReviews <em>Product Reviews</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getProduct_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.Product#getId <em>Id</em>}' attribute.
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
	 * @see Ecommerce.EcommercePackage#getProduct_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Ecommerce.Product#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see Ecommerce.EcommercePackage#getProduct_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link Ecommerce.Product#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Stock Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock Quantity</em>' attribute.
	 * @see #setStockQuantity(int)
	 * @see Ecommerce.EcommercePackage#getProduct_StockQuantity()
	 * @model required="true"
	 * @generated
	 */
	int getStockQuantity();

	/**
	 * Sets the value of the '{@link Ecommerce.Product#getStockQuantity <em>Stock Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock Quantity</em>' attribute.
	 * @see #getStockQuantity()
	 * @generated
	 */
	void setStockQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Date Added</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Added</em>' attribute.
	 * @see #setDateAdded(Date)
	 * @see Ecommerce.EcommercePackage#getProduct_DateAdded()
	 * @model required="true"
	 * @generated
	 */
	Date getDateAdded();

	/**
	 * Sets the value of the '{@link Ecommerce.Product#getDateAdded <em>Date Added</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Added</em>' attribute.
	 * @see #getDateAdded()
	 * @generated
	 */
	void setDateAdded(Date value);

	/**
	 * Returns the value of the '<em><b>Product Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Ecommerce.ProductCategory#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Category</em>' reference.
	 * @see #setProductCategory(ProductCategory)
	 * @see Ecommerce.EcommercePackage#getProduct_ProductCategory()
	 * @see Ecommerce.ProductCategory#getProducts
	 * @model opposite="products" required="true"
	 * @generated
	 */
	ProductCategory getProductCategory();

	/**
	 * Sets the value of the '{@link Ecommerce.Product#getProductCategory <em>Product Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Category</em>' reference.
	 * @see #getProductCategory()
	 * @generated
	 */
	void setProductCategory(ProductCategory value);

	/**
	 * Returns the value of the '<em><b>Applied Promotions</b></em>' reference list.
	 * The list contents are of type {@link Ecommerce.Promotion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Promotions</em>' reference list.
	 * @see Ecommerce.EcommercePackage#getProduct_AppliedPromotions()
	 * @model
	 * @generated
	 */
	EList<Promotion> getAppliedPromotions();

	/**
	 * Returns the value of the '<em><b>Product Reviews</b></em>' reference list.
	 * The list contents are of type {@link Ecommerce.Review}.
	 * It is bidirectional and its opposite is '{@link Ecommerce.Review#getReviewedProduct <em>Reviewed Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Reviews</em>' reference list.
	 * @see Ecommerce.EcommercePackage#getProduct_ProductReviews()
	 * @see Ecommerce.Review#getReviewedProduct
	 * @model opposite="reviewedProduct"
	 * @generated
	 */
	EList<Review> getProductReviews();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if productReviews-&gt;isEmpty() then\n            \t    0\n            \telse\n                \tproductReviews-&gt;collect(ratings)-&gt;sum() / productReviews-&gt;collect(ratings)-&gt;size()\n            \tendif'"
	 * @generated
	 */
	float getAverageRatings();

} // Product

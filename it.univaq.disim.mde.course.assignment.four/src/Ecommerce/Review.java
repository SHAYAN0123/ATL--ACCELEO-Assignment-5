/**
 */
package Ecommerce;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Review#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.Review#getRatings <em>Ratings</em>}</li>
 *   <li>{@link Ecommerce.Review#getComment <em>Comment</em>}</li>
 *   <li>{@link Ecommerce.Review#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link Ecommerce.Review#getReviewedProduct <em>Reviewed Product</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getReview()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validRatings'"
 * @generated
 */
public interface Review extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getReview_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.Review#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Ratings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratings</em>' attribute.
	 * @see #setRatings(int)
	 * @see Ecommerce.EcommercePackage#getReview_Ratings()
	 * @model required="true"
	 * @generated
	 */
	int getRatings();

	/**
	 * Sets the value of the '{@link Ecommerce.Review#getRatings <em>Ratings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratings</em>' attribute.
	 * @see #getRatings()
	 * @generated
	 */
	void setRatings(int value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see Ecommerce.EcommercePackage#getReview_Comment()
	 * @model required="true"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link Ecommerce.Review#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Review Date</em>' attribute.
	 * @see #setReviewDate(Date)
	 * @see Ecommerce.EcommercePackage#getReview_ReviewDate()
	 * @model required="true"
	 * @generated
	 */
	Date getReviewDate();

	/**
	 * Sets the value of the '{@link Ecommerce.Review#getReviewDate <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Date</em>' attribute.
	 * @see #getReviewDate()
	 * @generated
	 */
	void setReviewDate(Date value);

	/**
	 * Returns the value of the '<em><b>Reviewed Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Ecommerce.Product#getProductReviews <em>Product Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewed Product</em>' reference.
	 * @see #setReviewedProduct(Product)
	 * @see Ecommerce.EcommercePackage#getReview_ReviewedProduct()
	 * @see Ecommerce.Product#getProductReviews
	 * @model opposite="productReviews" required="true"
	 * @generated
	 */
	Product getReviewedProduct();

	/**
	 * Sets the value of the '{@link Ecommerce.Review#getReviewedProduct <em>Reviewed Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reviewed Product</em>' reference.
	 * @see #getReviewedProduct()
	 * @generated
	 */
	void setReviewedProduct(Product value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tratings &gt;= 1 and ratings &lt;= 5'"
	 * @generated
	 */
	boolean validRatings(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Review

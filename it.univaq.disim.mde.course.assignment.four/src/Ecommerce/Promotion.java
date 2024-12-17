/**
 */
package Ecommerce;

import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Promotion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.Promotion#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.Promotion#getDescription <em>Description</em>}</li>
 *   <li>{@link Ecommerce.Promotion#getDiscountPercentage <em>Discount Percentage</em>}</li>
 *   <li>{@link Ecommerce.Promotion#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Ecommerce.Promotion#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @see Ecommerce.EcommercePackage#getPromotion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validDiscount'"
 * @generated
 */
public interface Promotion extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see Ecommerce.EcommercePackage#getPromotion_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Ecommerce.Promotion#getId <em>Id</em>}' attribute.
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
	 * @see Ecommerce.EcommercePackage#getPromotion_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Ecommerce.Promotion#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Discount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount Percentage</em>' attribute.
	 * @see #setDiscountPercentage(int)
	 * @see Ecommerce.EcommercePackage#getPromotion_DiscountPercentage()
	 * @model required="true"
	 * @generated
	 */
	int getDiscountPercentage();

	/**
	 * Sets the value of the '{@link Ecommerce.Promotion#getDiscountPercentage <em>Discount Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount Percentage</em>' attribute.
	 * @see #getDiscountPercentage()
	 * @generated
	 */
	void setDiscountPercentage(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see Ecommerce.EcommercePackage#getPromotion_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link Ecommerce.Promotion#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see Ecommerce.EcommercePackage#getPromotion_EndDate()
	 * @model required="true"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link Ecommerce.Promotion#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tstartDate &lt; endDate'"
	 * @generated
	 */
	boolean validPromotionDates(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n    \t\tdiscountPercentage &gt;= 0 and discountPercentage &lt;= 100'"
	 * @generated
	 */
	boolean validDiscount(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Promotion

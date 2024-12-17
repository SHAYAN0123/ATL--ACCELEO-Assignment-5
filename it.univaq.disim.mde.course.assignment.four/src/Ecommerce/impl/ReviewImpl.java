/**
 */
package Ecommerce.impl;

import Ecommerce.EcommercePackage;
import Ecommerce.EcommerceTables;
import Ecommerce.Product;
import Ecommerce.Review;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.ReviewImpl#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.impl.ReviewImpl#getRatings <em>Ratings</em>}</li>
 *   <li>{@link Ecommerce.impl.ReviewImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link Ecommerce.impl.ReviewImpl#getReviewDate <em>Review Date</em>}</li>
 *   <li>{@link Ecommerce.impl.ReviewImpl#getReviewedProduct <em>Reviewed Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReviewImpl extends MinimalEObjectImpl.Container implements Review {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatings() <em>Ratings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected static final int RATINGS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRatings() <em>Ratings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected int ratings = RATINGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date REVIEW_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReviewDate() <em>Review Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewDate()
	 * @generated
	 * @ordered
	 */
	protected Date reviewDate = REVIEW_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReviewedProduct() <em>Reviewed Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewedProduct()
	 * @generated
	 * @ordered
	 */
	protected Product reviewedProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.REVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.REVIEW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRatings() {
		return ratings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRatings(int newRatings) {
		int oldRatings = ratings;
		ratings = newRatings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.REVIEW__RATINGS, oldRatings, ratings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.REVIEW__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getReviewDate() {
		return reviewDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewDate(Date newReviewDate) {
		Date oldReviewDate = reviewDate;
		reviewDate = newReviewDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.REVIEW__REVIEW_DATE, oldReviewDate, reviewDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getReviewedProduct() {
		if (reviewedProduct != null && reviewedProduct.eIsProxy()) {
			InternalEObject oldReviewedProduct = (InternalEObject)reviewedProduct;
			reviewedProduct = (Product)eResolveProxy(oldReviewedProduct);
			if (reviewedProduct != oldReviewedProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcommercePackage.REVIEW__REVIEWED_PRODUCT, oldReviewedProduct, reviewedProduct));
			}
		}
		return reviewedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetReviewedProduct() {
		return reviewedProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReviewedProduct(Product newReviewedProduct, NotificationChain msgs) {
		Product oldReviewedProduct = reviewedProduct;
		reviewedProduct = newReviewedProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcommercePackage.REVIEW__REVIEWED_PRODUCT, oldReviewedProduct, newReviewedProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReviewedProduct(Product newReviewedProduct) {
		if (newReviewedProduct != reviewedProduct) {
			NotificationChain msgs = null;
			if (reviewedProduct != null)
				msgs = ((InternalEObject)reviewedProduct).eInverseRemove(this, EcommercePackage.PRODUCT__PRODUCT_REVIEWS, Product.class, msgs);
			if (newReviewedProduct != null)
				msgs = ((InternalEObject)newReviewedProduct).eInverseAdd(this, EcommercePackage.PRODUCT__PRODUCT_REVIEWS, Product.class, msgs);
			msgs = basicSetReviewedProduct(newReviewedProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.REVIEW__REVIEWED_PRODUCT, newReviewedProduct, newReviewedProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validRatings(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Review::validRatings";
		try {
			/**
			 *
			 * inv validRatings:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = ratings >= 1 and ratings <= 5
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EcommercePackage.Literals.REVIEW___VALID_RATINGS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EcommerceTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ int ratings_0 = this.getRatings();
				final /*@NonInvalid*/ IntegerValue BOXED_ratings_0 = ValueUtil.integerValueOf(ratings_0);
				final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_ratings_0, EcommerceTables.INT_1).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!ge) {
					result = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_ratings_0, EcommerceTables.INT_5).booleanValue();
					if (!le_0) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = ValueUtil.TRUE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, EcommerceTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.REVIEW__REVIEWED_PRODUCT:
				if (reviewedProduct != null)
					msgs = ((InternalEObject)reviewedProduct).eInverseRemove(this, EcommercePackage.PRODUCT__PRODUCT_REVIEWS, Product.class, msgs);
				return basicSetReviewedProduct((Product)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.REVIEW__REVIEWED_PRODUCT:
				return basicSetReviewedProduct(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcommercePackage.REVIEW__ID:
				return getId();
			case EcommercePackage.REVIEW__RATINGS:
				return getRatings();
			case EcommercePackage.REVIEW__COMMENT:
				return getComment();
			case EcommercePackage.REVIEW__REVIEW_DATE:
				return getReviewDate();
			case EcommercePackage.REVIEW__REVIEWED_PRODUCT:
				if (resolve) return getReviewedProduct();
				return basicGetReviewedProduct();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcommercePackage.REVIEW__ID:
				setId((Integer)newValue);
				return;
			case EcommercePackage.REVIEW__RATINGS:
				setRatings((Integer)newValue);
				return;
			case EcommercePackage.REVIEW__COMMENT:
				setComment((String)newValue);
				return;
			case EcommercePackage.REVIEW__REVIEW_DATE:
				setReviewDate((Date)newValue);
				return;
			case EcommercePackage.REVIEW__REVIEWED_PRODUCT:
				setReviewedProduct((Product)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcommercePackage.REVIEW__ID:
				setId(ID_EDEFAULT);
				return;
			case EcommercePackage.REVIEW__RATINGS:
				setRatings(RATINGS_EDEFAULT);
				return;
			case EcommercePackage.REVIEW__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case EcommercePackage.REVIEW__REVIEW_DATE:
				setReviewDate(REVIEW_DATE_EDEFAULT);
				return;
			case EcommercePackage.REVIEW__REVIEWED_PRODUCT:
				setReviewedProduct((Product)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcommercePackage.REVIEW__ID:
				return id != ID_EDEFAULT;
			case EcommercePackage.REVIEW__RATINGS:
				return ratings != RATINGS_EDEFAULT;
			case EcommercePackage.REVIEW__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case EcommercePackage.REVIEW__REVIEW_DATE:
				return REVIEW_DATE_EDEFAULT == null ? reviewDate != null : !REVIEW_DATE_EDEFAULT.equals(reviewDate);
			case EcommercePackage.REVIEW__REVIEWED_PRODUCT:
				return reviewedProduct != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcommercePackage.REVIEW___VALID_RATINGS__DIAGNOSTICCHAIN_MAP:
				return validRatings((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", ratings: ");
		result.append(ratings);
		result.append(", comment: ");
		result.append(comment);
		result.append(", reviewDate: ");
		result.append(reviewDate);
		result.append(')');
		return result.toString();
	}

} //ReviewImpl

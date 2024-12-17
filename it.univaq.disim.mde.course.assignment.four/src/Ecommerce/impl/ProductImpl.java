/**
 */
package Ecommerce.impl;

import Ecommerce.EcommercePackage;
import Ecommerce.EcommerceTables;
import Ecommerce.Product;
import Ecommerce.ProductCategory;
import Ecommerce.Promotion;

import Ecommerce.Review;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.ProductImpl#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getStockQuantity <em>Stock Quantity</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getDateAdded <em>Date Added</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getProductCategory <em>Product Category</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getAppliedPromotions <em>Applied Promotions</em>}</li>
 *   <li>{@link Ecommerce.impl.ProductImpl#getProductReviews <em>Product Reviews</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends NamedElementImpl implements Product {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStockQuantity() <em>Stock Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int STOCK_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStockQuantity() <em>Stock Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockQuantity()
	 * @generated
	 * @ordered
	 */
	protected int stockQuantity = STOCK_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateAdded() <em>Date Added</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAdded()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ADDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAdded() <em>Date Added</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAdded()
	 * @generated
	 * @ordered
	 */
	protected Date dateAdded = DATE_ADDED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProductCategory() <em>Product Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategory()
	 * @generated
	 * @ordered
	 */
	protected ProductCategory productCategory;

	/**
	 * The cached value of the '{@link #getAppliedPromotions() <em>Applied Promotions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPromotions()
	 * @generated
	 * @ordered
	 */
	protected EList<Promotion> appliedPromotions;

	/**
	 * The cached value of the '{@link #getProductReviews() <em>Product Reviews</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductReviews()
	 * @generated
	 * @ordered
	 */
	protected EList<Review> productReviews;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.PRODUCT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStockQuantity() {
		return stockQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStockQuantity(int newStockQuantity) {
		int oldStockQuantity = stockQuantity;
		stockQuantity = newStockQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__STOCK_QUANTITY, oldStockQuantity, stockQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateAdded() {
		return dateAdded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateAdded(Date newDateAdded) {
		Date oldDateAdded = dateAdded;
		dateAdded = newDateAdded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__DATE_ADDED, oldDateAdded, dateAdded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductCategory getProductCategory() {
		if (productCategory != null && productCategory.eIsProxy()) {
			InternalEObject oldProductCategory = (InternalEObject)productCategory;
			productCategory = (ProductCategory)eResolveProxy(oldProductCategory);
			if (productCategory != oldProductCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcommercePackage.PRODUCT__PRODUCT_CATEGORY, oldProductCategory, productCategory));
			}
		}
		return productCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCategory basicGetProductCategory() {
		return productCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductCategory(ProductCategory newProductCategory, NotificationChain msgs) {
		ProductCategory oldProductCategory = productCategory;
		productCategory = newProductCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__PRODUCT_CATEGORY, oldProductCategory, newProductCategory);
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
	public void setProductCategory(ProductCategory newProductCategory) {
		if (newProductCategory != productCategory) {
			NotificationChain msgs = null;
			if (productCategory != null)
				msgs = ((InternalEObject)productCategory).eInverseRemove(this, EcommercePackage.PRODUCT_CATEGORY__PRODUCTS, ProductCategory.class, msgs);
			if (newProductCategory != null)
				msgs = ((InternalEObject)newProductCategory).eInverseAdd(this, EcommercePackage.PRODUCT_CATEGORY__PRODUCTS, ProductCategory.class, msgs);
			msgs = basicSetProductCategory(newProductCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PRODUCT__PRODUCT_CATEGORY, newProductCategory, newProductCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Promotion> getAppliedPromotions() {
		if (appliedPromotions == null) {
			appliedPromotions = new EObjectResolvingEList<Promotion>(Promotion.class, this, EcommercePackage.PRODUCT__APPLIED_PROMOTIONS);
		}
		return appliedPromotions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Review> getProductReviews() {
		if (productReviews == null) {
			productReviews = new EObjectWithInverseResolvingEList<Review>(Review.class, this, EcommercePackage.PRODUCT__PRODUCT_REVIEWS, EcommercePackage.REVIEW__REVIEWED_PRODUCT);
		}
		return productReviews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAverageRatings() {
		/**
		 *
		 * if productReviews->isEmpty()
		 * then 0
		 * else
		 *   productReviews->collect(ratings)
		 *   ->sum() /
		 *   productReviews->collect(ratings)
		 *   ->size()
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Review> productReviews = this.getProductReviews();
		final /*@NonInvalid*/ OrderedSetValue BOXED_productReviews = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Review, productReviews);
		final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_productReviews).booleanValue();
		/*@Thrown*/ RealValue local_0;
		if (isEmpty) {
			local_0 = EcommerceTables.INT_0;
		}
		else {
			/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(EcommerceTables.SEQ_DATAid_EInt);
			Iterator<Object> ITERATOR__1_0 = BOXED_productReviews.iterator();
			/*@NonInvalid*/ SequenceValue collect_0;
			while (true) {
				if (!ITERATOR__1_0.hasNext()) {
					collect_0 = accumulator;
					break;
				}
				/*@NonInvalid*/ Review _1_0 = (Review)ITERATOR__1_0.next();
				/**
				 * ratings
				 */
				final /*@NonInvalid*/ int ratings_0 = _1_0.getRatings();
				final /*@NonInvalid*/ IntegerValue BOXED_ratings_0 = ValueUtil.integerValueOf(ratings_0);
				//
				accumulator.add(BOXED_ratings_0);
			}
			final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)CollectionSumOperation.INSTANCE.evaluate(executor, EcommerceTables.DATAid_EInt, collect_0);
			final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(collect_0);
			final /*@Thrown*/ RealValue quot = NumericDivideOperation.INSTANCE.evaluate(sum, size);
			local_0 = quot;
		}
		final /*@Thrown*/ float ECORE_local_0 = ValueUtil.floatValueOf(local_0);
		return ECORE_local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.PRODUCT__PRODUCT_CATEGORY:
				if (productCategory != null)
					msgs = ((InternalEObject)productCategory).eInverseRemove(this, EcommercePackage.PRODUCT_CATEGORY__PRODUCTS, ProductCategory.class, msgs);
				return basicSetProductCategory((ProductCategory)otherEnd, msgs);
			case EcommercePackage.PRODUCT__PRODUCT_REVIEWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProductReviews()).basicAdd(otherEnd, msgs);
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
			case EcommercePackage.PRODUCT__PRODUCT_CATEGORY:
				return basicSetProductCategory(null, msgs);
			case EcommercePackage.PRODUCT__PRODUCT_REVIEWS:
				return ((InternalEList<?>)getProductReviews()).basicRemove(otherEnd, msgs);
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
			case EcommercePackage.PRODUCT__ID:
				return getId();
			case EcommercePackage.PRODUCT__DESCRIPTION:
				return getDescription();
			case EcommercePackage.PRODUCT__PRICE:
				return getPrice();
			case EcommercePackage.PRODUCT__STOCK_QUANTITY:
				return getStockQuantity();
			case EcommercePackage.PRODUCT__DATE_ADDED:
				return getDateAdded();
			case EcommercePackage.PRODUCT__PRODUCT_CATEGORY:
				if (resolve) return getProductCategory();
				return basicGetProductCategory();
			case EcommercePackage.PRODUCT__APPLIED_PROMOTIONS:
				return getAppliedPromotions();
			case EcommercePackage.PRODUCT__PRODUCT_REVIEWS:
				return getProductReviews();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcommercePackage.PRODUCT__ID:
				setId((Integer)newValue);
				return;
			case EcommercePackage.PRODUCT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EcommercePackage.PRODUCT__PRICE:
				setPrice((Float)newValue);
				return;
			case EcommercePackage.PRODUCT__STOCK_QUANTITY:
				setStockQuantity((Integer)newValue);
				return;
			case EcommercePackage.PRODUCT__DATE_ADDED:
				setDateAdded((Date)newValue);
				return;
			case EcommercePackage.PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((ProductCategory)newValue);
				return;
			case EcommercePackage.PRODUCT__APPLIED_PROMOTIONS:
				getAppliedPromotions().clear();
				getAppliedPromotions().addAll((Collection<? extends Promotion>)newValue);
				return;
			case EcommercePackage.PRODUCT__PRODUCT_REVIEWS:
				getProductReviews().clear();
				getProductReviews().addAll((Collection<? extends Review>)newValue);
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
			case EcommercePackage.PRODUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__STOCK_QUANTITY:
				setStockQuantity(STOCK_QUANTITY_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__DATE_ADDED:
				setDateAdded(DATE_ADDED_EDEFAULT);
				return;
			case EcommercePackage.PRODUCT__PRODUCT_CATEGORY:
				setProductCategory((ProductCategory)null);
				return;
			case EcommercePackage.PRODUCT__APPLIED_PROMOTIONS:
				getAppliedPromotions().clear();
				return;
			case EcommercePackage.PRODUCT__PRODUCT_REVIEWS:
				getProductReviews().clear();
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
			case EcommercePackage.PRODUCT__ID:
				return id != ID_EDEFAULT;
			case EcommercePackage.PRODUCT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EcommercePackage.PRODUCT__PRICE:
				return price != PRICE_EDEFAULT;
			case EcommercePackage.PRODUCT__STOCK_QUANTITY:
				return stockQuantity != STOCK_QUANTITY_EDEFAULT;
			case EcommercePackage.PRODUCT__DATE_ADDED:
				return DATE_ADDED_EDEFAULT == null ? dateAdded != null : !DATE_ADDED_EDEFAULT.equals(dateAdded);
			case EcommercePackage.PRODUCT__PRODUCT_CATEGORY:
				return productCategory != null;
			case EcommercePackage.PRODUCT__APPLIED_PROMOTIONS:
				return appliedPromotions != null && !appliedPromotions.isEmpty();
			case EcommercePackage.PRODUCT__PRODUCT_REVIEWS:
				return productReviews != null && !productReviews.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcommercePackage.PRODUCT___GET_AVERAGE_RATINGS:
				return getAverageRatings();
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
		result.append(", description: ");
		result.append(description);
		result.append(", price: ");
		result.append(price);
		result.append(", stockQuantity: ");
		result.append(stockQuantity);
		result.append(", dateAdded: ");
		result.append(dateAdded);
		result.append(')');
		return result.toString();
	}

} //ProductImpl

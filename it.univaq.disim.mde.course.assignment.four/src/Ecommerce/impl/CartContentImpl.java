/**
 */
package Ecommerce.impl;

import Ecommerce.CartContent;
import Ecommerce.EcommercePackage;
import Ecommerce.EcommerceTables;
import Ecommerce.Product;

import Ecommerce.Promotion;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionMaxOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cart Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.CartContentImpl#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.impl.CartContentImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link Ecommerce.impl.CartContentImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link Ecommerce.impl.CartContentImpl#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartContentImpl extends MinimalEObjectImpl.Container implements CartContent {
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
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected Product products;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.CART_CONTENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CART_CONTENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CART_CONTENT__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPrice() {
		/**
		 *
		 * if products.appliedPromotions->isEmpty()
		 * then quantity * products.price
		 * else quantity * products.price *
		 *   (1 -
		 *     products.appliedPromotions->collect(discountPercentage / 100)
		 *     ->max()
		 *   )
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ Product products_0 = this.getProducts();
		final /*@NonInvalid*/ int quantity_0 = this.getQuantity();
		final /*@NonInvalid*/ List<Promotion> appliedPromotions = products_0.getAppliedPromotions();
		final /*@NonInvalid*/ IntegerValue BOXED_quantity_0 = ValueUtil.integerValueOf(quantity_0);
		final /*@NonInvalid*/ float price = products_0.getPrice();
		final /*@NonInvalid*/ RealValue BOXED_price = ValueUtil.realValueOf(price);
		final /*@NonInvalid*/ OrderedSetValue BOXED_appliedPromotions = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Promotion, appliedPromotions);
		final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_appliedPromotions).booleanValue();
		/*@Thrown*/ RealValue local_0;
		if (isEmpty) {
			final /*@NonInvalid*/ RealValue prod = NumericTimesOperation.INSTANCE.evaluate(BOXED_quantity_0, BOXED_price);
			local_0 = prod;
		}
		else {
			/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(EcommerceTables.SEQ_PRIMid_Real);
			Iterator<Object> ITERATOR__1 = BOXED_appliedPromotions.iterator();
			/*@Thrown*/ SequenceValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator;
					break;
				}
				/*@NonInvalid*/ Promotion _1 = (Promotion)ITERATOR__1.next();
				/**
				 * discountPercentage / 100
				 */
				final /*@NonInvalid*/ int discountPercentage = _1.getDiscountPercentage();
				final /*@NonInvalid*/ IntegerValue BOXED_discountPercentage = ValueUtil.integerValueOf(discountPercentage);
				final /*@Thrown*/ RealValue quot = NumericDivideOperation.INSTANCE.evaluate(BOXED_discountPercentage, EcommerceTables.INT_100);
				//
				accumulator.add(quot);
			}
			final /*@Thrown*/ RealValue max = (RealValue)CollectionMaxOperation.INSTANCE.evaluate(collect);
			if (max instanceof InvalidValueException) {
				throw (InvalidValueException)max;
			}
			final /*@Thrown*/ RealValue diff = NumericMinusOperation.INSTANCE.evaluate(EcommerceTables.INT_1, max);
			if (diff instanceof InvalidValueException) {
				throw (InvalidValueException)diff;
			}
			final /*@Thrown*/ RealValue prod_0 = NumericTimesOperation.INSTANCE.evaluate(BOXED_price, diff);
			if (prod_0 instanceof InvalidValueException) {
				throw (InvalidValueException)prod_0;
			}
			final /*@Thrown*/ RealValue prod_1 = NumericTimesOperation.INSTANCE.evaluate(BOXED_quantity_0, prod_0);
			local_0 = prod_1;
		}
		final /*@Thrown*/ float ECORE_local_0 = ValueUtil.floatValueOf(local_0);
		return ECORE_local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(float newPrice) {
		// TODO: implement this method to set the 'Price' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProducts() {
		if (products != null && products.eIsProxy()) {
			InternalEObject oldProducts = (InternalEObject)products;
			products = (Product)eResolveProxy(oldProducts);
			if (products != oldProducts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcommercePackage.CART_CONTENT__PRODUCTS, oldProducts, products));
			}
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProducts() {
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducts(Product newProducts) {
		Product oldProducts = products;
		products = newProducts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CART_CONTENT__PRODUCTS, oldProducts, products));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcommercePackage.CART_CONTENT__ID:
				return getId();
			case EcommercePackage.CART_CONTENT__QUANTITY:
				return getQuantity();
			case EcommercePackage.CART_CONTENT__PRODUCTS:
				if (resolve) return getProducts();
				return basicGetProducts();
			case EcommercePackage.CART_CONTENT__PRICE:
				return getPrice();
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
			case EcommercePackage.CART_CONTENT__ID:
				setId((Integer)newValue);
				return;
			case EcommercePackage.CART_CONTENT__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case EcommercePackage.CART_CONTENT__PRODUCTS:
				setProducts((Product)newValue);
				return;
			case EcommercePackage.CART_CONTENT__PRICE:
				setPrice((Float)newValue);
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
			case EcommercePackage.CART_CONTENT__ID:
				setId(ID_EDEFAULT);
				return;
			case EcommercePackage.CART_CONTENT__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case EcommercePackage.CART_CONTENT__PRODUCTS:
				setProducts((Product)null);
				return;
			case EcommercePackage.CART_CONTENT__PRICE:
				setPrice(PRICE_EDEFAULT);
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
			case EcommercePackage.CART_CONTENT__ID:
				return id != ID_EDEFAULT;
			case EcommercePackage.CART_CONTENT__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case EcommercePackage.CART_CONTENT__PRODUCTS:
				return products != null;
			case EcommercePackage.CART_CONTENT__PRICE:
				return getPrice() != PRICE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //CartContentImpl

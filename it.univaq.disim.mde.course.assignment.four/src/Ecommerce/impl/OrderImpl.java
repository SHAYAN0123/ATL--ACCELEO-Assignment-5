/**
 */
package Ecommerce.impl;

import Ecommerce.EcommercePackage;
import Ecommerce.EcommerceTables;
import Ecommerce.Order;
import Ecommerce.OrderLineItem;
import Ecommerce.OrderStatus;
import Ecommerce.Payment;
import Ecommerce.Product;
import Ecommerce.Promotion;
import Ecommerce.Shipment;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionMaxOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
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
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.OrderImpl#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.impl.OrderImpl#getOrderDate <em>Order Date</em>}</li>
 *   <li>{@link Ecommerce.impl.OrderImpl#getOrderStatus <em>Order Status</em>}</li>
 *   <li>{@link Ecommerce.impl.OrderImpl#getPaymentDetail <em>Payment Detail</em>}</li>
 *   <li>{@link Ecommerce.impl.OrderImpl#getShipmentDetail <em>Shipment Detail</em>}</li>
 *   <li>{@link Ecommerce.impl.OrderImpl#getOrderItems <em>Order Items</em>}</li>
 *   <li>{@link Ecommerce.impl.OrderImpl#getTotalAmount <em>Total Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
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
	 * The default value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORDER_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderDate() <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDate()
	 * @generated
	 * @ordered
	 */
	protected Date orderDate = ORDER_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderStatus() <em>Order Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderStatus()
	 * @generated
	 * @ordered
	 */
	protected static final OrderStatus ORDER_STATUS_EDEFAULT = OrderStatus.PENDING;

	/**
	 * The cached value of the '{@link #getOrderStatus() <em>Order Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderStatus()
	 * @generated
	 * @ordered
	 */
	protected OrderStatus orderStatus = ORDER_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPaymentDetail() <em>Payment Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDetail()
	 * @generated
	 * @ordered
	 */
	protected Payment paymentDetail;

	/**
	 * The cached value of the '{@link #getShipmentDetail() <em>Shipment Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipmentDetail()
	 * @generated
	 * @ordered
	 */
	protected Shipment shipmentDetail;

	/**
	 * The cached value of the '{@link #getOrderItems() <em>Order Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderItems()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderLineItem> orderItems;

	/**
	 * The default value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float TOTAL_AMOUNT_EDEFAULT = 0.0F;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.ORDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderDate(Date newOrderDate) {
		Date oldOrderDate = orderDate;
		orderDate = newOrderDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__ORDER_DATE, oldOrderDate, orderDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalAmount() {
		/**
		 * orderItems->collect(quantity * product.price)->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<OrderLineItem> orderItems = this.getOrderItems();
		final /*@NonInvalid*/ OrderedSetValue BOXED_orderItems = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_OrderLineItem, orderItems);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(EcommerceTables.SEQ_PRIMid_Real);
		Iterator<Object> ITERATOR__1 = BOXED_orderItems.iterator();
		/*@NonInvalid*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ OrderLineItem _1 = (OrderLineItem)ITERATOR__1.next();
			/**
			 * quantity * product.price
			 */
			final /*@NonInvalid*/ int quantity = _1.getQuantity();
			final /*@NonInvalid*/ IntegerValue BOXED_quantity = ValueUtil.integerValueOf(quantity);
			final /*@NonInvalid*/ Product product = _1.getProduct();
			final /*@NonInvalid*/ float price = product.getPrice();
			final /*@NonInvalid*/ RealValue BOXED_price = ValueUtil.realValueOf(price);
			final /*@NonInvalid*/ RealValue prod = NumericTimesOperation.INSTANCE.evaluate(BOXED_quantity, BOXED_price);
			//
			accumulator.add(prod);
		}
		final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, TypeId.REAL, collect);
		final /*@NonInvalid*/ float ECORE_sum = ValueUtil.floatValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalAmount(float newTotalAmount) {
		// TODO: implement this method to set the 'Total Amount' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getTotalDiscount() {
		/**
		 *
		 * orderItems->collect(quantity * product.price *
		 *   if product.appliedPromotions->isEmpty()
		 *   then 0
		 *   else
		 *     product.appliedPromotions->collect(discountPercentage / 100)
		 *     ->max()
		 *   endif)
		 * ->sum()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<OrderLineItem> orderItems = this.getOrderItems();
		final /*@NonInvalid*/ OrderedSetValue BOXED_orderItems = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_OrderLineItem, orderItems);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(EcommerceTables.SEQ_PRIMid_Real);
		Iterator<Object> ITERATOR__1_0 = BOXED_orderItems.iterator();
		/*@Thrown*/ SequenceValue collect;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ OrderLineItem _1_0 = (OrderLineItem)ITERATOR__1_0.next();
			/**
			 * quantity * product.price *
			 * if product.appliedPromotions->isEmpty()
			 * then 0
			 * else
			 *   product.appliedPromotions->collect(discountPercentage / 100)
			 *   ->max()
			 * endif
			 */
			final /*@NonInvalid*/ Product product = _1_0.getProduct();
			final /*@NonInvalid*/ List<Promotion> appliedPromotions = product.getAppliedPromotions();
			final /*@NonInvalid*/ OrderedSetValue BOXED_appliedPromotions = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Promotion, appliedPromotions);
			final /*@NonInvalid*/ int quantity = _1_0.getQuantity();
			final /*@NonInvalid*/ IntegerValue BOXED_quantity = ValueUtil.integerValueOf(quantity);
			final /*@NonInvalid*/ float price = product.getPrice();
			final /*@NonInvalid*/ RealValue BOXED_price = ValueUtil.realValueOf(price);
			final /*@NonInvalid*/ RealValue prod = NumericTimesOperation.INSTANCE.evaluate(BOXED_quantity, BOXED_price);
			final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_appliedPromotions).booleanValue();
			/*@Thrown*/ RealValue local_0;
			if (isEmpty) {
				local_0 = EcommerceTables.INT_0;
			}
			else {
				/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(EcommerceTables.SEQ_PRIMid_Real);
				Iterator<Object> ITERATOR__1 = BOXED_appliedPromotions.iterator();
				/*@Thrown*/ SequenceValue collect_0;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect_0 = accumulator_0;
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
					accumulator_0.add(quot);
				}
				final /*@Thrown*/ RealValue max = (RealValue)CollectionMaxOperation.INSTANCE.evaluate(collect_0);
				local_0 = max;
			}
			if (local_0 instanceof InvalidValueException) {
				throw (InvalidValueException)local_0;
			}
			final /*@Thrown*/ RealValue prod_0 = NumericTimesOperation.INSTANCE.evaluate(prod, local_0);
			//
			accumulator.add(prod_0);
		}
		final /*@Thrown*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, TypeId.REAL, collect);
		final /*@Thrown*/ float ECORE_sum = ValueUtil.floatValueOf(sum);
		return ECORE_sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEligibleForFreeShipping() {
		/**
		 * totalAmount >= 100.0
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ float totalAmount = this.getTotalAmount();
		final /*@NonInvalid*/ RealValue BOXED_totalAmount = ValueUtil.realValueOf(totalAmount);
		final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_totalAmount, EcommerceTables.REA_100_0).booleanValue();
		return ge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderStatus(OrderStatus newOrderStatus) {
		OrderStatus oldOrderStatus = orderStatus;
		orderStatus = newOrderStatus == null ? ORDER_STATUS_EDEFAULT : newOrderStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__ORDER_STATUS, oldOrderStatus, orderStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Payment getPaymentDetail() {
		return paymentDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentDetail(Payment newPaymentDetail, NotificationChain msgs) {
		Payment oldPaymentDetail = paymentDetail;
		paymentDetail = newPaymentDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__PAYMENT_DETAIL, oldPaymentDetail, newPaymentDetail);
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
	public void setPaymentDetail(Payment newPaymentDetail) {
		if (newPaymentDetail != paymentDetail) {
			NotificationChain msgs = null;
			if (paymentDetail != null)
				msgs = ((InternalEObject)paymentDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.ORDER__PAYMENT_DETAIL, null, msgs);
			if (newPaymentDetail != null)
				msgs = ((InternalEObject)newPaymentDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.ORDER__PAYMENT_DETAIL, null, msgs);
			msgs = basicSetPaymentDetail(newPaymentDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__PAYMENT_DETAIL, newPaymentDetail, newPaymentDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shipment getShipmentDetail() {
		return shipmentDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipmentDetail(Shipment newShipmentDetail, NotificationChain msgs) {
		Shipment oldShipmentDetail = shipmentDetail;
		shipmentDetail = newShipmentDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__SHIPMENT_DETAIL, oldShipmentDetail, newShipmentDetail);
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
	public void setShipmentDetail(Shipment newShipmentDetail) {
		if (newShipmentDetail != shipmentDetail) {
			NotificationChain msgs = null;
			if (shipmentDetail != null)
				msgs = ((InternalEObject)shipmentDetail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.ORDER__SHIPMENT_DETAIL, null, msgs);
			if (newShipmentDetail != null)
				msgs = ((InternalEObject)newShipmentDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.ORDER__SHIPMENT_DETAIL, null, msgs);
			msgs = basicSetShipmentDetail(newShipmentDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ORDER__SHIPMENT_DETAIL, newShipmentDetail, newShipmentDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderLineItem> getOrderItems() {
		if (orderItems == null) {
			orderItems = new EObjectContainmentEList<OrderLineItem>(OrderLineItem.class, this, EcommercePackage.ORDER__ORDER_ITEMS);
		}
		return orderItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.ORDER__PAYMENT_DETAIL:
				return basicSetPaymentDetail(null, msgs);
			case EcommercePackage.ORDER__SHIPMENT_DETAIL:
				return basicSetShipmentDetail(null, msgs);
			case EcommercePackage.ORDER__ORDER_ITEMS:
				return ((InternalEList<?>)getOrderItems()).basicRemove(otherEnd, msgs);
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
			case EcommercePackage.ORDER__ID:
				return getId();
			case EcommercePackage.ORDER__ORDER_DATE:
				return getOrderDate();
			case EcommercePackage.ORDER__ORDER_STATUS:
				return getOrderStatus();
			case EcommercePackage.ORDER__PAYMENT_DETAIL:
				return getPaymentDetail();
			case EcommercePackage.ORDER__SHIPMENT_DETAIL:
				return getShipmentDetail();
			case EcommercePackage.ORDER__ORDER_ITEMS:
				return getOrderItems();
			case EcommercePackage.ORDER__TOTAL_AMOUNT:
				return getTotalAmount();
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
			case EcommercePackage.ORDER__ID:
				setId((Integer)newValue);
				return;
			case EcommercePackage.ORDER__ORDER_DATE:
				setOrderDate((Date)newValue);
				return;
			case EcommercePackage.ORDER__ORDER_STATUS:
				setOrderStatus((OrderStatus)newValue);
				return;
			case EcommercePackage.ORDER__PAYMENT_DETAIL:
				setPaymentDetail((Payment)newValue);
				return;
			case EcommercePackage.ORDER__SHIPMENT_DETAIL:
				setShipmentDetail((Shipment)newValue);
				return;
			case EcommercePackage.ORDER__ORDER_ITEMS:
				getOrderItems().clear();
				getOrderItems().addAll((Collection<? extends OrderLineItem>)newValue);
				return;
			case EcommercePackage.ORDER__TOTAL_AMOUNT:
				setTotalAmount((Float)newValue);
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
			case EcommercePackage.ORDER__ID:
				setId(ID_EDEFAULT);
				return;
			case EcommercePackage.ORDER__ORDER_DATE:
				setOrderDate(ORDER_DATE_EDEFAULT);
				return;
			case EcommercePackage.ORDER__ORDER_STATUS:
				setOrderStatus(ORDER_STATUS_EDEFAULT);
				return;
			case EcommercePackage.ORDER__PAYMENT_DETAIL:
				setPaymentDetail((Payment)null);
				return;
			case EcommercePackage.ORDER__SHIPMENT_DETAIL:
				setShipmentDetail((Shipment)null);
				return;
			case EcommercePackage.ORDER__ORDER_ITEMS:
				getOrderItems().clear();
				return;
			case EcommercePackage.ORDER__TOTAL_AMOUNT:
				setTotalAmount(TOTAL_AMOUNT_EDEFAULT);
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
			case EcommercePackage.ORDER__ID:
				return id != ID_EDEFAULT;
			case EcommercePackage.ORDER__ORDER_DATE:
				return ORDER_DATE_EDEFAULT == null ? orderDate != null : !ORDER_DATE_EDEFAULT.equals(orderDate);
			case EcommercePackage.ORDER__ORDER_STATUS:
				return orderStatus != ORDER_STATUS_EDEFAULT;
			case EcommercePackage.ORDER__PAYMENT_DETAIL:
				return paymentDetail != null;
			case EcommercePackage.ORDER__SHIPMENT_DETAIL:
				return shipmentDetail != null;
			case EcommercePackage.ORDER__ORDER_ITEMS:
				return orderItems != null && !orderItems.isEmpty();
			case EcommercePackage.ORDER__TOTAL_AMOUNT:
				return getTotalAmount() != TOTAL_AMOUNT_EDEFAULT;
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
			case EcommercePackage.ORDER___GET_TOTAL_DISCOUNT:
				return getTotalDiscount();
			case EcommercePackage.ORDER___IS_ELIGIBLE_FOR_FREE_SHIPPING:
				return isEligibleForFreeShipping();
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
		result.append(", orderDate: ");
		result.append(orderDate);
		result.append(", orderStatus: ");
		result.append(orderStatus);
		result.append(')');
		return result.toString();
	}

} //OrderImpl

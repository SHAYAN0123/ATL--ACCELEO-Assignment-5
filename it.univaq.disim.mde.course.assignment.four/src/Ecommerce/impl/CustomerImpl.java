/**
 */
package Ecommerce.impl;

import Ecommerce.Cart;
import Ecommerce.Customer;
import Ecommerce.EcommercePackage;
import Ecommerce.EcommerceTables;
import Ecommerce.Order;
import Ecommerce.Review;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getDateJoined <em>Date Joined</em>}</li>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getCart <em>Cart</em>}</li>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link Ecommerce.impl.CustomerImpl#getReviews <em>Reviews</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends NamedElementImpl implements Customer {
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
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateJoined() <em>Date Joined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateJoined()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_JOINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateJoined() <em>Date Joined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateJoined()
	 * @generated
	 * @ordered
	 */
	protected Date dateJoined = DATE_JOINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCart() <em>Cart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCart()
	 * @generated
	 * @ordered
	 */
	protected Cart cart;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * The cached value of the '{@link #getReviews() <em>Reviews</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviews()
	 * @generated
	 * @ordered
	 */
	protected EList<Review> reviews;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.CUSTOMER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateJoined() {
		return dateJoined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateJoined(Date newDateJoined) {
		Date oldDateJoined = dateJoined;
		dateJoined = newDateJoined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__DATE_JOINED, oldDateJoined, dateJoined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cart getCart() {
		return cart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCart(Cart newCart, NotificationChain msgs) {
		Cart oldCart = cart;
		cart = newCart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__CART, oldCart, newCart);
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
	public void setCart(Cart newCart) {
		if (newCart != cart) {
			NotificationChain msgs = null;
			if (cart != null)
				msgs = ((InternalEObject)cart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.CUSTOMER__CART, null, msgs);
			if (newCart != null)
				msgs = ((InternalEObject)newCart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcommercePackage.CUSTOMER__CART, null, msgs);
			msgs = basicSetCart(newCart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.CUSTOMER__CART, newCart, newCart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectResolvingEList<Order>(Order.class, this, EcommercePackage.CUSTOMER__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Review> getReviews() {
		if (reviews == null) {
			reviews = new EObjectContainmentEList<Review>(Review.class, this, EcommercePackage.CUSTOMER__REVIEWS);
		}
		return reviews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalOrders() {
		/**
		 * orders->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Order> orders = this.getOrders();
		final /*@NonInvalid*/ OrderedSetValue BOXED_orders = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Order, orders);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_orders);
		final /*@NonInvalid*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validEmail(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Customer::validEmail";
		try {
			/**
			 *
			 * inv validEmail:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = email.matches('^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$')
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EcommercePackage.Literals.CUSTOMER___VALID_EMAIL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EcommerceTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ String email = this.getEmail();
				final /*@NonInvalid*/ boolean result = StringMatchesOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, email, EcommerceTables.STR__94_91_A_m_Za_m_z0_m_9___37_p_m_93_p_64_91_A_m_Za_m_z0_m_9_m_93_p_92__91_A_m_Za_m_z_93_123_2_44_125_$).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcommercePackage.CUSTOMER__CART:
				return basicSetCart(null, msgs);
			case EcommercePackage.CUSTOMER__REVIEWS:
				return ((InternalEList<?>)getReviews()).basicRemove(otherEnd, msgs);
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
			case EcommercePackage.CUSTOMER__ID:
				return getId();
			case EcommercePackage.CUSTOMER__EMAIL:
				return getEmail();
			case EcommercePackage.CUSTOMER__DATE_JOINED:
				return getDateJoined();
			case EcommercePackage.CUSTOMER__CART:
				return getCart();
			case EcommercePackage.CUSTOMER__ORDERS:
				return getOrders();
			case EcommercePackage.CUSTOMER__REVIEWS:
				return getReviews();
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
			case EcommercePackage.CUSTOMER__ID:
				setId((Integer)newValue);
				return;
			case EcommercePackage.CUSTOMER__EMAIL:
				setEmail((String)newValue);
				return;
			case EcommercePackage.CUSTOMER__DATE_JOINED:
				setDateJoined((Date)newValue);
				return;
			case EcommercePackage.CUSTOMER__CART:
				setCart((Cart)newValue);
				return;
			case EcommercePackage.CUSTOMER__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case EcommercePackage.CUSTOMER__REVIEWS:
				getReviews().clear();
				getReviews().addAll((Collection<? extends Review>)newValue);
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
			case EcommercePackage.CUSTOMER__ID:
				setId(ID_EDEFAULT);
				return;
			case EcommercePackage.CUSTOMER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case EcommercePackage.CUSTOMER__DATE_JOINED:
				setDateJoined(DATE_JOINED_EDEFAULT);
				return;
			case EcommercePackage.CUSTOMER__CART:
				setCart((Cart)null);
				return;
			case EcommercePackage.CUSTOMER__ORDERS:
				getOrders().clear();
				return;
			case EcommercePackage.CUSTOMER__REVIEWS:
				getReviews().clear();
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
			case EcommercePackage.CUSTOMER__ID:
				return id != ID_EDEFAULT;
			case EcommercePackage.CUSTOMER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case EcommercePackage.CUSTOMER__DATE_JOINED:
				return DATE_JOINED_EDEFAULT == null ? dateJoined != null : !DATE_JOINED_EDEFAULT.equals(dateJoined);
			case EcommercePackage.CUSTOMER__CART:
				return cart != null;
			case EcommercePackage.CUSTOMER__ORDERS:
				return orders != null && !orders.isEmpty();
			case EcommercePackage.CUSTOMER__REVIEWS:
				return reviews != null && !reviews.isEmpty();
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
			case EcommercePackage.CUSTOMER___GET_TOTAL_ORDERS:
				return getTotalOrders();
			case EcommercePackage.CUSTOMER___VALID_EMAIL__DIAGNOSTICCHAIN_MAP:
				return validEmail((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(", email: ");
		result.append(email);
		result.append(", dateJoined: ");
		result.append(dateJoined);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl

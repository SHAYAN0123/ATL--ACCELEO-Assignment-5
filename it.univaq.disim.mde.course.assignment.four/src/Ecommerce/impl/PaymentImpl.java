/**
 */
package Ecommerce.impl;

import Ecommerce.EcommercePackage;
import Ecommerce.Payment;
import Ecommerce.PaymentMethod;
import Ecommerce.PaymentStatus;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.PaymentImpl#getId <em>Id</em>}</li>
 *   <li>{@link Ecommerce.impl.PaymentImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link Ecommerce.impl.PaymentImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link Ecommerce.impl.PaymentImpl#getPaidUsing <em>Paid Using</em>}</li>
 *   <li>{@link Ecommerce.impl.PaymentImpl#getPaymentStatus <em>Payment Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentImpl extends MinimalEObjectImpl.Container implements Payment {
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
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected float amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentDate() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PAYMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected Date paymentDate = PAYMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaidUsing() <em>Paid Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidUsing()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentMethod PAID_USING_EDEFAULT = PaymentMethod.CREADIT_CARD;

	/**
	 * The cached value of the '{@link #getPaidUsing() <em>Paid Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidUsing()
	 * @generated
	 * @ordered
	 */
	protected PaymentMethod paidUsing = PAID_USING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PaymentStatus PAYMENT_STATUS_EDEFAULT = PaymentStatus.PENDING;

	/**
	 * The cached value of the '{@link #getPaymentStatus() <em>Payment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentStatus()
	 * @generated
	 * @ordered
	 */
	protected PaymentStatus paymentStatus = PAYMENT_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.PAYMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PAYMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(float newAmount) {
		float oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PAYMENT__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentDate(Date newPaymentDate) {
		Date oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PAYMENT__PAYMENT_DATE, oldPaymentDate, paymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentMethod getPaidUsing() {
		return paidUsing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaidUsing(PaymentMethod newPaidUsing) {
		PaymentMethod oldPaidUsing = paidUsing;
		paidUsing = newPaidUsing == null ? PAID_USING_EDEFAULT : newPaidUsing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PAYMENT__PAID_USING, oldPaidUsing, paidUsing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaymentStatus(PaymentStatus newPaymentStatus) {
		PaymentStatus oldPaymentStatus = paymentStatus;
		paymentStatus = newPaymentStatus == null ? PAYMENT_STATUS_EDEFAULT : newPaymentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.PAYMENT__PAYMENT_STATUS, oldPaymentStatus, paymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcommercePackage.PAYMENT__ID:
				return getId();
			case EcommercePackage.PAYMENT__AMOUNT:
				return getAmount();
			case EcommercePackage.PAYMENT__PAYMENT_DATE:
				return getPaymentDate();
			case EcommercePackage.PAYMENT__PAID_USING:
				return getPaidUsing();
			case EcommercePackage.PAYMENT__PAYMENT_STATUS:
				return getPaymentStatus();
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
			case EcommercePackage.PAYMENT__ID:
				setId((Integer)newValue);
				return;
			case EcommercePackage.PAYMENT__AMOUNT:
				setAmount((Float)newValue);
				return;
			case EcommercePackage.PAYMENT__PAYMENT_DATE:
				setPaymentDate((Date)newValue);
				return;
			case EcommercePackage.PAYMENT__PAID_USING:
				setPaidUsing((PaymentMethod)newValue);
				return;
			case EcommercePackage.PAYMENT__PAYMENT_STATUS:
				setPaymentStatus((PaymentStatus)newValue);
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
			case EcommercePackage.PAYMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case EcommercePackage.PAYMENT__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case EcommercePackage.PAYMENT__PAYMENT_DATE:
				setPaymentDate(PAYMENT_DATE_EDEFAULT);
				return;
			case EcommercePackage.PAYMENT__PAID_USING:
				setPaidUsing(PAID_USING_EDEFAULT);
				return;
			case EcommercePackage.PAYMENT__PAYMENT_STATUS:
				setPaymentStatus(PAYMENT_STATUS_EDEFAULT);
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
			case EcommercePackage.PAYMENT__ID:
				return id != ID_EDEFAULT;
			case EcommercePackage.PAYMENT__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case EcommercePackage.PAYMENT__PAYMENT_DATE:
				return PAYMENT_DATE_EDEFAULT == null ? paymentDate != null : !PAYMENT_DATE_EDEFAULT.equals(paymentDate);
			case EcommercePackage.PAYMENT__PAID_USING:
				return paidUsing != PAID_USING_EDEFAULT;
			case EcommercePackage.PAYMENT__PAYMENT_STATUS:
				return paymentStatus != PAYMENT_STATUS_EDEFAULT;
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
		result.append(", amount: ");
		result.append(amount);
		result.append(", paymentDate: ");
		result.append(paymentDate);
		result.append(", paidUsing: ");
		result.append(paidUsing);
		result.append(", paymentStatus: ");
		result.append(paymentStatus);
		result.append(')');
		return result.toString();
	}

} //PaymentImpl

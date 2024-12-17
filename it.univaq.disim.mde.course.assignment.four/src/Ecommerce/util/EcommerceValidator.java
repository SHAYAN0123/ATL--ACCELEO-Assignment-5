/**
 */
package Ecommerce.util;

import Ecommerce.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Ecommerce.EcommercePackage
 * @generated
 */
public class EcommerceValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EcommerceValidator INSTANCE = new EcommerceValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Ecommerce";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Customer Emails' of 'Platform'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ECOMMERCE_PLATFORM__UNIQUE_CUSTOMER_EMAILS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique IDs' of 'Platform'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ECOMMERCE_PLATFORM__UNIQUE_IDS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Email' of 'Customer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CUSTOMER__VALID_EMAIL = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Promotion Dates' of 'Promotion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROMOTION__VALID_PROMOTION_DATES = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Discount' of 'Promotion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROMOTION__VALID_DISCOUNT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Empty Cart' of 'Cart'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CART__NON_EMPTY_CART = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Ratings' of 'Review'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW__VALID_RATINGS = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 7;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcommerceValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EcommercePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EcommercePackage.ECOMMERCE_PLATFORM:
				return validateEcommercePlatform((EcommercePlatform)value, diagnostics, context);
			case EcommercePackage.CUSTOMER:
				return validateCustomer((Customer)value, diagnostics, context);
			case EcommercePackage.PRODUCT_CATEGORY:
				return validateProductCategory((ProductCategory)value, diagnostics, context);
			case EcommercePackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case EcommercePackage.PROMOTION:
				return validatePromotion((Promotion)value, diagnostics, context);
			case EcommercePackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case EcommercePackage.PAYMENT:
				return validatePayment((Payment)value, diagnostics, context);
			case EcommercePackage.SHIPMENT:
				return validateShipment((Shipment)value, diagnostics, context);
			case EcommercePackage.CART:
				return validateCart((Cart)value, diagnostics, context);
			case EcommercePackage.CART_CONTENT:
				return validateCartContent((CartContent)value, diagnostics, context);
			case EcommercePackage.REVIEW:
				return validateReview((Review)value, diagnostics, context);
			case EcommercePackage.ORDER_LINE_ITEM:
				return validateOrderLineItem((OrderLineItem)value, diagnostics, context);
			case EcommercePackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case EcommercePackage.ORDER_STATUS:
				return validateOrderStatus((OrderStatus)value, diagnostics, context);
			case EcommercePackage.PAYMENT_METHOD:
				return validatePaymentMethod((PaymentMethod)value, diagnostics, context);
			case EcommercePackage.PAYMENT_STATUS:
				return validatePaymentStatus((PaymentStatus)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEcommercePlatform(EcommercePlatform ecommercePlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ecommercePlatform, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ecommercePlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ecommercePlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ecommercePlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ecommercePlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ecommercePlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ecommercePlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ecommercePlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ecommercePlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validateEcommercePlatform_uniqueIDs(ecommercePlatform, diagnostics, context);
		if (result || diagnostics != null) result &= validateEcommercePlatform_uniqueCustomerEmails(ecommercePlatform, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueIDs constraint of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEcommercePlatform_uniqueIDs(EcommercePlatform ecommercePlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ecommercePlatform.uniqueIDs(diagnostics, context);
	}

	/**
	 * Validates the uniqueCustomerEmails constraint of '<em>Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEcommercePlatform_uniqueCustomerEmails(EcommercePlatform ecommercePlatform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ecommercePlatform.uniqueCustomerEmails(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(customer, diagnostics, context);
		if (result || diagnostics != null) result &= validateCustomer_validEmail(customer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validEmail constraint of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomer_validEmail(Customer customer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return customer.validEmail(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductCategory(ProductCategory productCategory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productCategory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(product, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePromotion(Promotion promotion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(promotion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(promotion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(promotion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(promotion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(promotion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(promotion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(promotion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(promotion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(promotion, diagnostics, context);
		if (result || diagnostics != null) result &= validatePromotion_validDiscount(promotion, diagnostics, context);
		if (result || diagnostics != null) result &= validatePromotion_validPromotionDates(promotion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validDiscount constraint of '<em>Promotion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePromotion_validDiscount(Promotion promotion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return promotion.validDiscount(diagnostics, context);
	}

	/**
	 * Validates the validPromotionDates constraint of '<em>Promotion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePromotion_validPromotionDates(Promotion promotion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return promotion.validPromotionDates(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(order, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayment(Payment payment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(payment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShipment(Shipment shipment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shipment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCart(Cart cart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cart, diagnostics, context);
		if (result || diagnostics != null) result &= validateCart_nonEmptyCart(cart, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonEmptyCart constraint of '<em>Cart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCart_nonEmptyCart(Cart cart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cart.nonEmptyCart(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCartContent(CartContent cartContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cartContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReview(Review review, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(review, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(review, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(review, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(review, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(review, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(review, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(review, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(review, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(review, diagnostics, context);
		if (result || diagnostics != null) result &= validateReview_validRatings(review, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validRatings constraint of '<em>Review</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReview_validRatings(Review review, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return review.validRatings(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderLineItem(OrderLineItem orderLineItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderLineItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderStatus(OrderStatus orderStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentMethod(PaymentMethod paymentMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaymentStatus(PaymentStatus paymentStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EcommerceValidator

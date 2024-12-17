/**
 */
package Ecommerce.impl;

import Ecommerce.Cart;
import Ecommerce.CartContent;
import Ecommerce.Customer;
import Ecommerce.EcommerceFactory;
import Ecommerce.EcommercePackage;
import Ecommerce.EcommercePlatform;
import Ecommerce.NamedElement;
import Ecommerce.Order;
import Ecommerce.OrderLineItem;
import Ecommerce.OrderStatus;
import Ecommerce.Payment;
import Ecommerce.PaymentMethod;
import Ecommerce.PaymentStatus;
import Ecommerce.Product;
import Ecommerce.ProductCategory;
import Ecommerce.Promotion;
import Ecommerce.Review;
import Ecommerce.Shipment;

import Ecommerce.util.EcommerceValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcommercePackageImpl extends EPackageImpl implements EcommercePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecommercePlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass promotionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderLineItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paymentStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Ecommerce.EcommercePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcommercePackageImpl() {
		super(eNS_URI, EcommerceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EcommercePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcommercePackage init() {
		if (isInited) return (EcommercePackage)EPackage.Registry.INSTANCE.getEPackage(EcommercePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEcommercePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EcommercePackageImpl theEcommercePackage = registeredEcommercePackage instanceof EcommercePackageImpl ? (EcommercePackageImpl)registeredEcommercePackage : new EcommercePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEcommercePackage.createPackageContents();

		// Initialize created meta-data
		theEcommercePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEcommercePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return EcommerceValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEcommercePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcommercePackage.eNS_URI, theEcommercePackage);
		return theEcommercePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEcommercePlatform() {
		return ecommercePlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEcommercePlatform_Customers() {
		return (EReference)ecommercePlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEcommercePlatform_Products() {
		return (EReference)ecommercePlatformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEcommercePlatform_ProductCategories() {
		return (EReference)ecommercePlatformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEcommercePlatform_Url() {
		return (EAttribute)ecommercePlatformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEcommercePlatform_Description() {
		return (EAttribute)ecommercePlatformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEcommercePlatform_Orders() {
		return (EReference)ecommercePlatformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEcommercePlatform_Promotions() {
		return (EReference)ecommercePlatformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEcommercePlatform__GetAverageOrderValue() {
		return ecommercePlatformEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEcommercePlatform__UniqueCustomerEmails__DiagnosticChain_Map() {
		return ecommercePlatformEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEcommercePlatform__UniqueIDs__DiagnosticChain_Map() {
		return ecommercePlatformEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_Id() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_Email() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomer_DateJoined() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomer_Cart() {
		return (EReference)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomer_Orders() {
		return (EReference)customerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomer_Reviews() {
		return (EReference)customerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustomer__GetTotalOrders() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustomer__ValidEmail__DiagnosticChain_Map() {
		return customerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductCategory() {
		return productCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductCategory_Id() {
		return (EAttribute)productCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductCategory_Description() {
		return (EAttribute)productCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductCategory_Products() {
		return (EReference)productCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Id() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Description() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_Price() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_StockQuantity() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_DateAdded() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductCategory() {
		return (EReference)productEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_AppliedPromotions() {
		return (EReference)productEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProduct_ProductReviews() {
		return (EReference)productEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProduct__GetAverageRatings() {
		return productEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPromotion() {
		return promotionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_Id() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_Description() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_DiscountPercentage() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_StartDate() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPromotion_EndDate() {
		return (EAttribute)promotionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPromotion__ValidPromotionDates__DiagnosticChain_Map() {
		return promotionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPromotion__ValidDiscount__DiagnosticChain_Map() {
		return promotionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_Id() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_OrderDate() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_TotalAmount() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrder__GetTotalDiscount() {
		return orderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOrder__IsEligibleForFreeShipping() {
		return orderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_OrderStatus() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrder_PaymentDetail() {
		return (EReference)orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrder_ShipmentDetail() {
		return (EReference)orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrder_OrderItems() {
		return (EReference)orderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Id() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_Amount() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_PaymentDate() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_PaidUsing() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPayment_PaymentStatus() {
		return (EAttribute)paymentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShipment() {
		return shipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_Id() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_CourierName() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_Cost() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShipment_EstimatedDelivery() {
		return (EAttribute)shipmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCart() {
		return cartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCart_Id() {
		return (EAttribute)cartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCart_CreationDate() {
		return (EAttribute)cartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCart_LastUpdated() {
		return (EAttribute)cartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCart_CartContents() {
		return (EReference)cartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCart_CartTotal() {
		return (EAttribute)cartEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCart__NonEmptyCart__DiagnosticChain_Map() {
		return cartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCartContent() {
		return cartContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCartContent_Id() {
		return (EAttribute)cartContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCartContent_Quantity() {
		return (EAttribute)cartContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCartContent_Price() {
		return (EAttribute)cartContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCartContent_Products() {
		return (EReference)cartContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReview() {
		return reviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReview_Id() {
		return (EAttribute)reviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReview_Ratings() {
		return (EAttribute)reviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReview_Comment() {
		return (EAttribute)reviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReview_ReviewDate() {
		return (EAttribute)reviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReview_ReviewedProduct() {
		return (EReference)reviewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReview__ValidRatings__DiagnosticChain_Map() {
		return reviewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderLineItem() {
		return orderLineItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderLineItem_Id() {
		return (EAttribute)orderLineItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderLineItem_Quantity() {
		return (EAttribute)orderLineItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderLineItem_Price() {
		return (EAttribute)orderLineItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderLineItem_Product() {
		return (EReference)orderLineItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrderStatus() {
		return orderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaymentMethod() {
		return paymentMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaymentStatus() {
		return paymentStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EcommerceFactory getEcommerceFactory() {
		return (EcommerceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ecommercePlatformEClass = createEClass(ECOMMERCE_PLATFORM);
		createEReference(ecommercePlatformEClass, ECOMMERCE_PLATFORM__CUSTOMERS);
		createEReference(ecommercePlatformEClass, ECOMMERCE_PLATFORM__PRODUCTS);
		createEReference(ecommercePlatformEClass, ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES);
		createEAttribute(ecommercePlatformEClass, ECOMMERCE_PLATFORM__URL);
		createEAttribute(ecommercePlatformEClass, ECOMMERCE_PLATFORM__DESCRIPTION);
		createEReference(ecommercePlatformEClass, ECOMMERCE_PLATFORM__ORDERS);
		createEReference(ecommercePlatformEClass, ECOMMERCE_PLATFORM__PROMOTIONS);
		createEOperation(ecommercePlatformEClass, ECOMMERCE_PLATFORM___GET_AVERAGE_ORDER_VALUE);
		createEOperation(ecommercePlatformEClass, ECOMMERCE_PLATFORM___UNIQUE_CUSTOMER_EMAILS__DIAGNOSTICCHAIN_MAP);
		createEOperation(ecommercePlatformEClass, ECOMMERCE_PLATFORM___UNIQUE_IDS__DIAGNOSTICCHAIN_MAP);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__ID);
		createEAttribute(customerEClass, CUSTOMER__EMAIL);
		createEAttribute(customerEClass, CUSTOMER__DATE_JOINED);
		createEReference(customerEClass, CUSTOMER__CART);
		createEReference(customerEClass, CUSTOMER__ORDERS);
		createEReference(customerEClass, CUSTOMER__REVIEWS);
		createEOperation(customerEClass, CUSTOMER___GET_TOTAL_ORDERS);
		createEOperation(customerEClass, CUSTOMER___VALID_EMAIL__DIAGNOSTICCHAIN_MAP);

		productCategoryEClass = createEClass(PRODUCT_CATEGORY);
		createEAttribute(productCategoryEClass, PRODUCT_CATEGORY__ID);
		createEAttribute(productCategoryEClass, PRODUCT_CATEGORY__DESCRIPTION);
		createEReference(productCategoryEClass, PRODUCT_CATEGORY__PRODUCTS);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__ID);
		createEAttribute(productEClass, PRODUCT__DESCRIPTION);
		createEAttribute(productEClass, PRODUCT__PRICE);
		createEAttribute(productEClass, PRODUCT__STOCK_QUANTITY);
		createEAttribute(productEClass, PRODUCT__DATE_ADDED);
		createEReference(productEClass, PRODUCT__PRODUCT_CATEGORY);
		createEReference(productEClass, PRODUCT__APPLIED_PROMOTIONS);
		createEReference(productEClass, PRODUCT__PRODUCT_REVIEWS);
		createEOperation(productEClass, PRODUCT___GET_AVERAGE_RATINGS);

		promotionEClass = createEClass(PROMOTION);
		createEAttribute(promotionEClass, PROMOTION__ID);
		createEAttribute(promotionEClass, PROMOTION__DESCRIPTION);
		createEAttribute(promotionEClass, PROMOTION__DISCOUNT_PERCENTAGE);
		createEAttribute(promotionEClass, PROMOTION__START_DATE);
		createEAttribute(promotionEClass, PROMOTION__END_DATE);
		createEOperation(promotionEClass, PROMOTION___VALID_PROMOTION_DATES__DIAGNOSTICCHAIN_MAP);
		createEOperation(promotionEClass, PROMOTION___VALID_DISCOUNT__DIAGNOSTICCHAIN_MAP);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__ID);
		createEAttribute(orderEClass, ORDER__ORDER_DATE);
		createEAttribute(orderEClass, ORDER__ORDER_STATUS);
		createEReference(orderEClass, ORDER__PAYMENT_DETAIL);
		createEReference(orderEClass, ORDER__SHIPMENT_DETAIL);
		createEReference(orderEClass, ORDER__ORDER_ITEMS);
		createEAttribute(orderEClass, ORDER__TOTAL_AMOUNT);
		createEOperation(orderEClass, ORDER___GET_TOTAL_DISCOUNT);
		createEOperation(orderEClass, ORDER___IS_ELIGIBLE_FOR_FREE_SHIPPING);

		paymentEClass = createEClass(PAYMENT);
		createEAttribute(paymentEClass, PAYMENT__ID);
		createEAttribute(paymentEClass, PAYMENT__AMOUNT);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_DATE);
		createEAttribute(paymentEClass, PAYMENT__PAID_USING);
		createEAttribute(paymentEClass, PAYMENT__PAYMENT_STATUS);

		shipmentEClass = createEClass(SHIPMENT);
		createEAttribute(shipmentEClass, SHIPMENT__ID);
		createEAttribute(shipmentEClass, SHIPMENT__COURIER_NAME);
		createEAttribute(shipmentEClass, SHIPMENT__COST);
		createEAttribute(shipmentEClass, SHIPMENT__ESTIMATED_DELIVERY);

		cartEClass = createEClass(CART);
		createEAttribute(cartEClass, CART__ID);
		createEAttribute(cartEClass, CART__CREATION_DATE);
		createEAttribute(cartEClass, CART__LAST_UPDATED);
		createEReference(cartEClass, CART__CART_CONTENTS);
		createEAttribute(cartEClass, CART__CART_TOTAL);
		createEOperation(cartEClass, CART___NON_EMPTY_CART__DIAGNOSTICCHAIN_MAP);

		cartContentEClass = createEClass(CART_CONTENT);
		createEAttribute(cartContentEClass, CART_CONTENT__ID);
		createEAttribute(cartContentEClass, CART_CONTENT__QUANTITY);
		createEReference(cartContentEClass, CART_CONTENT__PRODUCTS);
		createEAttribute(cartContentEClass, CART_CONTENT__PRICE);

		reviewEClass = createEClass(REVIEW);
		createEAttribute(reviewEClass, REVIEW__ID);
		createEAttribute(reviewEClass, REVIEW__RATINGS);
		createEAttribute(reviewEClass, REVIEW__COMMENT);
		createEAttribute(reviewEClass, REVIEW__REVIEW_DATE);
		createEReference(reviewEClass, REVIEW__REVIEWED_PRODUCT);
		createEOperation(reviewEClass, REVIEW___VALID_RATINGS__DIAGNOSTICCHAIN_MAP);

		orderLineItemEClass = createEClass(ORDER_LINE_ITEM);
		createEAttribute(orderLineItemEClass, ORDER_LINE_ITEM__ID);
		createEAttribute(orderLineItemEClass, ORDER_LINE_ITEM__QUANTITY);
		createEAttribute(orderLineItemEClass, ORDER_LINE_ITEM__PRICE);
		createEReference(orderLineItemEClass, ORDER_LINE_ITEM__PRODUCT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		orderStatusEEnum = createEEnum(ORDER_STATUS);
		paymentMethodEEnum = createEEnum(PAYMENT_METHOD);
		paymentStatusEEnum = createEEnum(PAYMENT_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ecommercePlatformEClass.getESuperTypes().add(this.getNamedElement());
		customerEClass.getESuperTypes().add(this.getNamedElement());
		productCategoryEClass.getESuperTypes().add(this.getNamedElement());
		productEClass.getESuperTypes().add(this.getNamedElement());
		promotionEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(ecommercePlatformEClass, EcommercePlatform.class, "EcommercePlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcommercePlatform_Customers(), this.getCustomer(), null, "customers", null, 0, -1, EcommercePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcommercePlatform_Products(), this.getProduct(), null, "products", null, 0, -1, EcommercePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcommercePlatform_ProductCategories(), this.getProductCategory(), null, "productCategories", null, 0, -1, EcommercePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcommercePlatform_Url(), ecorePackage.getEString(), "url", null, 0, 1, EcommercePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEcommercePlatform_Description(), ecorePackage.getEString(), "description", null, 0, 1, EcommercePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcommercePlatform_Orders(), this.getOrder(), null, "orders", null, 0, -1, EcommercePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEcommercePlatform_Promotions(), this.getPromotion(), null, "promotions", null, 0, -1, EcommercePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEcommercePlatform__GetAverageOrderValue(), ecorePackage.getEFloat(), "getAverageOrderValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getEcommercePlatform__UniqueCustomerEmails__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueCustomerEmails", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEcommercePlatform__UniqueIDs__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "uniqueIDs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_Email(), ecorePackage.getEString(), "email", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomer_DateJoined(), ecorePackage.getEDate(), "dateJoined", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_Cart(), this.getCart(), null, "cart", null, 0, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_Orders(), this.getOrder(), null, "orders", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomer_Reviews(), this.getReview(), null, "reviews", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCustomer__GetTotalOrders(), ecorePackage.getEInt(), "getTotalOrders", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCustomer__ValidEmail__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validEmail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productCategoryEClass, ProductCategory.class, "ProductCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductCategory_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ProductCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, ProductCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductCategory_Products(), this.getProduct(), this.getProduct_ProductCategory(), "products", null, 0, -1, ProductCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Description(), ecorePackage.getEString(), "description", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_StockQuantity(), ecorePackage.getEInt(), "stockQuantity", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_DateAdded(), ecorePackage.getEDate(), "dateAdded", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductCategory(), this.getProductCategory(), this.getProductCategory_Products(), "productCategory", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_AppliedPromotions(), this.getPromotion(), null, "appliedPromotions", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_ProductReviews(), this.getReview(), this.getReview_ReviewedProduct(), "productReviews", null, 0, -1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProduct__GetAverageRatings(), ecorePackage.getEFloat(), "getAverageRatings", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(promotionEClass, Promotion.class, "Promotion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPromotion_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_Description(), ecorePackage.getEString(), "description", null, 0, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_DiscountPercentage(), ecorePackage.getEInt(), "discountPercentage", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPromotion_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, Promotion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPromotion__ValidPromotionDates__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validPromotionDates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPromotion__ValidDiscount__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validDiscount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_OrderDate(), ecorePackage.getEDate(), "orderDate", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_OrderStatus(), this.getOrderStatus(), "orderStatus", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_PaymentDetail(), this.getPayment(), null, "paymentDetail", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_ShipmentDetail(), this.getShipment(), null, "shipmentDetail", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_OrderItems(), this.getOrderLineItem(), null, "orderItems", null, 1, -1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_TotalAmount(), ecorePackage.getEFloat(), "totalAmount", null, 1, 1, Order.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getOrder__GetTotalDiscount(), ecorePackage.getEFloat(), "getTotalDiscount", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrder__IsEligibleForFreeShipping(), ecorePackage.getEBoolean(), "isEligibleForFreeShipping", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPayment_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_Amount(), ecorePackage.getEFloat(), "amount", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_PaymentDate(), ecorePackage.getEDate(), "paymentDate", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_PaidUsing(), this.getPaymentMethod(), "paidUsing", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPayment_PaymentStatus(), this.getPaymentStatus(), "paymentStatus", null, 1, 1, Payment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shipmentEClass, Shipment.class, "Shipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShipment_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_CourierName(), ecorePackage.getEString(), "courierName", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_Cost(), ecorePackage.getEFloat(), "cost", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShipment_EstimatedDelivery(), ecorePackage.getEDate(), "estimatedDelivery", null, 1, 1, Shipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartEClass, Cart.class, "Cart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCart_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCart_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCart_LastUpdated(), ecorePackage.getEDate(), "lastUpdated", null, 1, 1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCart_CartContents(), this.getCartContent(), null, "cartContents", null, 1, -1, Cart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCart_CartTotal(), ecorePackage.getEFloat(), "cartTotal", null, 1, 1, Cart.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCart__NonEmptyCart__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonEmptyCart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cartContentEClass, CartContent.class, "CartContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartContent_Id(), ecorePackage.getEInt(), "id", null, 1, 1, CartContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartContent_Quantity(), ecorePackage.getEInt(), "quantity", null, 1, 1, CartContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartContent_Products(), this.getProduct(), null, "products", null, 1, 1, CartContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartContent_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, CartContent.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(reviewEClass, Review.class, "Review", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReview_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReview_Ratings(), ecorePackage.getEInt(), "ratings", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReview_Comment(), ecorePackage.getEString(), "comment", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReview_ReviewDate(), ecorePackage.getEDate(), "reviewDate", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReview_ReviewedProduct(), this.getProduct(), this.getProduct_ProductReviews(), "reviewedProduct", null, 1, 1, Review.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getReview__ValidRatings__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validRatings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderLineItemEClass, OrderLineItem.class, "OrderLineItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderLineItem_Id(), ecorePackage.getEInt(), "id", null, 1, 1, OrderLineItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderLineItem_Quantity(), ecorePackage.getEInt(), "quantity", null, 1, 1, OrderLineItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderLineItem_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, OrderLineItem.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getOrderLineItem_Product(), this.getProduct(), null, "product", null, 1, 1, OrderLineItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orderStatusEEnum, OrderStatus.class, "OrderStatus");
		addEEnumLiteral(orderStatusEEnum, OrderStatus.PENDING);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.INTRANSIT);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.DELIVERED);

		initEEnum(paymentMethodEEnum, PaymentMethod.class, "PaymentMethod");
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.CREADIT_CARD);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.DEBIT_CARD);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.BANK_TRANSACTION);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.GOOGLE_PAY);
		addEEnumLiteral(paymentMethodEEnum, PaymentMethod.APPLE_PAY);

		initEEnum(paymentStatusEEnum, PaymentStatus.class, "PaymentStatus");
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.PENDING);
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.SUCCESS);
		addEEnumLiteral(paymentStatusEEnum, PaymentStatus.FAILED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (ecommercePlatformEClass,
		   source,
		   new String[] {
			   "constraints", "uniqueIDs"
		   });
		addAnnotation
		  (customerEClass,
		   source,
		   new String[] {
			   "constraints", "validEmail"
		   });
		addAnnotation
		  (promotionEClass,
		   source,
		   new String[] {
			   "constraints", "validDiscount"
		   });
		addAnnotation
		  (cartEClass,
		   source,
		   new String[] {
			   "constraints", "nonEmptyCart"
		   });
		addAnnotation
		  (reviewEClass,
		   source,
		   new String[] {
			   "constraints", "validRatings"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getEcommercePlatform__GetAverageOrderValue(),
		   source,
		   new String[] {
			   "body", "if orders->notEmpty() then orders->collect(totalAmount)->sum() / orders->size() else 0.0 endif"
		   });
		addAnnotation
		  (getEcommercePlatform__UniqueCustomerEmails__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tcustomers->forAll(c1, c2 | c1 <> c2 implies c1.email <> c2.email)"
		   });
		addAnnotation
		  (getEcommercePlatform__UniqueIDs__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \tcustomers->forAll(c1, c2 | c1 <> c2 implies c1.id <> c2.id) and\n    \tproducts->forAll(p1, p2 | p1 <> p2 implies p1.id <> p2.id) and\n    \torders->forAll(o1, o2 | o1 <> o2 implies o1.id <> o2.id) and\n    \tpromotions->forAll(pr1, pr2 | pr1 <> pr2 implies pr1.id <> pr2.id)"
		   });
		addAnnotation
		  (getCustomer__GetTotalOrders(),
		   source,
		   new String[] {
			   "body", "orders->size()"
		   });
		addAnnotation
		  (getCustomer__ValidEmail__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \temail.matches(\'^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,}$\')"
		   });
		addAnnotation
		  (getProduct__GetAverageRatings(),
		   source,
		   new String[] {
			   "body", "if productReviews->isEmpty() then\n            \t    0\n            \telse\n                \tproductReviews->collect(ratings)->sum() / productReviews->collect(ratings)->size()\n            \tendif"
		   });
		addAnnotation
		  (getPromotion__ValidPromotionDates__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tstartDate < endDate"
		   });
		addAnnotation
		  (getPromotion__ValidDiscount__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tdiscountPercentage >= 0 and discountPercentage <= 100"
		   });
		addAnnotation
		  (getOrder__GetTotalDiscount(),
		   source,
		   new String[] {
			   "body", "orderItems->collect(\n        \tquantity * product.price * (if product.appliedPromotions->isEmpty() then 0 else product.appliedPromotions->collect(discountPercentage / 100)->max() endif))->sum()"
		   });
		addAnnotation
		  (getOrder__IsEligibleForFreeShipping(),
		   source,
		   new String[] {
			   "body", "totalAmount >= 100.0"
		   });
		addAnnotation
		  (getCart__NonEmptyCart__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tcartContents->size() > 0"
		   });
		addAnnotation
		  (getReview__ValidRatings__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n    \t\tratings >= 1 and ratings <= 5"
		   });
	}

} //EcommercePackageImpl

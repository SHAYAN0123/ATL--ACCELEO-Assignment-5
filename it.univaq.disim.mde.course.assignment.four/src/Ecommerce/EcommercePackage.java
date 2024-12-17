/**
 */
package Ecommerce;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Ecommerce.EcommerceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface EcommercePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Ecommerce";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://it.univaq.disim.mde.course.assignment.four/Ecommerce";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EC";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcommercePackage eINSTANCE = Ecommerce.impl.EcommercePackageImpl.init();

	/**
	 * The meta object id for the '{@link Ecommerce.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.NamedElementImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.EcommercePlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.EcommercePlatformImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getEcommercePlatform()
	 * @generated
	 */
	int ECOMMERCE_PLATFORM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM__CUSTOMERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM__PRODUCTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Product Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM__URL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM__ORDERS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Promotions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM__PROMOTIONS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Average Order Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM___GET_AVERAGE_ORDER_VALUE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Unique Customer Emails</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM___UNIQUE_CUSTOMER_EMAILS__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Unique IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM___UNIQUE_IDS__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_PLATFORM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.CustomerImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date Joined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__DATE_JOINED = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CART = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ORDERS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reviews</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__REVIEWS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Total Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_TOTAL_ORDERS = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___VALID_EMAIL__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.ProductCategoryImpl <em>Product Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.ProductCategoryImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getProductCategory()
	 * @generated
	 */
	int PRODUCT_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY__PRODUCTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CATEGORY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.ProductImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRICE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stock Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__STOCK_QUANTITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Date Added</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__DATE_ADDED = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Product Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_CATEGORY = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Applied Promotions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__APPLIED_PROMOTIONS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Product Reviews</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_REVIEWS = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Average Ratings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT___GET_AVERAGE_RATINGS = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.PromotionImpl <em>Promotion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.PromotionImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getPromotion()
	 * @generated
	 */
	int PROMOTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Discount Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__DISCOUNT_PERCENTAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__START_DATE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__END_DATE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Promotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Valid Promotion Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION___VALID_PROMOTION_DATES__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION___VALID_DISCOUNT__DIAGNOSTICCHAIN_MAP = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Promotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.OrderImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_DATE = 1;

	/**
	 * The feature id for the '<em><b>Order Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_STATUS = 2;

	/**
	 * The feature id for the '<em><b>Payment Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PAYMENT_DETAIL = 3;

	/**
	 * The feature id for the '<em><b>Shipment Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__SHIPMENT_DETAIL = 4;

	/**
	 * The feature id for the '<em><b>Order Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_ITEMS = 5;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TOTAL_AMOUNT = 6;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Total Discount</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER___GET_TOTAL_DISCOUNT = 0;

	/**
	 * The operation id for the '<em>Is Eligible For Free Shipping</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER___IS_ELIGIBLE_FOR_FREE_SHIPPING = 1;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.PaymentImpl <em>Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.PaymentImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getPayment()
	 * @generated
	 */
	int PAYMENT = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_DATE = 2;

	/**
	 * The feature id for the '<em><b>Paid Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAID_USING = 3;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT__PAYMENT_STATUS = 4;

	/**
	 * The number of structural features of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.ShipmentImpl <em>Shipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.ShipmentImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getShipment()
	 * @generated
	 */
	int SHIPMENT = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Courier Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__COURIER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__COST = 2;

	/**
	 * The feature id for the '<em><b>Estimated Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT__ESTIMATED_DELIVERY = 3;

	/**
	 * The number of structural features of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Shipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.CartImpl <em>Cart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.CartImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getCart()
	 * @generated
	 */
	int CART = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__ID = 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__CREATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__LAST_UPDATED = 2;

	/**
	 * The feature id for the '<em><b>Cart Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__CART_CONTENTS = 3;

	/**
	 * The feature id for the '<em><b>Cart Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART__CART_TOTAL = 4;

	/**
	 * The number of structural features of the '<em>Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Non Empty Cart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART___NON_EMPTY_CART__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Cart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.CartContentImpl <em>Cart Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.CartContentImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getCartContent()
	 * @generated
	 */
	int CART_CONTENT = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_CONTENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_CONTENT__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_CONTENT__PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_CONTENT__PRICE = 3;

	/**
	 * The number of structural features of the '<em>Cart Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_CONTENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cart Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CART_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.ReviewImpl <em>Review</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.ReviewImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getReview()
	 * @generated
	 */
	int REVIEW = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__ID = 0;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__RATINGS = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Review Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REVIEW_DATE = 3;

	/**
	 * The feature id for the '<em><b>Reviewed Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW__REVIEWED_PRODUCT = 4;

	/**
	 * The number of structural features of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Valid Ratings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW___VALID_RATINGS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Review</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVIEW_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Ecommerce.impl.OrderLineItemImpl <em>Order Line Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.impl.OrderLineItemImpl
	 * @see Ecommerce.impl.EcommercePackageImpl#getOrderLineItem()
	 * @generated
	 */
	int ORDER_LINE_ITEM = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_ITEM__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_ITEM__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_ITEM__PRODUCT = 3;

	/**
	 * The number of structural features of the '<em>Order Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Order Line Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Ecommerce.OrderStatus <em>Order Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.OrderStatus
	 * @see Ecommerce.impl.EcommercePackageImpl#getOrderStatus()
	 * @generated
	 */
	int ORDER_STATUS = 13;

	/**
	 * The meta object id for the '{@link Ecommerce.PaymentMethod <em>Payment Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.PaymentMethod
	 * @see Ecommerce.impl.EcommercePackageImpl#getPaymentMethod()
	 * @generated
	 */
	int PAYMENT_METHOD = 14;

	/**
	 * The meta object id for the '{@link Ecommerce.PaymentStatus <em>Payment Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.PaymentStatus
	 * @see Ecommerce.impl.EcommercePackageImpl#getPaymentStatus()
	 * @generated
	 */
	int PAYMENT_STATUS = 15;


	/**
	 * Returns the meta object for class '{@link Ecommerce.EcommercePlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see Ecommerce.EcommercePlatform
	 * @generated
	 */
	EClass getEcommercePlatform();

	/**
	 * Returns the meta object for the containment reference list '{@link Ecommerce.EcommercePlatform#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see Ecommerce.EcommercePlatform#getCustomers()
	 * @see #getEcommercePlatform()
	 * @generated
	 */
	EReference getEcommercePlatform_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link Ecommerce.EcommercePlatform#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see Ecommerce.EcommercePlatform#getProducts()
	 * @see #getEcommercePlatform()
	 * @generated
	 */
	EReference getEcommercePlatform_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link Ecommerce.EcommercePlatform#getProductCategories <em>Product Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Categories</em>'.
	 * @see Ecommerce.EcommercePlatform#getProductCategories()
	 * @see #getEcommercePlatform()
	 * @generated
	 */
	EReference getEcommercePlatform_ProductCategories();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.EcommercePlatform#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see Ecommerce.EcommercePlatform#getUrl()
	 * @see #getEcommercePlatform()
	 * @generated
	 */
	EAttribute getEcommercePlatform_Url();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.EcommercePlatform#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Ecommerce.EcommercePlatform#getDescription()
	 * @see #getEcommercePlatform()
	 * @generated
	 */
	EAttribute getEcommercePlatform_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link Ecommerce.EcommercePlatform#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see Ecommerce.EcommercePlatform#getOrders()
	 * @see #getEcommercePlatform()
	 * @generated
	 */
	EReference getEcommercePlatform_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link Ecommerce.EcommercePlatform#getPromotions <em>Promotions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Promotions</em>'.
	 * @see Ecommerce.EcommercePlatform#getPromotions()
	 * @see #getEcommercePlatform()
	 * @generated
	 */
	EReference getEcommercePlatform_Promotions();

	/**
	 * Returns the meta object for the '{@link Ecommerce.EcommercePlatform#getAverageOrderValue() <em>Get Average Order Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Average Order Value</em>' operation.
	 * @see Ecommerce.EcommercePlatform#getAverageOrderValue()
	 * @generated
	 */
	EOperation getEcommercePlatform__GetAverageOrderValue();

	/**
	 * Returns the meta object for the '{@link Ecommerce.EcommercePlatform#uniqueCustomerEmails(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Customer Emails</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Customer Emails</em>' operation.
	 * @see Ecommerce.EcommercePlatform#uniqueCustomerEmails(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEcommercePlatform__UniqueCustomerEmails__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Ecommerce.EcommercePlatform#uniqueIDs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique IDs</em>' operation.
	 * @see Ecommerce.EcommercePlatform#uniqueIDs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEcommercePlatform__UniqueIDs__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see Ecommerce.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Customer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Customer#getId()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Customer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Ecommerce.Customer#getEmail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Email();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Customer#getDateJoined <em>Date Joined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Joined</em>'.
	 * @see Ecommerce.Customer#getDateJoined()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_DateJoined();

	/**
	 * Returns the meta object for the containment reference '{@link Ecommerce.Customer#getCart <em>Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cart</em>'.
	 * @see Ecommerce.Customer#getCart()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Cart();

	/**
	 * Returns the meta object for the reference list '{@link Ecommerce.Customer#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orders</em>'.
	 * @see Ecommerce.Customer#getOrders()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link Ecommerce.Customer#getReviews <em>Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reviews</em>'.
	 * @see Ecommerce.Customer#getReviews()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Reviews();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Customer#getTotalOrders() <em>Get Total Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Orders</em>' operation.
	 * @see Ecommerce.Customer#getTotalOrders()
	 * @generated
	 */
	EOperation getCustomer__GetTotalOrders();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Customer#validEmail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Email</em>' operation.
	 * @see Ecommerce.Customer#validEmail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCustomer__ValidEmail__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Ecommerce.ProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Category</em>'.
	 * @see Ecommerce.ProductCategory
	 * @generated
	 */
	EClass getProductCategory();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.ProductCategory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.ProductCategory#getId()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.ProductCategory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Ecommerce.ProductCategory#getDescription()
	 * @see #getProductCategory()
	 * @generated
	 */
	EAttribute getProductCategory_Description();

	/**
	 * Returns the meta object for the reference list '{@link Ecommerce.ProductCategory#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Products</em>'.
	 * @see Ecommerce.ProductCategory#getProducts()
	 * @see #getProductCategory()
	 * @generated
	 */
	EReference getProductCategory_Products();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see Ecommerce.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Product#getId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Ecommerce.Product#getDescription()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Description();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Ecommerce.Product#getPrice()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Price();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getStockQuantity <em>Stock Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock Quantity</em>'.
	 * @see Ecommerce.Product#getStockQuantity()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_StockQuantity();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Product#getDateAdded <em>Date Added</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Added</em>'.
	 * @see Ecommerce.Product#getDateAdded()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_DateAdded();

	/**
	 * Returns the meta object for the reference '{@link Ecommerce.Product#getProductCategory <em>Product Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product Category</em>'.
	 * @see Ecommerce.Product#getProductCategory()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductCategory();

	/**
	 * Returns the meta object for the reference list '{@link Ecommerce.Product#getAppliedPromotions <em>Applied Promotions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applied Promotions</em>'.
	 * @see Ecommerce.Product#getAppliedPromotions()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_AppliedPromotions();

	/**
	 * Returns the meta object for the reference list '{@link Ecommerce.Product#getProductReviews <em>Product Reviews</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Product Reviews</em>'.
	 * @see Ecommerce.Product#getProductReviews()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductReviews();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Product#getAverageRatings() <em>Get Average Ratings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Average Ratings</em>' operation.
	 * @see Ecommerce.Product#getAverageRatings()
	 * @generated
	 */
	EOperation getProduct__GetAverageRatings();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Promotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promotion</em>'.
	 * @see Ecommerce.Promotion
	 * @generated
	 */
	EClass getPromotion();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Promotion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Promotion#getId()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Promotion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Ecommerce.Promotion#getDescription()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_Description();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Promotion#getDiscountPercentage <em>Discount Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discount Percentage</em>'.
	 * @see Ecommerce.Promotion#getDiscountPercentage()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_DiscountPercentage();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Promotion#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see Ecommerce.Promotion#getStartDate()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Promotion#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see Ecommerce.Promotion#getEndDate()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_EndDate();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Promotion#validPromotionDates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Promotion Dates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Promotion Dates</em>' operation.
	 * @see Ecommerce.Promotion#validPromotionDates(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPromotion__ValidPromotionDates__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Promotion#validDiscount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Discount</em>' operation.
	 * @see Ecommerce.Promotion#validDiscount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPromotion__ValidDiscount__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see Ecommerce.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Order#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Order#getId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Order#getOrderDate <em>Order Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Date</em>'.
	 * @see Ecommerce.Order#getOrderDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderDate();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Order#getTotalAmount <em>Total Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Amount</em>'.
	 * @see Ecommerce.Order#getTotalAmount()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_TotalAmount();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Order#getTotalDiscount() <em>Get Total Discount</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Total Discount</em>' operation.
	 * @see Ecommerce.Order#getTotalDiscount()
	 * @generated
	 */
	EOperation getOrder__GetTotalDiscount();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Order#isEligibleForFreeShipping() <em>Is Eligible For Free Shipping</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Eligible For Free Shipping</em>' operation.
	 * @see Ecommerce.Order#isEligibleForFreeShipping()
	 * @generated
	 */
	EOperation getOrder__IsEligibleForFreeShipping();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Order#getOrderStatus <em>Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Status</em>'.
	 * @see Ecommerce.Order#getOrderStatus()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderStatus();

	/**
	 * Returns the meta object for the containment reference '{@link Ecommerce.Order#getPaymentDetail <em>Payment Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payment Detail</em>'.
	 * @see Ecommerce.Order#getPaymentDetail()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_PaymentDetail();

	/**
	 * Returns the meta object for the containment reference '{@link Ecommerce.Order#getShipmentDetail <em>Shipment Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shipment Detail</em>'.
	 * @see Ecommerce.Order#getShipmentDetail()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_ShipmentDetail();

	/**
	 * Returns the meta object for the containment reference list '{@link Ecommerce.Order#getOrderItems <em>Order Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Items</em>'.
	 * @see Ecommerce.Order#getOrderItems()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_OrderItems();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Payment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment</em>'.
	 * @see Ecommerce.Payment
	 * @generated
	 */
	EClass getPayment();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Payment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Payment#getId()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Payment#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Ecommerce.Payment#getAmount()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_Amount();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Payment#getPaymentDate <em>Payment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Date</em>'.
	 * @see Ecommerce.Payment#getPaymentDate()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentDate();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Payment#getPaidUsing <em>Paid Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid Using</em>'.
	 * @see Ecommerce.Payment#getPaidUsing()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaidUsing();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Payment#getPaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Status</em>'.
	 * @see Ecommerce.Payment#getPaymentStatus()
	 * @see #getPayment()
	 * @generated
	 */
	EAttribute getPayment_PaymentStatus();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Shipment <em>Shipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipment</em>'.
	 * @see Ecommerce.Shipment
	 * @generated
	 */
	EClass getShipment();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Shipment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Shipment#getId()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Shipment#getCourierName <em>Courier Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Courier Name</em>'.
	 * @see Ecommerce.Shipment#getCourierName()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_CourierName();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Shipment#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see Ecommerce.Shipment#getCost()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_Cost();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Shipment#getEstimatedDelivery <em>Estimated Delivery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Delivery</em>'.
	 * @see Ecommerce.Shipment#getEstimatedDelivery()
	 * @see #getShipment()
	 * @generated
	 */
	EAttribute getShipment_EstimatedDelivery();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Cart <em>Cart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart</em>'.
	 * @see Ecommerce.Cart
	 * @generated
	 */
	EClass getCart();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Cart#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Cart#getId()
	 * @see #getCart()
	 * @generated
	 */
	EAttribute getCart_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Cart#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see Ecommerce.Cart#getCreationDate()
	 * @see #getCart()
	 * @generated
	 */
	EAttribute getCart_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Cart#getLastUpdated <em>Last Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Updated</em>'.
	 * @see Ecommerce.Cart#getLastUpdated()
	 * @see #getCart()
	 * @generated
	 */
	EAttribute getCart_LastUpdated();

	/**
	 * Returns the meta object for the containment reference list '{@link Ecommerce.Cart#getCartContents <em>Cart Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cart Contents</em>'.
	 * @see Ecommerce.Cart#getCartContents()
	 * @see #getCart()
	 * @generated
	 */
	EReference getCart_CartContents();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Cart#getCartTotal <em>Cart Total</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cart Total</em>'.
	 * @see Ecommerce.Cart#getCartTotal()
	 * @see #getCart()
	 * @generated
	 */
	EAttribute getCart_CartTotal();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Cart#nonEmptyCart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Empty Cart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Empty Cart</em>' operation.
	 * @see Ecommerce.Cart#nonEmptyCart(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCart__NonEmptyCart__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Ecommerce.CartContent <em>Cart Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cart Content</em>'.
	 * @see Ecommerce.CartContent
	 * @generated
	 */
	EClass getCartContent();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.CartContent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.CartContent#getId()
	 * @see #getCartContent()
	 * @generated
	 */
	EAttribute getCartContent_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.CartContent#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see Ecommerce.CartContent#getQuantity()
	 * @see #getCartContent()
	 * @generated
	 */
	EAttribute getCartContent_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.CartContent#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Ecommerce.CartContent#getPrice()
	 * @see #getCartContent()
	 * @generated
	 */
	EAttribute getCartContent_Price();

	/**
	 * Returns the meta object for the reference '{@link Ecommerce.CartContent#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Products</em>'.
	 * @see Ecommerce.CartContent#getProducts()
	 * @see #getCartContent()
	 * @generated
	 */
	EReference getCartContent_Products();

	/**
	 * Returns the meta object for class '{@link Ecommerce.Review <em>Review</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Review</em>'.
	 * @see Ecommerce.Review
	 * @generated
	 */
	EClass getReview();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Review#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.Review#getId()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Review#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratings</em>'.
	 * @see Ecommerce.Review#getRatings()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Ratings();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Review#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see Ecommerce.Review#getComment()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_Comment();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.Review#getReviewDate <em>Review Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Review Date</em>'.
	 * @see Ecommerce.Review#getReviewDate()
	 * @see #getReview()
	 * @generated
	 */
	EAttribute getReview_ReviewDate();

	/**
	 * Returns the meta object for the reference '{@link Ecommerce.Review#getReviewedProduct <em>Reviewed Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reviewed Product</em>'.
	 * @see Ecommerce.Review#getReviewedProduct()
	 * @see #getReview()
	 * @generated
	 */
	EReference getReview_ReviewedProduct();

	/**
	 * Returns the meta object for the '{@link Ecommerce.Review#validRatings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Ratings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Ratings</em>' operation.
	 * @see Ecommerce.Review#validRatings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getReview__ValidRatings__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Ecommerce.OrderLineItem <em>Order Line Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Line Item</em>'.
	 * @see Ecommerce.OrderLineItem
	 * @generated
	 */
	EClass getOrderLineItem();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.OrderLineItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Ecommerce.OrderLineItem#getId()
	 * @see #getOrderLineItem()
	 * @generated
	 */
	EAttribute getOrderLineItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.OrderLineItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see Ecommerce.OrderLineItem#getQuantity()
	 * @see #getOrderLineItem()
	 * @generated
	 */
	EAttribute getOrderLineItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.OrderLineItem#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Ecommerce.OrderLineItem#getPrice()
	 * @see #getOrderLineItem()
	 * @generated
	 */
	EAttribute getOrderLineItem_Price();

	/**
	 * Returns the meta object for the reference '{@link Ecommerce.OrderLineItem#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see Ecommerce.OrderLineItem#getProduct()
	 * @see #getOrderLineItem()
	 * @generated
	 */
	EReference getOrderLineItem_Product();

	/**
	 * Returns the meta object for class '{@link Ecommerce.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Ecommerce.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Ecommerce.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Ecommerce.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link Ecommerce.OrderStatus <em>Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Status</em>'.
	 * @see Ecommerce.OrderStatus
	 * @generated
	 */
	EEnum getOrderStatus();

	/**
	 * Returns the meta object for enum '{@link Ecommerce.PaymentMethod <em>Payment Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Method</em>'.
	 * @see Ecommerce.PaymentMethod
	 * @generated
	 */
	EEnum getPaymentMethod();

	/**
	 * Returns the meta object for enum '{@link Ecommerce.PaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Status</em>'.
	 * @see Ecommerce.PaymentStatus
	 * @generated
	 */
	EEnum getPaymentStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcommerceFactory getEcommerceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Ecommerce.impl.EcommercePlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.EcommercePlatformImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getEcommercePlatform()
		 * @generated
		 */
		EClass ECOMMERCE_PLATFORM = eINSTANCE.getEcommercePlatform();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE_PLATFORM__CUSTOMERS = eINSTANCE.getEcommercePlatform_Customers();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE_PLATFORM__PRODUCTS = eINSTANCE.getEcommercePlatform_Products();

		/**
		 * The meta object literal for the '<em><b>Product Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES = eINSTANCE.getEcommercePlatform_ProductCategories();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMMERCE_PLATFORM__URL = eINSTANCE.getEcommercePlatform_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECOMMERCE_PLATFORM__DESCRIPTION = eINSTANCE.getEcommercePlatform_Description();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE_PLATFORM__ORDERS = eINSTANCE.getEcommercePlatform_Orders();

		/**
		 * The meta object literal for the '<em><b>Promotions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE_PLATFORM__PROMOTIONS = eINSTANCE.getEcommercePlatform_Promotions();

		/**
		 * The meta object literal for the '<em><b>Get Average Order Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECOMMERCE_PLATFORM___GET_AVERAGE_ORDER_VALUE = eINSTANCE.getEcommercePlatform__GetAverageOrderValue();

		/**
		 * The meta object literal for the '<em><b>Unique Customer Emails</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECOMMERCE_PLATFORM___UNIQUE_CUSTOMER_EMAILS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEcommercePlatform__UniqueCustomerEmails__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECOMMERCE_PLATFORM___UNIQUE_IDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEcommercePlatform__UniqueIDs__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.CustomerImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ID = eINSTANCE.getCustomer_Id();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_Email();

		/**
		 * The meta object literal for the '<em><b>Date Joined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__DATE_JOINED = eINSTANCE.getCustomer_DateJoined();

		/**
		 * The meta object literal for the '<em><b>Cart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__CART = eINSTANCE.getCustomer_Cart();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ORDERS = eINSTANCE.getCustomer_Orders();

		/**
		 * The meta object literal for the '<em><b>Reviews</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__REVIEWS = eINSTANCE.getCustomer_Reviews();

		/**
		 * The meta object literal for the '<em><b>Get Total Orders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_TOTAL_ORDERS = eINSTANCE.getCustomer__GetTotalOrders();

		/**
		 * The meta object literal for the '<em><b>Valid Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___VALID_EMAIL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCustomer__ValidEmail__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.ProductCategoryImpl <em>Product Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.ProductCategoryImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getProductCategory()
		 * @generated
		 */
		EClass PRODUCT_CATEGORY = eINSTANCE.getProductCategory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__ID = eINSTANCE.getProductCategory_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CATEGORY__DESCRIPTION = eINSTANCE.getProductCategory_Description();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_CATEGORY__PRODUCTS = eINSTANCE.getProductCategory_Products();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.ProductImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DESCRIPTION = eINSTANCE.getProduct_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRICE = eINSTANCE.getProduct_Price();

		/**
		 * The meta object literal for the '<em><b>Stock Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__STOCK_QUANTITY = eINSTANCE.getProduct_StockQuantity();

		/**
		 * The meta object literal for the '<em><b>Date Added</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__DATE_ADDED = eINSTANCE.getProduct_DateAdded();

		/**
		 * The meta object literal for the '<em><b>Product Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_CATEGORY = eINSTANCE.getProduct_ProductCategory();

		/**
		 * The meta object literal for the '<em><b>Applied Promotions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__APPLIED_PROMOTIONS = eINSTANCE.getProduct_AppliedPromotions();

		/**
		 * The meta object literal for the '<em><b>Product Reviews</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCT_REVIEWS = eINSTANCE.getProduct_ProductReviews();

		/**
		 * The meta object literal for the '<em><b>Get Average Ratings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRODUCT___GET_AVERAGE_RATINGS = eINSTANCE.getProduct__GetAverageRatings();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.PromotionImpl <em>Promotion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.PromotionImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getPromotion()
		 * @generated
		 */
		EClass PROMOTION = eINSTANCE.getPromotion();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__ID = eINSTANCE.getPromotion_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__DESCRIPTION = eINSTANCE.getPromotion_Description();

		/**
		 * The meta object literal for the '<em><b>Discount Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__DISCOUNT_PERCENTAGE = eINSTANCE.getPromotion_DiscountPercentage();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__START_DATE = eINSTANCE.getPromotion_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__END_DATE = eINSTANCE.getPromotion_EndDate();

		/**
		 * The meta object literal for the '<em><b>Valid Promotion Dates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMOTION___VALID_PROMOTION_DATES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPromotion__ValidPromotionDates__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Valid Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROMOTION___VALID_DISCOUNT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPromotion__ValidDiscount__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.OrderImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ID = eINSTANCE.getOrder_Id();

		/**
		 * The meta object literal for the '<em><b>Order Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_DATE = eINSTANCE.getOrder_OrderDate();

		/**
		 * The meta object literal for the '<em><b>Total Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TOTAL_AMOUNT = eINSTANCE.getOrder_TotalAmount();

		/**
		 * The meta object literal for the '<em><b>Get Total Discount</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER___GET_TOTAL_DISCOUNT = eINSTANCE.getOrder__GetTotalDiscount();

		/**
		 * The meta object literal for the '<em><b>Is Eligible For Free Shipping</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORDER___IS_ELIGIBLE_FOR_FREE_SHIPPING = eINSTANCE.getOrder__IsEligibleForFreeShipping();

		/**
		 * The meta object literal for the '<em><b>Order Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_STATUS = eINSTANCE.getOrder_OrderStatus();

		/**
		 * The meta object literal for the '<em><b>Payment Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PAYMENT_DETAIL = eINSTANCE.getOrder_PaymentDetail();

		/**
		 * The meta object literal for the '<em><b>Shipment Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__SHIPMENT_DETAIL = eINSTANCE.getOrder_ShipmentDetail();

		/**
		 * The meta object literal for the '<em><b>Order Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ORDER_ITEMS = eINSTANCE.getOrder_OrderItems();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.PaymentImpl <em>Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.PaymentImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getPayment()
		 * @generated
		 */
		EClass PAYMENT = eINSTANCE.getPayment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__ID = eINSTANCE.getPayment_Id();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__AMOUNT = eINSTANCE.getPayment_Amount();

		/**
		 * The meta object literal for the '<em><b>Payment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_DATE = eINSTANCE.getPayment_PaymentDate();

		/**
		 * The meta object literal for the '<em><b>Paid Using</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAID_USING = eINSTANCE.getPayment_PaidUsing();

		/**
		 * The meta object literal for the '<em><b>Payment Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT__PAYMENT_STATUS = eINSTANCE.getPayment_PaymentStatus();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.ShipmentImpl <em>Shipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.ShipmentImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getShipment()
		 * @generated
		 */
		EClass SHIPMENT = eINSTANCE.getShipment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__ID = eINSTANCE.getShipment_Id();

		/**
		 * The meta object literal for the '<em><b>Courier Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__COURIER_NAME = eINSTANCE.getShipment_CourierName();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__COST = eINSTANCE.getShipment_Cost();

		/**
		 * The meta object literal for the '<em><b>Estimated Delivery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIPMENT__ESTIMATED_DELIVERY = eINSTANCE.getShipment_EstimatedDelivery();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.CartImpl <em>Cart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.CartImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getCart()
		 * @generated
		 */
		EClass CART = eINSTANCE.getCart();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART__ID = eINSTANCE.getCart_Id();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART__CREATION_DATE = eINSTANCE.getCart_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART__LAST_UPDATED = eINSTANCE.getCart_LastUpdated();

		/**
		 * The meta object literal for the '<em><b>Cart Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART__CART_CONTENTS = eINSTANCE.getCart_CartContents();

		/**
		 * The meta object literal for the '<em><b>Cart Total</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART__CART_TOTAL = eINSTANCE.getCart_CartTotal();

		/**
		 * The meta object literal for the '<em><b>Non Empty Cart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CART___NON_EMPTY_CART__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCart__NonEmptyCart__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.CartContentImpl <em>Cart Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.CartContentImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getCartContent()
		 * @generated
		 */
		EClass CART_CONTENT = eINSTANCE.getCartContent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_CONTENT__ID = eINSTANCE.getCartContent_Id();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_CONTENT__QUANTITY = eINSTANCE.getCartContent_Quantity();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CART_CONTENT__PRICE = eINSTANCE.getCartContent_Price();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CART_CONTENT__PRODUCTS = eINSTANCE.getCartContent_Products();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.ReviewImpl <em>Review</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.ReviewImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getReview()
		 * @generated
		 */
		EClass REVIEW = eINSTANCE.getReview();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__ID = eINSTANCE.getReview_Id();

		/**
		 * The meta object literal for the '<em><b>Ratings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__RATINGS = eINSTANCE.getReview_Ratings();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__COMMENT = eINSTANCE.getReview_Comment();

		/**
		 * The meta object literal for the '<em><b>Review Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVIEW__REVIEW_DATE = eINSTANCE.getReview_ReviewDate();

		/**
		 * The meta object literal for the '<em><b>Reviewed Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVIEW__REVIEWED_PRODUCT = eINSTANCE.getReview_ReviewedProduct();

		/**
		 * The meta object literal for the '<em><b>Valid Ratings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REVIEW___VALID_RATINGS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getReview__ValidRatings__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.OrderLineItemImpl <em>Order Line Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.OrderLineItemImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getOrderLineItem()
		 * @generated
		 */
		EClass ORDER_LINE_ITEM = eINSTANCE.getOrderLineItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LINE_ITEM__ID = eINSTANCE.getOrderLineItem_Id();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LINE_ITEM__QUANTITY = eINSTANCE.getOrderLineItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LINE_ITEM__PRICE = eINSTANCE.getOrderLineItem_Price();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_LINE_ITEM__PRODUCT = eINSTANCE.getOrderLineItem_Product();

		/**
		 * The meta object literal for the '{@link Ecommerce.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.impl.NamedElementImpl
		 * @see Ecommerce.impl.EcommercePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link Ecommerce.OrderStatus <em>Order Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.OrderStatus
		 * @see Ecommerce.impl.EcommercePackageImpl#getOrderStatus()
		 * @generated
		 */
		EEnum ORDER_STATUS = eINSTANCE.getOrderStatus();

		/**
		 * The meta object literal for the '{@link Ecommerce.PaymentMethod <em>Payment Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.PaymentMethod
		 * @see Ecommerce.impl.EcommercePackageImpl#getPaymentMethod()
		 * @generated
		 */
		EEnum PAYMENT_METHOD = eINSTANCE.getPaymentMethod();

		/**
		 * The meta object literal for the '{@link Ecommerce.PaymentStatus <em>Payment Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Ecommerce.PaymentStatus
		 * @see Ecommerce.impl.EcommercePackageImpl#getPaymentStatus()
		 * @generated
		 */
		EEnum PAYMENT_STATUS = eINSTANCE.getPaymentStatus();

	}

} //EcommercePackage

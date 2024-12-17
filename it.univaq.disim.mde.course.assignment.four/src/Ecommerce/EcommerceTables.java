/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /it.univaq.disim.mde.course.assignment.four/model/Ecommerce.ecore
 * using:
 *   /it.univaq.disim.mde.course.assignment.four/model/Ecommerce.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package Ecommerce;

// import Ecommerce.EcommercePackage;
// import Ecommerce.EcommerceTables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * EcommerceTables provides the dispatch tables for the Ecommerce for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class EcommerceTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(EcommercePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce = IdManager.getNsURIPackageId("https://it.univaq.disim.mde.course.assignment.four/Ecommerce", null, EcommercePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Cart = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("Cart", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CartContent = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("CartContent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Customer = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("Customer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EcommercePlatform = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("EcommercePlatform", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Order = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("Order", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OrderLineItem = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("OrderLineItem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Payment = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("Payment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Product = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("Product", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProductCategory = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("ProductCategory", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Promotion = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("Promotion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Review = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("Review", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Shipment = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getClassId("Shipment", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = EcommerceTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = EcommerceTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = EcommerceTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_OrderStatus = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getEnumerationId("OrderStatus");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PaymentMethod = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getEnumerationId("PaymentMethod");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PaymentStatus = EcommerceTables.PACKid_https_c_s_s_it_univaq_disim_mde_course_assignment_four_s_Ecommerce.getEnumerationId("PaymentStatus");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_100 = ValueUtil.integerValueOf("100");
	public static final /*@NonInvalid*/ IntegerValue INT_5 = ValueUtil.integerValueOf("5");
	public static final /*@NonInvalid*/ RealValue REA_0_0 = ValueUtil.realValueOf("0.0");
	public static final /*@NonInvalid*/ RealValue REA_100_0 = ValueUtil.realValueOf("100.0");
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_Real = TypeId.SEQUENCE.getSpecializedId(TypeId.REAL);
	public static final /*@NonInvalid*/ String STR__94_91_A_m_Za_m_z0_m_9___37_p_m_93_p_64_91_A_m_Za_m_z0_m_9_m_93_p_92__91_A_m_Za_m_z_93_123_2_44_125_$ = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_CartContent = TypeId.BAG.getSpecializedId(EcommerceTables.CLSSid_CartContent);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Customer = TypeId.BAG.getSpecializedId(EcommerceTables.CLSSid_Customer);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_OrderLineItem = TypeId.BAG.getSpecializedId(EcommerceTables.CLSSid_OrderLineItem);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Product = TypeId.BAG.getSpecializedId(EcommerceTables.CLSSid_Product);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_CartContent = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_CartContent);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Customer = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_Customer);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Order = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_Order);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_OrderLineItem = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_OrderLineItem);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Product = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_Product);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ProductCategory = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_ProductCategory);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Promotion = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_Promotion);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Review = TypeId.ORDERED_SET.getSpecializedId(EcommerceTables.CLSSid_Review);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EFloat = TypeId.SEQUENCE.getSpecializedId(EcommerceTables.DATAid_EFloat);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EInt = TypeId.SEQUENCE.getSpecializedId(EcommerceTables.DATAid_EInt);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			EcommerceTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Cart = new EcoreExecutorType(EcommercePackage.Literals.CART, PACKAGE, 0);
		public static final EcoreExecutorType _CartContent = new EcoreExecutorType(EcommercePackage.Literals.CART_CONTENT, PACKAGE, 0);
		public static final EcoreExecutorType _Customer = new EcoreExecutorType(EcommercePackage.Literals.CUSTOMER, PACKAGE, 0);
		public static final EcoreExecutorType _EcommercePlatform = new EcoreExecutorType(EcommercePackage.Literals.ECOMMERCE_PLATFORM, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(EcommercePackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Order = new EcoreExecutorType(EcommercePackage.Literals.ORDER, PACKAGE, 0);
		public static final EcoreExecutorType _OrderLineItem = new EcoreExecutorType(EcommercePackage.Literals.ORDER_LINE_ITEM, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _OrderStatus = new EcoreExecutorEnumeration(EcommercePackage.Literals.ORDER_STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _Payment = new EcoreExecutorType(EcommercePackage.Literals.PAYMENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PaymentMethod = new EcoreExecutorEnumeration(EcommercePackage.Literals.PAYMENT_METHOD, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PaymentStatus = new EcoreExecutorEnumeration(EcommercePackage.Literals.PAYMENT_STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _Product = new EcoreExecutorType(EcommercePackage.Literals.PRODUCT, PACKAGE, 0);
		public static final EcoreExecutorType _ProductCategory = new EcoreExecutorType(EcommercePackage.Literals.PRODUCT_CATEGORY, PACKAGE, 0);
		public static final EcoreExecutorType _Promotion = new EcoreExecutorType(EcommercePackage.Literals.PROMOTION, PACKAGE, 0);
		public static final EcoreExecutorType _Review = new EcoreExecutorType(EcommercePackage.Literals.REVIEW, PACKAGE, 0);
		public static final EcoreExecutorType _Shipment = new EcoreExecutorType(EcommercePackage.Literals.SHIPMENT, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Cart,
			_CartContent,
			_Customer,
			_EcommercePlatform,
			_NamedElement,
			_Order,
			_OrderLineItem,
			_OrderStatus,
			_Payment,
			_PaymentMethod,
			_PaymentStatus,
			_Product,
			_ProductCategory,
			_Promotion,
			_Review,
			_Shipment
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Cart__Cart = new ExecutorFragment(Types._Cart, EcommerceTables.Types._Cart);
		private static final ExecutorFragment _Cart__OclAny = new ExecutorFragment(Types._Cart, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Cart__OclElement = new ExecutorFragment(Types._Cart, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CartContent__CartContent = new ExecutorFragment(Types._CartContent, EcommerceTables.Types._CartContent);
		private static final ExecutorFragment _CartContent__OclAny = new ExecutorFragment(Types._CartContent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CartContent__OclElement = new ExecutorFragment(Types._CartContent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Customer__Customer = new ExecutorFragment(Types._Customer, EcommerceTables.Types._Customer);
		private static final ExecutorFragment _Customer__NamedElement = new ExecutorFragment(Types._Customer, EcommerceTables.Types._NamedElement);
		private static final ExecutorFragment _Customer__OclAny = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Customer__OclElement = new ExecutorFragment(Types._Customer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EcommercePlatform__EcommercePlatform = new ExecutorFragment(Types._EcommercePlatform, EcommerceTables.Types._EcommercePlatform);
		private static final ExecutorFragment _EcommercePlatform__NamedElement = new ExecutorFragment(Types._EcommercePlatform, EcommerceTables.Types._NamedElement);
		private static final ExecutorFragment _EcommercePlatform__OclAny = new ExecutorFragment(Types._EcommercePlatform, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EcommercePlatform__OclElement = new ExecutorFragment(Types._EcommercePlatform, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, EcommerceTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Order__OclAny = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Order__OclElement = new ExecutorFragment(Types._Order, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Order__Order = new ExecutorFragment(Types._Order, EcommerceTables.Types._Order);

		private static final ExecutorFragment _OrderLineItem__OclAny = new ExecutorFragment(Types._OrderLineItem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrderLineItem__OclElement = new ExecutorFragment(Types._OrderLineItem, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrderLineItem__OrderLineItem = new ExecutorFragment(Types._OrderLineItem, EcommerceTables.Types._OrderLineItem);

		private static final ExecutorFragment _OrderStatus__OclAny = new ExecutorFragment(Types._OrderStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrderStatus__OclElement = new ExecutorFragment(Types._OrderStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrderStatus__OclEnumeration = new ExecutorFragment(Types._OrderStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _OrderStatus__OclType = new ExecutorFragment(Types._OrderStatus, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _OrderStatus__OrderStatus = new ExecutorFragment(Types._OrderStatus, EcommerceTables.Types._OrderStatus);

		private static final ExecutorFragment _Payment__OclAny = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Payment__OclElement = new ExecutorFragment(Types._Payment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Payment__Payment = new ExecutorFragment(Types._Payment, EcommerceTables.Types._Payment);

		private static final ExecutorFragment _PaymentMethod__OclAny = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentMethod__OclElement = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentMethod__OclEnumeration = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PaymentMethod__OclType = new ExecutorFragment(Types._PaymentMethod, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PaymentMethod__PaymentMethod = new ExecutorFragment(Types._PaymentMethod, EcommerceTables.Types._PaymentMethod);

		private static final ExecutorFragment _PaymentStatus__OclAny = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PaymentStatus__OclElement = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PaymentStatus__OclEnumeration = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PaymentStatus__OclType = new ExecutorFragment(Types._PaymentStatus, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PaymentStatus__PaymentStatus = new ExecutorFragment(Types._PaymentStatus, EcommerceTables.Types._PaymentStatus);

		private static final ExecutorFragment _Product__NamedElement = new ExecutorFragment(Types._Product, EcommerceTables.Types._NamedElement);
		private static final ExecutorFragment _Product__OclAny = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Product__OclElement = new ExecutorFragment(Types._Product, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Product__Product = new ExecutorFragment(Types._Product, EcommerceTables.Types._Product);

		private static final ExecutorFragment _ProductCategory__NamedElement = new ExecutorFragment(Types._ProductCategory, EcommerceTables.Types._NamedElement);
		private static final ExecutorFragment _ProductCategory__OclAny = new ExecutorFragment(Types._ProductCategory, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProductCategory__OclElement = new ExecutorFragment(Types._ProductCategory, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProductCategory__ProductCategory = new ExecutorFragment(Types._ProductCategory, EcommerceTables.Types._ProductCategory);

		private static final ExecutorFragment _Promotion__NamedElement = new ExecutorFragment(Types._Promotion, EcommerceTables.Types._NamedElement);
		private static final ExecutorFragment _Promotion__OclAny = new ExecutorFragment(Types._Promotion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Promotion__OclElement = new ExecutorFragment(Types._Promotion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Promotion__Promotion = new ExecutorFragment(Types._Promotion, EcommerceTables.Types._Promotion);

		private static final ExecutorFragment _Review__OclAny = new ExecutorFragment(Types._Review, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Review__OclElement = new ExecutorFragment(Types._Review, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Review__Review = new ExecutorFragment(Types._Review, EcommerceTables.Types._Review);

		private static final ExecutorFragment _Shipment__OclAny = new ExecutorFragment(Types._Shipment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Shipment__OclElement = new ExecutorFragment(Types._Shipment, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Shipment__Shipment = new ExecutorFragment(Types._Shipment, EcommerceTables.Types._Shipment);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Customer__getTotalOrders = new ExecutorOperation("getTotalOrders", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Customer,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _EcommercePlatform__getAverageOrderValue = new ExecutorOperation("getAverageOrderValue", TypeUtil.EMPTY_PARAMETER_TYPES, Types._EcommercePlatform,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Order__getTotalDiscount = new ExecutorOperation("getTotalDiscount", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Order,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Order__isEligibleForFreeShipping = new ExecutorOperation("isEligibleForFreeShipping", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Order,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Product__getAverageRatings = new ExecutorOperation("getAverageRatings", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Product,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Cart__cartContents = new EcoreExecutorProperty(EcommercePackage.Literals.CART__CART_CONTENTS, Types._Cart, 0);
		public static final ExecutorProperty _Cart__cartTotal = new EcoreExecutorProperty(EcommercePackage.Literals.CART__CART_TOTAL, Types._Cart, 1);
		public static final ExecutorProperty _Cart__creationDate = new EcoreExecutorProperty(EcommercePackage.Literals.CART__CREATION_DATE, Types._Cart, 2);
		public static final ExecutorProperty _Cart__id = new EcoreExecutorProperty(EcommercePackage.Literals.CART__ID, Types._Cart, 3);
		public static final ExecutorProperty _Cart__lastUpdated = new EcoreExecutorProperty(EcommercePackage.Literals.CART__LAST_UPDATED, Types._Cart, 4);
		public static final ExecutorProperty _Cart__Customer__cart = new ExecutorPropertyWithImplementation("Customer", Types._Cart, 5, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.CUSTOMER__CART));

		public static final ExecutorProperty _CartContent__id = new EcoreExecutorProperty(EcommercePackage.Literals.CART_CONTENT__ID, Types._CartContent, 0);
		public static final ExecutorProperty _CartContent__price = new EcoreExecutorProperty(EcommercePackage.Literals.CART_CONTENT__PRICE, Types._CartContent, 1);
		public static final ExecutorProperty _CartContent__products = new EcoreExecutorProperty(EcommercePackage.Literals.CART_CONTENT__PRODUCTS, Types._CartContent, 2);
		public static final ExecutorProperty _CartContent__quantity = new EcoreExecutorProperty(EcommercePackage.Literals.CART_CONTENT__QUANTITY, Types._CartContent, 3);
		public static final ExecutorProperty _CartContent__Cart__cartContents = new ExecutorPropertyWithImplementation("Cart", Types._CartContent, 4, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.CART__CART_CONTENTS));

		public static final ExecutorProperty _Customer__cart = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__CART, Types._Customer, 0);
		public static final ExecutorProperty _Customer__dateJoined = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__DATE_JOINED, Types._Customer, 1);
		public static final ExecutorProperty _Customer__email = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__EMAIL, Types._Customer, 2);
		public static final ExecutorProperty _Customer__id = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__ID, Types._Customer, 3);
		public static final ExecutorProperty _Customer__orders = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__ORDERS, Types._Customer, 4);
		public static final ExecutorProperty _Customer__reviews = new EcoreExecutorProperty(EcommercePackage.Literals.CUSTOMER__REVIEWS, Types._Customer, 5);
		public static final ExecutorProperty _Customer__EcommercePlatform__customers = new ExecutorPropertyWithImplementation("EcommercePlatform", Types._Customer, 6, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__CUSTOMERS));

		public static final ExecutorProperty _EcommercePlatform__customers = new EcoreExecutorProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__CUSTOMERS, Types._EcommercePlatform, 0);
		public static final ExecutorProperty _EcommercePlatform__description = new EcoreExecutorProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__DESCRIPTION, Types._EcommercePlatform, 1);
		public static final ExecutorProperty _EcommercePlatform__orders = new EcoreExecutorProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__ORDERS, Types._EcommercePlatform, 2);
		public static final ExecutorProperty _EcommercePlatform__productCategories = new EcoreExecutorProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES, Types._EcommercePlatform, 3);
		public static final ExecutorProperty _EcommercePlatform__products = new EcoreExecutorProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PRODUCTS, Types._EcommercePlatform, 4);
		public static final ExecutorProperty _EcommercePlatform__promotions = new EcoreExecutorProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PROMOTIONS, Types._EcommercePlatform, 5);
		public static final ExecutorProperty _EcommercePlatform__url = new EcoreExecutorProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__URL, Types._EcommercePlatform, 6);

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(EcommercePackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Order__id = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__ID, Types._Order, 0);
		public static final ExecutorProperty _Order__orderDate = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__ORDER_DATE, Types._Order, 1);
		public static final ExecutorProperty _Order__orderItems = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__ORDER_ITEMS, Types._Order, 2);
		public static final ExecutorProperty _Order__orderStatus = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__ORDER_STATUS, Types._Order, 3);
		public static final ExecutorProperty _Order__paymentDetail = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__PAYMENT_DETAIL, Types._Order, 4);
		public static final ExecutorProperty _Order__shipmentDetail = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__SHIPMENT_DETAIL, Types._Order, 5);
		public static final ExecutorProperty _Order__totalAmount = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER__TOTAL_AMOUNT, Types._Order, 6);
		public static final ExecutorProperty _Order__Customer__orders = new ExecutorPropertyWithImplementation("Customer", Types._Order, 7, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.CUSTOMER__ORDERS));
		public static final ExecutorProperty _Order__EcommercePlatform__orders = new ExecutorPropertyWithImplementation("EcommercePlatform", Types._Order, 8, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__ORDERS));

		public static final ExecutorProperty _OrderLineItem__id = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER_LINE_ITEM__ID, Types._OrderLineItem, 0);
		public static final ExecutorProperty _OrderLineItem__price = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER_LINE_ITEM__PRICE, Types._OrderLineItem, 1);
		public static final ExecutorProperty _OrderLineItem__product = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER_LINE_ITEM__PRODUCT, Types._OrderLineItem, 2);
		public static final ExecutorProperty _OrderLineItem__quantity = new EcoreExecutorProperty(EcommercePackage.Literals.ORDER_LINE_ITEM__QUANTITY, Types._OrderLineItem, 3);
		public static final ExecutorProperty _OrderLineItem__Order__orderItems = new ExecutorPropertyWithImplementation("Order", Types._OrderLineItem, 4, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ORDER__ORDER_ITEMS));

		public static final ExecutorProperty _Payment__amount = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT__AMOUNT, Types._Payment, 0);
		public static final ExecutorProperty _Payment__id = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT__ID, Types._Payment, 1);
		public static final ExecutorProperty _Payment__paidUsing = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT__PAID_USING, Types._Payment, 2);
		public static final ExecutorProperty _Payment__paymentDate = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT__PAYMENT_DATE, Types._Payment, 3);
		public static final ExecutorProperty _Payment__paymentStatus = new EcoreExecutorProperty(EcommercePackage.Literals.PAYMENT__PAYMENT_STATUS, Types._Payment, 4);
		public static final ExecutorProperty _Payment__Order__paymentDetail = new ExecutorPropertyWithImplementation("Order", Types._Payment, 5, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ORDER__PAYMENT_DETAIL));

		public static final ExecutorProperty _Product__appliedPromotions = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT__APPLIED_PROMOTIONS, Types._Product, 0);
		public static final ExecutorProperty _Product__dateAdded = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT__DATE_ADDED, Types._Product, 1);
		public static final ExecutorProperty _Product__description = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT__DESCRIPTION, Types._Product, 2);
		public static final ExecutorProperty _Product__id = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT__ID, Types._Product, 3);
		public static final ExecutorProperty _Product__price = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT__PRICE, Types._Product, 4);
		public static final ExecutorProperty _Product__productCategory = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT__PRODUCT_CATEGORY, Types._Product, 5);
		public static final ExecutorProperty _Product__productReviews = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT__PRODUCT_REVIEWS, Types._Product, 6);
		public static final ExecutorProperty _Product__stockQuantity = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT__STOCK_QUANTITY, Types._Product, 7);
		public static final ExecutorProperty _Product__CartContent__products = new ExecutorPropertyWithImplementation("CartContent", Types._Product, 8, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.CART_CONTENT__PRODUCTS));
		public static final ExecutorProperty _Product__EcommercePlatform__products = new ExecutorPropertyWithImplementation("EcommercePlatform", Types._Product, 9, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PRODUCTS));
		public static final ExecutorProperty _Product__OrderLineItem__product = new ExecutorPropertyWithImplementation("OrderLineItem", Types._Product, 10, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ORDER_LINE_ITEM__PRODUCT));

		public static final ExecutorProperty _ProductCategory__description = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT_CATEGORY__DESCRIPTION, Types._ProductCategory, 0);
		public static final ExecutorProperty _ProductCategory__id = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT_CATEGORY__ID, Types._ProductCategory, 1);
		public static final ExecutorProperty _ProductCategory__products = new EcoreExecutorProperty(EcommercePackage.Literals.PRODUCT_CATEGORY__PRODUCTS, Types._ProductCategory, 2);
		public static final ExecutorProperty _ProductCategory__EcommercePlatform__productCategories = new ExecutorPropertyWithImplementation("EcommercePlatform", Types._ProductCategory, 3, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES));

		public static final ExecutorProperty _Promotion__description = new EcoreExecutorProperty(EcommercePackage.Literals.PROMOTION__DESCRIPTION, Types._Promotion, 0);
		public static final ExecutorProperty _Promotion__discountPercentage = new EcoreExecutorProperty(EcommercePackage.Literals.PROMOTION__DISCOUNT_PERCENTAGE, Types._Promotion, 1);
		public static final ExecutorProperty _Promotion__endDate = new EcoreExecutorProperty(EcommercePackage.Literals.PROMOTION__END_DATE, Types._Promotion, 2);
		public static final ExecutorProperty _Promotion__id = new EcoreExecutorProperty(EcommercePackage.Literals.PROMOTION__ID, Types._Promotion, 3);
		public static final ExecutorProperty _Promotion__startDate = new EcoreExecutorProperty(EcommercePackage.Literals.PROMOTION__START_DATE, Types._Promotion, 4);
		public static final ExecutorProperty _Promotion__EcommercePlatform__promotions = new ExecutorPropertyWithImplementation("EcommercePlatform", Types._Promotion, 5, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ECOMMERCE_PLATFORM__PROMOTIONS));
		public static final ExecutorProperty _Promotion__Product__appliedPromotions = new ExecutorPropertyWithImplementation("Product", Types._Promotion, 6, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.PRODUCT__APPLIED_PROMOTIONS));

		public static final ExecutorProperty _Review__comment = new EcoreExecutorProperty(EcommercePackage.Literals.REVIEW__COMMENT, Types._Review, 0);
		public static final ExecutorProperty _Review__id = new EcoreExecutorProperty(EcommercePackage.Literals.REVIEW__ID, Types._Review, 1);
		public static final ExecutorProperty _Review__ratings = new EcoreExecutorProperty(EcommercePackage.Literals.REVIEW__RATINGS, Types._Review, 2);
		public static final ExecutorProperty _Review__reviewDate = new EcoreExecutorProperty(EcommercePackage.Literals.REVIEW__REVIEW_DATE, Types._Review, 3);
		public static final ExecutorProperty _Review__reviewedProduct = new EcoreExecutorProperty(EcommercePackage.Literals.REVIEW__REVIEWED_PRODUCT, Types._Review, 4);
		public static final ExecutorProperty _Review__Customer__reviews = new ExecutorPropertyWithImplementation("Customer", Types._Review, 5, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.CUSTOMER__REVIEWS));

		public static final ExecutorProperty _Shipment__cost = new EcoreExecutorProperty(EcommercePackage.Literals.SHIPMENT__COST, Types._Shipment, 0);
		public static final ExecutorProperty _Shipment__courierName = new EcoreExecutorProperty(EcommercePackage.Literals.SHIPMENT__COURIER_NAME, Types._Shipment, 1);
		public static final ExecutorProperty _Shipment__estimatedDelivery = new EcoreExecutorProperty(EcommercePackage.Literals.SHIPMENT__ESTIMATED_DELIVERY, Types._Shipment, 2);
		public static final ExecutorProperty _Shipment__id = new EcoreExecutorProperty(EcommercePackage.Literals.SHIPMENT__ID, Types._Shipment, 3);
		public static final ExecutorProperty _Shipment__Order__shipmentDetail = new ExecutorPropertyWithImplementation("Order", Types._Shipment, 4, new EcoreLibraryOppositeProperty(EcommercePackage.Literals.ORDER__SHIPMENT_DETAIL));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Cart =
			{
				Fragments._Cart__OclAny /* 0 */,
				Fragments._Cart__OclElement /* 1 */,
				Fragments._Cart__Cart /* 2 */
			};
		private static final int /*@NonNull*/ [] __Cart = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CartContent =
			{
				Fragments._CartContent__OclAny /* 0 */,
				Fragments._CartContent__OclElement /* 1 */,
				Fragments._CartContent__CartContent /* 2 */
			};
		private static final int /*@NonNull*/ [] __CartContent = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Customer =
			{
				Fragments._Customer__OclAny /* 0 */,
				Fragments._Customer__OclElement /* 1 */,
				Fragments._Customer__NamedElement /* 2 */,
				Fragments._Customer__Customer /* 3 */
			};
		private static final int /*@NonNull*/ [] __Customer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EcommercePlatform =
			{
				Fragments._EcommercePlatform__OclAny /* 0 */,
				Fragments._EcommercePlatform__OclElement /* 1 */,
				Fragments._EcommercePlatform__NamedElement /* 2 */,
				Fragments._EcommercePlatform__EcommercePlatform /* 3 */
			};
		private static final int /*@NonNull*/ [] __EcommercePlatform = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Order =
			{
				Fragments._Order__OclAny /* 0 */,
				Fragments._Order__OclElement /* 1 */,
				Fragments._Order__Order /* 2 */
			};
		private static final int /*@NonNull*/ [] __Order = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrderLineItem =
			{
				Fragments._OrderLineItem__OclAny /* 0 */,
				Fragments._OrderLineItem__OclElement /* 1 */,
				Fragments._OrderLineItem__OrderLineItem /* 2 */
			};
		private static final int /*@NonNull*/ [] __OrderLineItem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrderStatus =
			{
				Fragments._OrderStatus__OclAny /* 0 */,
				Fragments._OrderStatus__OclElement /* 1 */,
				Fragments._OrderStatus__OclType /* 2 */,
				Fragments._OrderStatus__OclEnumeration /* 3 */,
				Fragments._OrderStatus__OrderStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __OrderStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Payment =
			{
				Fragments._Payment__OclAny /* 0 */,
				Fragments._Payment__OclElement /* 1 */,
				Fragments._Payment__Payment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Payment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentMethod =
			{
				Fragments._PaymentMethod__OclAny /* 0 */,
				Fragments._PaymentMethod__OclElement /* 1 */,
				Fragments._PaymentMethod__OclType /* 2 */,
				Fragments._PaymentMethod__OclEnumeration /* 3 */,
				Fragments._PaymentMethod__PaymentMethod /* 4 */
			};
		private static final int /*@NonNull*/ [] __PaymentMethod = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PaymentStatus =
			{
				Fragments._PaymentStatus__OclAny /* 0 */,
				Fragments._PaymentStatus__OclElement /* 1 */,
				Fragments._PaymentStatus__OclType /* 2 */,
				Fragments._PaymentStatus__OclEnumeration /* 3 */,
				Fragments._PaymentStatus__PaymentStatus /* 4 */
			};
		private static final int /*@NonNull*/ [] __PaymentStatus = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Product =
			{
				Fragments._Product__OclAny /* 0 */,
				Fragments._Product__OclElement /* 1 */,
				Fragments._Product__NamedElement /* 2 */,
				Fragments._Product__Product /* 3 */
			};
		private static final int /*@NonNull*/ [] __Product = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProductCategory =
			{
				Fragments._ProductCategory__OclAny /* 0 */,
				Fragments._ProductCategory__OclElement /* 1 */,
				Fragments._ProductCategory__NamedElement /* 2 */,
				Fragments._ProductCategory__ProductCategory /* 3 */
			};
		private static final int /*@NonNull*/ [] __ProductCategory = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Promotion =
			{
				Fragments._Promotion__OclAny /* 0 */,
				Fragments._Promotion__OclElement /* 1 */,
				Fragments._Promotion__NamedElement /* 2 */,
				Fragments._Promotion__Promotion /* 3 */
			};
		private static final int /*@NonNull*/ [] __Promotion = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Review =
			{
				Fragments._Review__OclAny /* 0 */,
				Fragments._Review__OclElement /* 1 */,
				Fragments._Review__Review /* 2 */
			};
		private static final int /*@NonNull*/ [] __Review = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Shipment =
			{
				Fragments._Shipment__OclAny /* 0 */,
				Fragments._Shipment__OclElement /* 1 */,
				Fragments._Shipment__Shipment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Shipment = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Cart.initFragments(_Cart, __Cart);
			Types._CartContent.initFragments(_CartContent, __CartContent);
			Types._Customer.initFragments(_Customer, __Customer);
			Types._EcommercePlatform.initFragments(_EcommercePlatform, __EcommercePlatform);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Order.initFragments(_Order, __Order);
			Types._OrderLineItem.initFragments(_OrderLineItem, __OrderLineItem);
			Types._OrderStatus.initFragments(_OrderStatus, __OrderStatus);
			Types._Payment.initFragments(_Payment, __Payment);
			Types._PaymentMethod.initFragments(_PaymentMethod, __PaymentMethod);
			Types._PaymentStatus.initFragments(_PaymentStatus, __PaymentStatus);
			Types._Product.initFragments(_Product, __Product);
			Types._ProductCategory.initFragments(_ProductCategory, __ProductCategory);
			Types._Promotion.initFragments(_Promotion, __Promotion);
			Types._Review.initFragments(_Review, __Review);
			Types._Shipment.initFragments(_Shipment, __Shipment);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Cart__Cart = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Cart__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Cart__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CartContent__CartContent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CartContent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CartContent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Customer__Customer = {
			EcommerceTables.Operations._Customer__getTotalOrders /* getTotalOrders() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Customer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EcommercePlatform__EcommercePlatform = {
			EcommerceTables.Operations._EcommercePlatform__getAverageOrderValue /* getAverageOrderValue() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EcommercePlatform__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EcommercePlatform__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EcommercePlatform__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Order__Order = {
			EcommerceTables.Operations._Order__getTotalDiscount /* getTotalDiscount() */,
			EcommerceTables.Operations._Order__isEligibleForFreeShipping /* isEligibleForFreeShipping() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Order__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OrderLineItem__OrderLineItem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderLineItem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderLineItem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OrderStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Payment__Payment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Payment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__PaymentMethod = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentMethod__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__PaymentStatus = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PaymentStatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Product__Product = {
			EcommerceTables.Operations._Product__getAverageRatings /* getAverageRatings() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Product__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProductCategory__ProductCategory = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductCategory__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductCategory__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProductCategory__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Promotion__Promotion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Promotion__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Promotion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Promotion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Review__Review = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Review__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Review__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Shipment__Shipment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Shipment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Shipment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cart__Cart.initOperations(_Cart__Cart);
			Fragments._Cart__OclAny.initOperations(_Cart__OclAny);
			Fragments._Cart__OclElement.initOperations(_Cart__OclElement);

			Fragments._CartContent__CartContent.initOperations(_CartContent__CartContent);
			Fragments._CartContent__OclAny.initOperations(_CartContent__OclAny);
			Fragments._CartContent__OclElement.initOperations(_CartContent__OclElement);

			Fragments._Customer__Customer.initOperations(_Customer__Customer);
			Fragments._Customer__NamedElement.initOperations(_Customer__NamedElement);
			Fragments._Customer__OclAny.initOperations(_Customer__OclAny);
			Fragments._Customer__OclElement.initOperations(_Customer__OclElement);

			Fragments._EcommercePlatform__EcommercePlatform.initOperations(_EcommercePlatform__EcommercePlatform);
			Fragments._EcommercePlatform__NamedElement.initOperations(_EcommercePlatform__NamedElement);
			Fragments._EcommercePlatform__OclAny.initOperations(_EcommercePlatform__OclAny);
			Fragments._EcommercePlatform__OclElement.initOperations(_EcommercePlatform__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Order__OclAny.initOperations(_Order__OclAny);
			Fragments._Order__OclElement.initOperations(_Order__OclElement);
			Fragments._Order__Order.initOperations(_Order__Order);

			Fragments._OrderLineItem__OclAny.initOperations(_OrderLineItem__OclAny);
			Fragments._OrderLineItem__OclElement.initOperations(_OrderLineItem__OclElement);
			Fragments._OrderLineItem__OrderLineItem.initOperations(_OrderLineItem__OrderLineItem);

			Fragments._OrderStatus__OclAny.initOperations(_OrderStatus__OclAny);
			Fragments._OrderStatus__OclElement.initOperations(_OrderStatus__OclElement);
			Fragments._OrderStatus__OclEnumeration.initOperations(_OrderStatus__OclEnumeration);
			Fragments._OrderStatus__OclType.initOperations(_OrderStatus__OclType);
			Fragments._OrderStatus__OrderStatus.initOperations(_OrderStatus__OrderStatus);

			Fragments._Payment__OclAny.initOperations(_Payment__OclAny);
			Fragments._Payment__OclElement.initOperations(_Payment__OclElement);
			Fragments._Payment__Payment.initOperations(_Payment__Payment);

			Fragments._PaymentMethod__OclAny.initOperations(_PaymentMethod__OclAny);
			Fragments._PaymentMethod__OclElement.initOperations(_PaymentMethod__OclElement);
			Fragments._PaymentMethod__OclEnumeration.initOperations(_PaymentMethod__OclEnumeration);
			Fragments._PaymentMethod__OclType.initOperations(_PaymentMethod__OclType);
			Fragments._PaymentMethod__PaymentMethod.initOperations(_PaymentMethod__PaymentMethod);

			Fragments._PaymentStatus__OclAny.initOperations(_PaymentStatus__OclAny);
			Fragments._PaymentStatus__OclElement.initOperations(_PaymentStatus__OclElement);
			Fragments._PaymentStatus__OclEnumeration.initOperations(_PaymentStatus__OclEnumeration);
			Fragments._PaymentStatus__OclType.initOperations(_PaymentStatus__OclType);
			Fragments._PaymentStatus__PaymentStatus.initOperations(_PaymentStatus__PaymentStatus);

			Fragments._Product__NamedElement.initOperations(_Product__NamedElement);
			Fragments._Product__OclAny.initOperations(_Product__OclAny);
			Fragments._Product__OclElement.initOperations(_Product__OclElement);
			Fragments._Product__Product.initOperations(_Product__Product);

			Fragments._ProductCategory__NamedElement.initOperations(_ProductCategory__NamedElement);
			Fragments._ProductCategory__OclAny.initOperations(_ProductCategory__OclAny);
			Fragments._ProductCategory__OclElement.initOperations(_ProductCategory__OclElement);
			Fragments._ProductCategory__ProductCategory.initOperations(_ProductCategory__ProductCategory);

			Fragments._Promotion__NamedElement.initOperations(_Promotion__NamedElement);
			Fragments._Promotion__OclAny.initOperations(_Promotion__OclAny);
			Fragments._Promotion__OclElement.initOperations(_Promotion__OclElement);
			Fragments._Promotion__Promotion.initOperations(_Promotion__Promotion);

			Fragments._Review__OclAny.initOperations(_Review__OclAny);
			Fragments._Review__OclElement.initOperations(_Review__OclElement);
			Fragments._Review__Review.initOperations(_Review__Review);

			Fragments._Shipment__OclAny.initOperations(_Shipment__OclAny);
			Fragments._Shipment__OclElement.initOperations(_Shipment__OclElement);
			Fragments._Shipment__Shipment.initOperations(_Shipment__Shipment);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Cart = {
			EcommerceTables.Properties._Cart__cartContents,
			EcommerceTables.Properties._Cart__cartTotal,
			EcommerceTables.Properties._Cart__creationDate,
			EcommerceTables.Properties._Cart__id,
			EcommerceTables.Properties._Cart__lastUpdated,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CartContent = {
			EcommerceTables.Properties._CartContent__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._CartContent__price,
			EcommerceTables.Properties._CartContent__products,
			EcommerceTables.Properties._CartContent__quantity
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Customer = {
			EcommerceTables.Properties._Customer__cart,
			EcommerceTables.Properties._Customer__dateJoined,
			EcommerceTables.Properties._Customer__email,
			EcommerceTables.Properties._Customer__id,
			EcommerceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Customer__orders,
			EcommerceTables.Properties._Customer__reviews
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EcommercePlatform = {
			EcommerceTables.Properties._EcommercePlatform__customers,
			EcommerceTables.Properties._EcommercePlatform__description,
			EcommerceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._EcommercePlatform__orders,
			EcommerceTables.Properties._EcommercePlatform__productCategories,
			EcommerceTables.Properties._EcommercePlatform__products,
			EcommerceTables.Properties._EcommercePlatform__promotions,
			EcommerceTables.Properties._EcommercePlatform__url
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			EcommerceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Order = {
			EcommerceTables.Properties._Order__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Order__orderDate,
			EcommerceTables.Properties._Order__orderItems,
			EcommerceTables.Properties._Order__orderStatus,
			EcommerceTables.Properties._Order__paymentDetail,
			EcommerceTables.Properties._Order__shipmentDetail,
			EcommerceTables.Properties._Order__totalAmount
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrderLineItem = {
			EcommerceTables.Properties._OrderLineItem__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._OrderLineItem__price,
			EcommerceTables.Properties._OrderLineItem__product,
			EcommerceTables.Properties._OrderLineItem__quantity
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrderStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Payment = {
			EcommerceTables.Properties._Payment__amount,
			EcommerceTables.Properties._Payment__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Payment__paidUsing,
			EcommerceTables.Properties._Payment__paymentDate,
			EcommerceTables.Properties._Payment__paymentStatus
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentMethod = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PaymentStatus = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Product = {
			EcommerceTables.Properties._Product__appliedPromotions,
			EcommerceTables.Properties._Product__dateAdded,
			EcommerceTables.Properties._Product__description,
			EcommerceTables.Properties._Product__id,
			EcommerceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Product__price,
			EcommerceTables.Properties._Product__productCategory,
			EcommerceTables.Properties._Product__productReviews,
			EcommerceTables.Properties._Product__stockQuantity
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProductCategory = {
			EcommerceTables.Properties._ProductCategory__description,
			EcommerceTables.Properties._ProductCategory__id,
			EcommerceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._ProductCategory__products
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Promotion = {
			EcommerceTables.Properties._Promotion__description,
			EcommerceTables.Properties._Promotion__discountPercentage,
			EcommerceTables.Properties._Promotion__endDate,
			EcommerceTables.Properties._Promotion__id,
			EcommerceTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Promotion__startDate
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Review = {
			EcommerceTables.Properties._Review__comment,
			EcommerceTables.Properties._Review__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			EcommerceTables.Properties._Review__ratings,
			EcommerceTables.Properties._Review__reviewDate,
			EcommerceTables.Properties._Review__reviewedProduct
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Shipment = {
			EcommerceTables.Properties._Shipment__cost,
			EcommerceTables.Properties._Shipment__courierName,
			EcommerceTables.Properties._Shipment__estimatedDelivery,
			EcommerceTables.Properties._Shipment__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Cart__Cart.initProperties(_Cart);
			Fragments._CartContent__CartContent.initProperties(_CartContent);
			Fragments._Customer__Customer.initProperties(_Customer);
			Fragments._EcommercePlatform__EcommercePlatform.initProperties(_EcommercePlatform);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Order__Order.initProperties(_Order);
			Fragments._OrderLineItem__OrderLineItem.initProperties(_OrderLineItem);
			Fragments._OrderStatus__OrderStatus.initProperties(_OrderStatus);
			Fragments._Payment__Payment.initProperties(_Payment);
			Fragments._PaymentMethod__PaymentMethod.initProperties(_PaymentMethod);
			Fragments._PaymentStatus__PaymentStatus.initProperties(_PaymentStatus);
			Fragments._Product__Product.initProperties(_Product);
			Fragments._ProductCategory__ProductCategory.initProperties(_ProductCategory);
			Fragments._Promotion__Promotion.initProperties(_Promotion);
			Fragments._Review__Review.initProperties(_Review);
			Fragments._Shipment__Shipment.initProperties(_Shipment);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _OrderStatus__Pending = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.ORDER_STATUS.getEEnumLiteral("Pending"), Types._OrderStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _OrderStatus__Intransit = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.ORDER_STATUS.getEEnumLiteral("Intransit"), Types._OrderStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _OrderStatus__Delivered = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.ORDER_STATUS.getEEnumLiteral("Delivered"), Types._OrderStatus, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OrderStatus = {
			_OrderStatus__Pending,
			_OrderStatus__Intransit,
			_OrderStatus__Delivered
		};

		public static final EcoreExecutorEnumerationLiteral _PaymentMethod__CreaditCard = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_METHOD.getEEnumLiteral("CreaditCard"), Types._PaymentMethod, 0);
		public static final EcoreExecutorEnumerationLiteral _PaymentMethod__DebitCard = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_METHOD.getEEnumLiteral("DebitCard"), Types._PaymentMethod, 1);
		public static final EcoreExecutorEnumerationLiteral _PaymentMethod__BankTransaction = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_METHOD.getEEnumLiteral("BankTransaction"), Types._PaymentMethod, 2);
		public static final EcoreExecutorEnumerationLiteral _PaymentMethod__GooglePay = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_METHOD.getEEnumLiteral("GooglePay"), Types._PaymentMethod, 3);
		public static final EcoreExecutorEnumerationLiteral _PaymentMethod__ApplePay = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_METHOD.getEEnumLiteral("ApplePay"), Types._PaymentMethod, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PaymentMethod = {
			_PaymentMethod__CreaditCard,
			_PaymentMethod__DebitCard,
			_PaymentMethod__BankTransaction,
			_PaymentMethod__GooglePay,
			_PaymentMethod__ApplePay
		};

		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__Pending = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_STATUS.getEEnumLiteral("Pending"), Types._PaymentStatus, 0);
		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__Success = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_STATUS.getEEnumLiteral("Success"), Types._PaymentStatus, 1);
		public static final EcoreExecutorEnumerationLiteral _PaymentStatus__Failed = new EcoreExecutorEnumerationLiteral(EcommercePackage.Literals.PAYMENT_STATUS.getEEnumLiteral("Failed"), Types._PaymentStatus, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PaymentStatus = {
			_PaymentStatus__Pending,
			_PaymentStatus__Success,
			_PaymentStatus__Failed
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._OrderStatus.initLiterals(_OrderStatus);
			Types._PaymentMethod.initLiterals(_PaymentMethod);
			Types._PaymentStatus.initLiterals(_PaymentStatus);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EcommerceTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new EcommerceTables();
	}

	private EcommerceTables() {
		super(EcommercePackage.eNS_URI);
	}
}

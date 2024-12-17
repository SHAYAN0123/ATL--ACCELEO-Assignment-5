/**
 */
package Ecommerce.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Ecommerce</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcommerceTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new EcommerceTests("Ecommerce Tests");
		suite.addTestSuite(EcommercePlatformTest.class);
		suite.addTestSuite(CustomerTest.class);
		suite.addTestSuite(ProductTest.class);
		suite.addTestSuite(PromotionTest.class);
		suite.addTestSuite(OrderTest.class);
		suite.addTestSuite(CartTest.class);
		suite.addTestSuite(CartContentTest.class);
		suite.addTestSuite(ReviewTest.class);
		suite.addTestSuite(OrderLineItemTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcommerceTests(String name) {
		super(name);
	}

} //EcommerceTests

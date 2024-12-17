/**
 */
package Ecommerce.tests;

import Ecommerce.Customer;
import Ecommerce.EcommerceFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Ecommerce.Customer#getTotalOrders() <em>Get Total Orders</em>}</li>
 *   <li>{@link Ecommerce.Customer#validEmail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Email</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CustomerTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CustomerTest.class);
	}

	/**
	 * Constructs a new Customer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Customer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Customer getFixture() {
		return (Customer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcommerceFactory.eINSTANCE.createCustomer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link Ecommerce.Customer#getTotalOrders() <em>Get Total Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.Customer#getTotalOrders()
	 * @generated
	 */
	public void testGetTotalOrders() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Ecommerce.Customer#validEmail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.Customer#validEmail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidEmail__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //CustomerTest

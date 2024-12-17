/**
 */
package Ecommerce.tests;

import Ecommerce.EcommerceFactory;
import Ecommerce.Review;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Review</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Ecommerce.Review#validRatings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Ratings</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ReviewTest extends TestCase {

	/**
	 * The fixture for this Review test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Review fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReviewTest.class);
	}

	/**
	 * Constructs a new Review test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Review test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Review fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Review test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Review getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcommerceFactory.eINSTANCE.createReview());
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
	 * Tests the '{@link Ecommerce.Review#validRatings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Ratings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Ecommerce.Review#validRatings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidRatings__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ReviewTest

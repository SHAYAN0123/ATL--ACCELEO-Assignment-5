/**
 */
package Ecommerce;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Payment Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Ecommerce.EcommercePackage#getPaymentMethod()
 * @model
 * @generated
 */
public enum PaymentMethod implements Enumerator {
	/**
	 * The '<em><b>Creadit Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREADIT_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	CREADIT_CARD(1, "CreaditCard", "CreaditCard"),

	/**
	 * The '<em><b>Debit Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIT_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	DEBIT_CARD(2, "DebitCard", "DebitCard"),

	/**
	 * The '<em><b>Bank Transaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_TRANSACTION_VALUE
	 * @generated
	 * @ordered
	 */
	BANK_TRANSACTION(3, "BankTransaction", "BankTransaction"),

	/**
	 * The '<em><b>Google Pay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_PAY_VALUE
	 * @generated
	 * @ordered
	 */
	GOOGLE_PAY(4, "GooglePay", "GooglePay"),

	/**
	 * The '<em><b>Apple Pay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLE_PAY_VALUE
	 * @generated
	 * @ordered
	 */
	APPLE_PAY(5, "ApplePay", "ApplePay");

	/**
	 * The '<em><b>Creadit Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREADIT_CARD
	 * @model name="CreaditCard"
	 * @generated
	 * @ordered
	 */
	public static final int CREADIT_CARD_VALUE = 1;

	/**
	 * The '<em><b>Debit Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBIT_CARD
	 * @model name="DebitCard"
	 * @generated
	 * @ordered
	 */
	public static final int DEBIT_CARD_VALUE = 2;

	/**
	 * The '<em><b>Bank Transaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANK_TRANSACTION
	 * @model name="BankTransaction"
	 * @generated
	 * @ordered
	 */
	public static final int BANK_TRANSACTION_VALUE = 3;

	/**
	 * The '<em><b>Google Pay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOOGLE_PAY
	 * @model name="GooglePay"
	 * @generated
	 * @ordered
	 */
	public static final int GOOGLE_PAY_VALUE = 4;

	/**
	 * The '<em><b>Apple Pay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLE_PAY
	 * @model name="ApplePay"
	 * @generated
	 * @ordered
	 */
	public static final int APPLE_PAY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Payment Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PaymentMethod[] VALUES_ARRAY =
		new PaymentMethod[] {
			CREADIT_CARD,
			DEBIT_CARD,
			BANK_TRANSACTION,
			GOOGLE_PAY,
			APPLE_PAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Payment Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PaymentMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payment Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentMethod get(int value) {
		switch (value) {
			case CREADIT_CARD_VALUE: return CREADIT_CARD;
			case DEBIT_CARD_VALUE: return DEBIT_CARD;
			case BANK_TRANSACTION_VALUE: return BANK_TRANSACTION;
			case GOOGLE_PAY_VALUE: return GOOGLE_PAY;
			case APPLE_PAY_VALUE: return APPLE_PAY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PaymentMethod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PaymentMethod

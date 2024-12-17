/**
 */
package Ecommerce.impl;

import Ecommerce.Customer;
import Ecommerce.EcommercePackage;
import Ecommerce.EcommercePlatform;
import Ecommerce.EcommerceTables;
import Ecommerce.Order;
import Ecommerce.Product;
import Ecommerce.ProductCategory;
import Ecommerce.Promotion;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericDivideOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Ecommerce.impl.EcommercePlatformImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link Ecommerce.impl.EcommercePlatformImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link Ecommerce.impl.EcommercePlatformImpl#getProductCategories <em>Product Categories</em>}</li>
 *   <li>{@link Ecommerce.impl.EcommercePlatformImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link Ecommerce.impl.EcommercePlatformImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Ecommerce.impl.EcommercePlatformImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link Ecommerce.impl.EcommercePlatformImpl#getPromotions <em>Promotions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcommercePlatformImpl extends NamedElementImpl implements EcommercePlatform {
	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<Customer> customers;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * The cached value of the '{@link #getProductCategories() <em>Product Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductCategory> productCategories;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * The cached value of the '{@link #getPromotions() <em>Promotions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotions()
	 * @generated
	 * @ordered
	 */
	protected EList<Promotion> promotions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcommercePlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcommercePackage.Literals.ECOMMERCE_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Customer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<Customer>(Customer.class, this, EcommercePackage.ECOMMERCE_PLATFORM__CUSTOMERS);
		}
		return customers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<Product>(Product.class, this, EcommercePackage.ECOMMERCE_PLATFORM__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductCategory> getProductCategories() {
		if (productCategories == null) {
			productCategories = new EObjectContainmentEList<ProductCategory>(ProductCategory.class, this, EcommercePackage.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES);
		}
		return productCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ECOMMERCE_PLATFORM__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcommercePackage.ECOMMERCE_PLATFORM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<Order>(Order.class, this, EcommercePackage.ECOMMERCE_PLATFORM__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Promotion> getPromotions() {
		if (promotions == null) {
			promotions = new EObjectContainmentEList<Promotion>(Promotion.class, this, EcommercePackage.ECOMMERCE_PLATFORM__PROMOTIONS);
		}
		return promotions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAverageOrderValue() {
		/**
		 *
		 * if orders->notEmpty()
		 * then orders->collect(totalAmount)->sum() / orders->size()
		 * else 0.0
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Order> orders = this.getOrders();
		final /*@NonInvalid*/ OrderedSetValue BOXED_orders = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Order, orders);
		final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_orders).booleanValue();
		/*@Thrown*/ RealValue local_0;
		if (notEmpty) {
			/*@Thrown*/ Accumulator accumulator = ValueUtil.createSequenceAccumulatorValue(EcommerceTables.SEQ_DATAid_EFloat);
			Iterator<Object> ITERATOR__1 = BOXED_orders.iterator();
			/*@NonInvalid*/ SequenceValue collect;
			while (true) {
				if (!ITERATOR__1.hasNext()) {
					collect = accumulator;
					break;
				}
				/*@NonInvalid*/ Order _1 = (Order)ITERATOR__1.next();
				/**
				 * totalAmount
				 */
				final /*@NonInvalid*/ float totalAmount = _1.getTotalAmount();
				final /*@NonInvalid*/ RealValue BOXED_totalAmount = ValueUtil.realValueOf(totalAmount);
				//
				accumulator.add(BOXED_totalAmount);
			}
			final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, EcommerceTables.DATAid_EFloat, collect);
			final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_orders);
			final /*@Thrown*/ RealValue quot = NumericDivideOperation.INSTANCE.evaluate(sum, size);
			local_0 = quot;
		}
		else {
			local_0 = EcommerceTables.REA_0_0;
		}
		final /*@Thrown*/ float ECORE_local_0 = ValueUtil.floatValueOf(local_0);
		return ECORE_local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean uniqueCustomerEmails(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EcommercePlatform::uniqueCustomerEmails";
		try {
			/**
			 *
			 * inv uniqueCustomerEmails:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = customers->forAll(c1, c2 | c1 <> c2 implies c1.email <> c2.email)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EcommercePackage.Literals.ECOMMERCE_PLATFORM___UNIQUE_CUSTOMER_EMAILS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EcommerceTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Customer> customers = this.getCustomers();
					final /*@NonInvalid*/ OrderedSetValue BOXED_customers = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Customer, customers);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_customers);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * c1 <> c2 implies c1.email <> c2.email
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_customers = (OrderedSetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object c1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object c2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Customer local_0 = (Customer)c1;
								final /*@NonInvalid*/ Customer local_1 = (Customer)c2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Customer::email\'");
										}
										final /*@Thrown*/ String email = local_0.getEmail();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Customer::email\'");
										}
										final /*@Thrown*/ String email_0 = local_1.getEmail();
										final /*@Thrown*/ boolean ne_0 = !email.equals(email_0);
										CAUGHT_ne_0 = ne_0;
									}
									catch (Exception e) {
										CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_ne_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_ne_0;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							}
							catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, BOXED_customers, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, EcommerceTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
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
	public boolean uniqueIDs(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EcommercePlatform::uniqueIDs";
		try {
			/**
			 *
			 * inv uniqueIDs:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = customers->forAll(c1, c2 |
			 *           (c1 <> c2 implies c1.id <> c2.id
			 *           )) and
			 *         products->forAll(p1, p2 | (p1 <> p2 implies p1.id <> p2.id)) and
			 *         orders->forAll(o1, o2 | (o1 <> o2 implies o1.id <> o2.id)) and
			 *         promotions->forAll(pr1, pr2 |
			 *           (pr1 <> pr2 implies pr1.id <> pr2.id
			 *           ))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EcommercePackage.Literals.ECOMMERCE_PLATFORM___UNIQUE_IDS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EcommerceTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_16;
			if (le) {
				local_16 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						/*@Caught*/ Object CAUGHT_and;
						try {
							/*@Caught*/ Object CAUGHT_forAll;
							try {
								final /*@NonInvalid*/ List<Customer> customers = this.getCustomers();
								final /*@NonInvalid*/ OrderedSetValue BOXED_customers = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Customer, customers);
								final org.eclipse.ocl.pivot.Class TYPE_forAll_3 = executor.getStaticTypeOfValue(null, BOXED_customers);
								final LibraryIterationExtension IMPL_forAll_3 = (LibraryIterationExtension)TYPE_forAll_3.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
								final /*@NonNull*/ Object ACC_forAll_3 = IMPL_forAll_3.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
								/**
								 * Implementation of the iterator body.
								 */
								final AbstractSimpleOperation BODY_forAll_3 = new AbstractSimpleOperation() {
									/**
									 * c1 <> c2 implies c1.id <> c2.id
									 */
									@Override
									public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
										final /*@NonInvalid*/ OrderedSetValue BOXED_customers = (OrderedSetValue)sourceAndArgumentValues[0];
										final /*@NonInvalid*/ Object c1 = sourceAndArgumentValues[1];
										final /*@NonInvalid*/ Object c2 = sourceAndArgumentValues[2];
										/*@Caught*/ Object CAUGHT_implies;
										try {
											final /*@NonInvalid*/ Customer local_0 = (Customer)c1;
											final /*@NonInvalid*/ Customer local_1 = (Customer)c2;
											final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
											final /*@Thrown*/ Boolean implies;
											if (!ne) {
												implies = ValueUtil.TRUE_VALUE;
											}
											else {
												/*@Caught*/ Object CAUGHT_ne_0;
												try {
													if (local_0 == null) {
														throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Customer::id\'");
													}
													final /*@Thrown*/ int id = local_0.getId();
													if (local_1 == null) {
														throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Customer::id\'");
													}
													final /*@Thrown*/ int id_0 = local_1.getId();
													final /*@Thrown*/ boolean ne_0 = id != id_0;
													CAUGHT_ne_0 = ne_0;
												}
												catch (Exception e) {
													CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
													implies = ValueUtil.TRUE_VALUE;
												}
												else {
													if (CAUGHT_ne_0 instanceof InvalidValueException) {
														throw (InvalidValueException)CAUGHT_ne_0;
													}
													implies = ValueUtil.FALSE_VALUE;
												}
											}
											CAUGHT_implies = implies;
										}
										catch (Exception e) {
											CAUGHT_implies = ValueUtil.createInvalidValue(e);
										}
										return CAUGHT_implies;
									}
								};
								final ExecutorMultipleIterationManager MGR_forAll_3 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_forAll_3, BOXED_customers, ACC_forAll_3);
								final /*@Thrown*/ Boolean forAll = (Boolean)IMPL_forAll_3.evaluateIteration(MGR_forAll_3);
								CAUGHT_forAll = forAll;
							}
							catch (Exception e) {
								CAUGHT_forAll = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and;
							if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_forAll_0;
								try {
									final /*@NonInvalid*/ List<Product> products = this.getProducts();
									final /*@NonInvalid*/ OrderedSetValue BOXED_products = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Product, products);
									final org.eclipse.ocl.pivot.Class TYPE_forAll_0_0 = executor.getStaticTypeOfValue(null, BOXED_products);
									final LibraryIterationExtension IMPL_forAll_0_0 = (LibraryIterationExtension)TYPE_forAll_0_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
									final /*@NonNull*/ Object ACC_forAll_0_0 = IMPL_forAll_0_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
									/**
									 * Implementation of the iterator body.
									 */
									final AbstractSimpleOperation BODY_forAll_0_0 = new AbstractSimpleOperation() {
										/**
										 * p1 <> p2 implies p1.id <> p2.id
										 */
										@Override
										public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
											final /*@NonInvalid*/ OrderedSetValue BOXED_products = (OrderedSetValue)sourceAndArgumentValues[0];
											final /*@NonInvalid*/ Object p1 = sourceAndArgumentValues[1];
											final /*@NonInvalid*/ Object p2 = sourceAndArgumentValues[2];
											/*@Caught*/ Object CAUGHT_implies_0;
											try {
												final /*@NonInvalid*/ Product local_4 = (Product)p1;
												final /*@NonInvalid*/ Product local_5 = (Product)p2;
												final /*@NonInvalid*/ boolean ne_1 = (local_4 != null) ? !local_4.equals(local_5) : (local_5 != null);
												final /*@Thrown*/ Boolean implies_0;
												if (!ne_1) {
													implies_0 = ValueUtil.TRUE_VALUE;
												}
												else {
													/*@Caught*/ Object CAUGHT_ne_2;
													try {
														if (local_4 == null) {
															throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Product::id\'");
														}
														final /*@Thrown*/ int id_1 = local_4.getId();
														if (local_5 == null) {
															throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Product::id\'");
														}
														final /*@Thrown*/ int id_2 = local_5.getId();
														final /*@Thrown*/ boolean ne_2 = id_1 != id_2;
														CAUGHT_ne_2 = ne_2;
													}
													catch (Exception e) {
														CAUGHT_ne_2 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_ne_2 == ValueUtil.TRUE_VALUE) {
														implies_0 = ValueUtil.TRUE_VALUE;
													}
													else {
														if (CAUGHT_ne_2 instanceof InvalidValueException) {
															throw (InvalidValueException)CAUGHT_ne_2;
														}
														implies_0 = ValueUtil.FALSE_VALUE;
													}
												}
												CAUGHT_implies_0 = implies_0;
											}
											catch (Exception e) {
												CAUGHT_implies_0 = ValueUtil.createInvalidValue(e);
											}
											return CAUGHT_implies_0;
										}
									};
									final ExecutorMultipleIterationManager MGR_forAll_0_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_forAll_0_0, BOXED_products, ACC_forAll_0_0);
									final /*@Thrown*/ Boolean forAll_0 = (Boolean)IMPL_forAll_0_0.evaluateIteration(MGR_forAll_0_0);
									CAUGHT_forAll_0 = forAll_0;
								}
								catch (Exception e) {
									CAUGHT_forAll_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_forAll_0 == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_forAll instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_forAll;
									}
									if (CAUGHT_forAll_0 instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_forAll_0;
									}
									if ((CAUGHT_forAll == null) || (CAUGHT_forAll_0 == null)) {
										and = null;
									}
									else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						}
						catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_0;
						if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						}
						else {
							/*@Caught*/ Object CAUGHT_forAll_1;
							try {
								final /*@NonInvalid*/ List<Order> orders = this.getOrders();
								final /*@NonInvalid*/ OrderedSetValue BOXED_orders = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Order, orders);
								final org.eclipse.ocl.pivot.Class TYPE_forAll_1_0 = executor.getStaticTypeOfValue(null, BOXED_orders);
								final LibraryIterationExtension IMPL_forAll_1_0 = (LibraryIterationExtension)TYPE_forAll_1_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
								final /*@NonNull*/ Object ACC_forAll_1_0 = IMPL_forAll_1_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
								/**
								 * Implementation of the iterator body.
								 */
								final AbstractSimpleOperation BODY_forAll_1_0 = new AbstractSimpleOperation() {
									/**
									 * o1 <> o2 implies o1.id <> o2.id
									 */
									@Override
									public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
										final /*@NonInvalid*/ OrderedSetValue BOXED_orders = (OrderedSetValue)sourceAndArgumentValues[0];
										final /*@NonInvalid*/ Object o1 = sourceAndArgumentValues[1];
										final /*@NonInvalid*/ Object o2 = sourceAndArgumentValues[2];
										/*@Caught*/ Object CAUGHT_implies_1;
										try {
											final /*@NonInvalid*/ Order local_8 = (Order)o1;
											final /*@NonInvalid*/ Order local_9 = (Order)o2;
											final /*@NonInvalid*/ boolean ne_3 = (local_8 != null) ? !local_8.equals(local_9) : (local_9 != null);
											final /*@Thrown*/ Boolean implies_1;
											if (!ne_3) {
												implies_1 = ValueUtil.TRUE_VALUE;
											}
											else {
												/*@Caught*/ Object CAUGHT_ne_4;
												try {
													if (local_8 == null) {
														throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Order::id\'");
													}
													final /*@Thrown*/ int id_3 = local_8.getId();
													if (local_9 == null) {
														throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Order::id\'");
													}
													final /*@Thrown*/ int id_4 = local_9.getId();
													final /*@Thrown*/ boolean ne_4 = id_3 != id_4;
													CAUGHT_ne_4 = ne_4;
												}
												catch (Exception e) {
													CAUGHT_ne_4 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_ne_4 == ValueUtil.TRUE_VALUE) {
													implies_1 = ValueUtil.TRUE_VALUE;
												}
												else {
													if (CAUGHT_ne_4 instanceof InvalidValueException) {
														throw (InvalidValueException)CAUGHT_ne_4;
													}
													implies_1 = ValueUtil.FALSE_VALUE;
												}
											}
											CAUGHT_implies_1 = implies_1;
										}
										catch (Exception e) {
											CAUGHT_implies_1 = ValueUtil.createInvalidValue(e);
										}
										return CAUGHT_implies_1;
									}
								};
								final ExecutorMultipleIterationManager MGR_forAll_1_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_forAll_1_0, BOXED_orders, ACC_forAll_1_0);
								final /*@Thrown*/ Boolean forAll_1 = (Boolean)IMPL_forAll_1_0.evaluateIteration(MGR_forAll_1_0);
								CAUGHT_forAll_1 = forAll_1;
							}
							catch (Exception e) {
								CAUGHT_forAll_1 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_forAll_1 == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_and instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_and;
								}
								if (CAUGHT_forAll_1 instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_forAll_1;
								}
								if ((CAUGHT_and == null) || (CAUGHT_forAll_1 == null)) {
									and_0 = null;
								}
								else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_0 = and_0;
					}
					catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_forAll_2;
						try {
							final /*@NonInvalid*/ List<Promotion> promotions = this.getPromotions();
							final /*@NonInvalid*/ OrderedSetValue BOXED_promotions = idResolver.createOrderedSetOfAll(EcommerceTables.ORD_CLSSid_Promotion, promotions);
							final org.eclipse.ocl.pivot.Class TYPE_forAll_2_0 = executor.getStaticTypeOfValue(null, BOXED_promotions);
							final LibraryIterationExtension IMPL_forAll_2_0 = (LibraryIterationExtension)TYPE_forAll_2_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
							final /*@NonNull*/ Object ACC_forAll_2_0 = IMPL_forAll_2_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
							/**
							 * Implementation of the iterator body.
							 */
							final AbstractSimpleOperation BODY_forAll_2_0 = new AbstractSimpleOperation() {
								/**
								 * pr1 <> pr2 implies pr1.id <> pr2.id
								 */
								@Override
								public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
									final /*@NonInvalid*/ OrderedSetValue BOXED_promotions = (OrderedSetValue)sourceAndArgumentValues[0];
									final /*@NonInvalid*/ Object pr1 = sourceAndArgumentValues[1];
									final /*@NonInvalid*/ Object pr2 = sourceAndArgumentValues[2];
									/*@Caught*/ Object CAUGHT_implies_2;
									try {
										final /*@NonInvalid*/ Promotion local_12 = (Promotion)pr1;
										final /*@NonInvalid*/ Promotion local_13 = (Promotion)pr2;
										final /*@NonInvalid*/ boolean ne_5 = (local_12 != null) ? !local_12.equals(local_13) : (local_13 != null);
										final /*@Thrown*/ Boolean implies_2;
										if (!ne_5) {
											implies_2 = ValueUtil.TRUE_VALUE;
										}
										else {
											/*@Caught*/ Object CAUGHT_ne_6;
											try {
												if (local_12 == null) {
													throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Promotion::id\'");
												}
												final /*@Thrown*/ int id_5 = local_12.getId();
												if (local_13 == null) {
													throw new InvalidValueException("Null source for \'\'https://it.univaq.disim.mde.course.assignment.four/Ecommerce\'::Promotion::id\'");
												}
												final /*@Thrown*/ int id_6 = local_13.getId();
												final /*@Thrown*/ boolean ne_6 = id_5 != id_6;
												CAUGHT_ne_6 = ne_6;
											}
											catch (Exception e) {
												CAUGHT_ne_6 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_ne_6 == ValueUtil.TRUE_VALUE) {
												implies_2 = ValueUtil.TRUE_VALUE;
											}
											else {
												if (CAUGHT_ne_6 instanceof InvalidValueException) {
													throw (InvalidValueException)CAUGHT_ne_6;
												}
												implies_2 = ValueUtil.FALSE_VALUE;
											}
										}
										CAUGHT_implies_2 = implies_2;
									}
									catch (Exception e) {
										CAUGHT_implies_2 = ValueUtil.createInvalidValue(e);
									}
									return CAUGHT_implies_2;
								}
							};
							final ExecutorMultipleIterationManager MGR_forAll_2_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_forAll_2_0, BOXED_promotions, ACC_forAll_2_0);
							final /*@Thrown*/ Boolean forAll_2 = (Boolean)IMPL_forAll_2_0.evaluateIteration(MGR_forAll_2_0);
							CAUGHT_forAll_2 = forAll_2;
						}
						catch (Exception e) {
							CAUGHT_forAll_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll_2 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if (CAUGHT_forAll_2 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_forAll_2;
							}
							if ((CAUGHT_and_0 == null) || (CAUGHT_forAll_2 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, EcommerceTables.INT_0).booleanValue();
				local_16 = logDiagnostic;
			}
			return local_16;
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
			case EcommercePackage.ECOMMERCE_PLATFORM__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES:
				return ((InternalEList<?>)getProductCategories()).basicRemove(otherEnd, msgs);
			case EcommercePackage.ECOMMERCE_PLATFORM__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
			case EcommercePackage.ECOMMERCE_PLATFORM__PROMOTIONS:
				return ((InternalEList<?>)getPromotions()).basicRemove(otherEnd, msgs);
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
			case EcommercePackage.ECOMMERCE_PLATFORM__CUSTOMERS:
				return getCustomers();
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCTS:
				return getProducts();
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES:
				return getProductCategories();
			case EcommercePackage.ECOMMERCE_PLATFORM__URL:
				return getUrl();
			case EcommercePackage.ECOMMERCE_PLATFORM__DESCRIPTION:
				return getDescription();
			case EcommercePackage.ECOMMERCE_PLATFORM__ORDERS:
				return getOrders();
			case EcommercePackage.ECOMMERCE_PLATFORM__PROMOTIONS:
				return getPromotions();
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
			case EcommercePackage.ECOMMERCE_PLATFORM__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES:
				getProductCategories().clear();
				getProductCategories().addAll((Collection<? extends ProductCategory>)newValue);
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__URL:
				setUrl((String)newValue);
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__PROMOTIONS:
				getPromotions().clear();
				getPromotions().addAll((Collection<? extends Promotion>)newValue);
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
			case EcommercePackage.ECOMMERCE_PLATFORM__CUSTOMERS:
				getCustomers().clear();
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCTS:
				getProducts().clear();
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES:
				getProductCategories().clear();
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__URL:
				setUrl(URL_EDEFAULT);
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__ORDERS:
				getOrders().clear();
				return;
			case EcommercePackage.ECOMMERCE_PLATFORM__PROMOTIONS:
				getPromotions().clear();
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
			case EcommercePackage.ECOMMERCE_PLATFORM__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCTS:
				return products != null && !products.isEmpty();
			case EcommercePackage.ECOMMERCE_PLATFORM__PRODUCT_CATEGORIES:
				return productCategories != null && !productCategories.isEmpty();
			case EcommercePackage.ECOMMERCE_PLATFORM__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case EcommercePackage.ECOMMERCE_PLATFORM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EcommercePackage.ECOMMERCE_PLATFORM__ORDERS:
				return orders != null && !orders.isEmpty();
			case EcommercePackage.ECOMMERCE_PLATFORM__PROMOTIONS:
				return promotions != null && !promotions.isEmpty();
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
			case EcommercePackage.ECOMMERCE_PLATFORM___GET_AVERAGE_ORDER_VALUE:
				return getAverageOrderValue();
			case EcommercePackage.ECOMMERCE_PLATFORM___UNIQUE_CUSTOMER_EMAILS__DIAGNOSTICCHAIN_MAP:
				return uniqueCustomerEmails((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case EcommercePackage.ECOMMERCE_PLATFORM___UNIQUE_IDS__DIAGNOSTICCHAIN_MAP:
				return uniqueIDs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (url: ");
		result.append(url);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EcommercePlatformImpl

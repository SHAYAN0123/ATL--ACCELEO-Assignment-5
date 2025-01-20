import java.util.Date;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.*;

import Ecommerce.Cart;
import Ecommerce.CartContent;
import Ecommerce.Customer;
import Ecommerce.EcommerceFactory;
import Ecommerce.EcommercePlatform;
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

public class ModelManager {
    private static final String MODEL_URI = "ecommerce_Amazon.xmi";

   
 // Method to create the ECommercePlatform model
    public static EcommercePlatform createEcommercePlatform() {
        EcommerceFactory factory = EcommerceFactory.eINSTANCE;

        // Create the EcommercePlatform
        EcommercePlatform platform = factory.createEcommercePlatform();
        platform.setName("Amazon E-Commerce Platform");
        platform.setUrl("amazon.com");
        platform.setDescription("The biggest E-Commerce platform on earth");

        // Create Customers
        Customer customer1 = factory.createCustomer();
        customer1.setName("Minase Mengistu");
        customer1.setEmail("minase@email.com");
        customer1.setId(1);

        Customer customer2 = factory.createCustomer();
        customer2.setName("Vinay Sanga");
        customer2.setEmail("vinay@email.com");
        customer2.setId(2);
        
        Customer customer3 = factory.createCustomer();
        customer3.setName("Muhammad Shayan");
        customer3.setEmail("shayan@email.com");
        customer3.setId(3);

        platform.getCustomers().add(customer1);
        platform.getCustomers().add(customer2);
        platform.getCustomers().add(customer3);

        // Create ProductCategory and Products
        ProductCategory electronics = factory.createProductCategory();
        electronics.setId(1);
        electronics.setName("Electronics");
        platform.getProductCategories().add(electronics);

        Product laptop = factory.createProduct();
        laptop.setId(1);
        laptop.setName("Laptop");
        laptop.setPrice(1000.0f);
        laptop.setStockQuantity(50);
        laptop.setProductCategory(electronics);
        laptop.setDateAdded(new Date());

        Product smartphone = factory.createProduct();
        smartphone.setId(2);
        smartphone.setName("Smartphone");
        smartphone.setPrice(700.0f);
        smartphone.setStockQuantity(100);
        smartphone.setProductCategory(electronics);
        smartphone.setDateAdded(new Date());

        platform.getProducts().add(laptop);
        platform.getProducts().add(smartphone);

        // Create Promotion
        Promotion summerSale = factory.createPromotion();
        summerSale.setId(1);
        summerSale.setName("Summer Sale");
        summerSale.setDiscountPercentage(20);
        summerSale.setStartDate(new Date());
        summerSale.setEndDate(new Date(System.currentTimeMillis() + (7L * 24 * 60 * 60 * 1000))); // 7 days later

        laptop.getAppliedPromotions().add(summerSale);
        platform.getPromotions().add(summerSale);

        // Create Cart and CartContent for Customer1
        Cart cart1 = factory.createCart();
        cart1.setId(1);
        cart1.setCreationDate(new Date());
        cart1.setLastUpdated(new Date());

        CartContent cartItem1 = factory.createCartContent();
        cartItem1.setId(1);
        cartItem1.setQuantity(2);
        cartItem1.setProducts(laptop);

        cart1.getCartContents().add(cartItem1);
        customer1.setCart(cart1);

        // Create Order for Customer1
        Order order1 = factory.createOrder();
        order1.setId(1);
        order1.setOrderDate(new Date());
        order1.setOrderStatus(OrderStatus.PENDING);

        OrderLineItem lineItem1 = factory.createOrderLineItem();
        lineItem1.setId(1);
        lineItem1.setQuantity(1);
        lineItem1.setProduct(laptop);

        order1.getOrderItems().add(lineItem1);
        customer1.getOrders().add(order1);
        platform.getOrders().add(order1);

        // Add Payment and Shipment Details
        Payment payment = factory.createPayment();
        payment.setId(1);
        payment.setAmount(1000.0f);
        payment.setPaymentDate(new Date());
        payment.setPaidUsing(PaymentMethod.CREADIT_CARD);
        payment.setPaymentStatus(PaymentStatus.SUCCESS);

        Shipment shipment = factory.createShipment();
        shipment.setId(1);
        shipment.setCourierName("FedEx");
        shipment.setCost(20.0f);
        shipment.setEstimatedDelivery(new Date(System.currentTimeMillis() + (5L * 24 * 60 * 60 * 1000))); // 5 days later

        order1.setPaymentDetail(payment);
        order1.setShipmentDetail(shipment);

      
        // Add Multiple Reviews for laptop
        Review laptopReview1 = factory.createReview();
        laptopReview1.setId(1);
        laptopReview1.setRatings(4);
        laptopReview1.setComment("Excellent laptop, great value for the price!");
        laptopReview1.setReviewDate(new Date());
        laptopReview1.setReviewedProduct(laptop);
        customer1.getReviews().add(laptopReview1);
        laptop.getProductReviews().add(laptopReview1);

        Review laptopReview2 = factory.createReview();
        laptopReview2.setId(2);
        laptopReview2.setRatings(4);
        laptopReview2.setComment("Good performance, but could improve battery life.");
        laptopReview2.setReviewDate(new Date());
        laptopReview2.setReviewedProduct(laptop);
        customer2.getReviews().add(laptopReview2);
        laptop.getProductReviews().add(laptopReview2);

        Review laptopReview3 = factory.createReview();
        laptopReview3.setId(3);
        laptopReview3.setRatings(3);
        laptopReview3.setComment("Decent product, but overpriced.");
        laptopReview3.setReviewDate(new Date());
        laptopReview3.setReviewedProduct(laptop);
        customer3.getReviews().add(laptopReview3);
        laptop.getProductReviews().add(laptopReview3);
        
        //// Add a review for smartphone
        Review smartphoneReview1 = factory.createReview();
        smartphoneReview1.setId(2);
        smartphoneReview1.setRatings(2);
        smartphoneReview1.setComment("Good smartphone, but battery life could be better.");
        smartphoneReview1.setReviewDate(new Date());
        smartphoneReview1.setReviewedProduct(smartphone);
        customer2.getReviews().add(smartphoneReview1);
        smartphone.getProductReviews().add(smartphoneReview1);

        return platform;
    }


    // Method to save the model to XMI
    public static void saveModel(ResourceSet resourceSet, EcommercePlatform platform) {
        try {
            // Register the XMI resource factory
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

            // Create a resource
            Resource resource = resourceSet.createResource(URI.createFileURI(MODEL_URI));
            resource.getContents().add(platform);

            // Save the resource
            resource.save(null);
            System.out.println("Model saved to " + MODEL_URI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to load the model from XMI
    public static EcommercePlatform loadModel(ResourceSet resourceSet) {
        try {
            // Register the XMI resource factory
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

            // Load the resource
            Resource resource = resourceSet.getResource(URI.createFileURI(MODEL_URI), true);
            return (EcommercePlatform) resource.getContents().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to validate the model
    public static void validateModel(EcommercePlatform platform) {
        Diagnostician diagnostician = Diagnostician.INSTANCE;
        Diagnostic validationResult = diagnostician.validate(platform);

        if (validationResult.getSeverity() == Diagnostic.OK) {
            System.out.println("The model is valid.");
        } else {
            System.out.println("The model is invalid. Validation messages:");
            for (org.eclipse.emf.common.util.Diagnostic diagnostic : validationResult.getChildren()) {
                System.out.println(" - " + diagnostic.getMessage());
            }
        }
    }
    // Method to check if the model is valid
    public static boolean isValidModel(EcommercePlatform platform) {
        Diagnostician diagnostician = Diagnostician.INSTANCE;
        Diagnostic validationResult = diagnostician.validate(platform);

        if (validationResult.getSeverity() == Diagnostic.OK) {
            return true; // Model is valid
        }

        // Print validation errors
        System.out.println("The model is invalid. Validation messages:");
        for (org.eclipse.emf.common.util.Diagnostic diagnostic : validationResult.getChildren()) {
            System.out.println(" - " + diagnostic.getMessage());
        }
        return false; // Model is invalid
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        ResourceSet resourceSet = new ResourceSetImpl();

        // Step 1: Create the model
        System.out.println("\nCreating the model...");
        EcommercePlatform platform = createEcommercePlatform();
        
     	// Step 2: Validate the created model
        System.out.println("\nValidating the created model...");
        if (!isValidModel(platform)) {
            System.out.println("Model creation failed validation. The model will not be saved.");
            return; // Exit the program if the model is invalid
        }

        // Step 3: Save the model
        saveModel(resourceSet, platform);

        // Step 4: Load the model
        EcommercePlatform loadedPlatform = loadModel(resourceSet);
        System.out.println("Loaded Platform: " + loadedPlatform.getName());

        // Step 5: Display the model contents
        System.out.println("Displaying loaded platform details:");
        System.out.println("Platform URL: " + loadedPlatform.getUrl());
        System.out.println("Platform Description: " + loadedPlatform.getDescription());

        System.out.println("\nCustomers:");
        for (Customer customer : loadedPlatform.getCustomers()) {
            System.out.println(" - ID: " + customer.getId() + ", Name: " + customer.getName() + ", Email: " + customer.getEmail());
        }

        System.out.println("\nProducts:");
        for (Product product : loadedPlatform.getProducts()) {
            System.out.println(" - ID: " + product.getId() + ", Name: " + product.getName() + ", Price: $" + product.getPrice() +
                    ", Stock: " + product.getStockQuantity() + ", Date Added: " + product.getDateAdded() + ", Avarage Rstings: " + product.getAverageRatings());
        }

        System.out.println("\nOrders:");
        for (Order order : loadedPlatform.getOrders()) {
            System.out.println(" - ID: " + order.getId() + ", Date: " + order.getOrderDate() + ", Status: " + order.getOrderStatus());
            System.out.println("   Order Items:");
            for (OrderLineItem item : order.getOrderItems()) {
                System.out.println("     - Product: " + item.getProduct().getName() + ", Quantity: " + item.getQuantity());
            }
        }

        System.out.println("\nPromotions:");
        for (Promotion promotion : loadedPlatform.getPromotions()) {
            System.out.println(" - ID: " + promotion.getId() + ", Name: " + promotion.getName() + ", Discount: " +
                    promotion.getDiscountPercentage() + "%, Start Date: " + promotion.getStartDate() + ", End Date: " + promotion.getEndDate());
        }
        
        //Step 6: Validate the model
        System.out.println("\nValidating the model...");
        validateModel(loadedPlatform);
    }

}

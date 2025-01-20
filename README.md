# E-Commerce Platform Transformations - Assignment 5

This repository demonstrates the application of **Model-Driven Engineering (MDE)** principles through **Model-to-Model (M2M)** and **Model-to-Text (M2T)** transformations. The tasks are implemented using **ATL** and **Acceleo** frameworks and extend the `Ecommerce` metamodel developed in Assignment 4.

---

## 1. Objectives

This project focuses on three key tasks:

1. **Task 1: Refactoring the Metamodel**
   - Apply structural refinements and conceptual updates to the `Ecommerce` metamodel.
2. **Task 2: Model-to-Model Transformation**
   - Migrate models from the initial metamodel to the refined version using **ATL**.
3. **Task 3: Model-to-Text Transformation**
   - Generate informative HTML pages summarizing and detailing the model elements using **Acceleo**.

---

## 2. Task 1: Refactoring the Metamodel

### **Changes Applied**
1. **Conceptual Updates**
   - Added a `DiscountedOrder` subclass to represent high-value orders eligible for discounts.
   - Introduced specific subclasses for `ProductItem`:
     - **Electronics**: Includes a `warrantyPeriod` attribute.
     - **Clothing**: Includes `size` and `material` attributes.

2. **Renaming**
   - Renamed `Product` to `ProductItem`.

3. **Structural Refinements**
   - Updated relationships between entities:
     - `ProductItem` is now an abstract class with concrete subclasses (`Electronics`, `Clothing`).
   - Refined attributes and operations:
     - `Order` dynamically computes `totalAmount` from `OrderLineItems`.
     - `Promotion` tracks associated orders.

4. **Enhancements**
   - Added `loyaltyPoints` to `Customer`.
   - Simplified redundant attributes and enforced stricter constraints.

The refined metamodel is stored in `Modified_Ecommerce.ecore`.

---

## 3. Task 2: Model-to-Model Transformation (M2M)

### **Objective**
Migrate models conforming to the initial `Ecommerce` metamodel to the refined version developed in Task 1.

### **Approach**
The transformation is implemented in **ATL**, following these key steps:
1. **Mapping Core Concepts**
   - Transforms `EcommercePlatform`, `Customer`, `Cart`, `Promotion`, and `Review` to their updated structures.
2. **Handling Orders**
   - Maps general orders to `Order` or `DiscountedOrder` based on `totalAmount`:
     - Non-discounted orders remain in `Order`.
     - Discounted orders are mapped to `DiscountedOrder` with a calculated `discountAmount`.
3. **Mapping Products**
   - Differentiates between `Electronics` and `Clothing` based on product attributes.

## Task 3: Model-to-Text Transformation (M2T) - HTML Generation

### Objective
The goal of Task 3 is to generate **informative HTML pages** that summarize the elements of the `Ecommerce` platform and provide detailed views for individual entities such as customers, products, product categories, orders, and promotions. This transformation was implemented using **Acceleo**.

### Overview
The transformation generates:
1. **Index Page**: 
   - Summarizes all entities in the platform.
   - Provides links to detail pages for each modeled concept.
2. **Detail Pages**:
   - Generated for specific entities such as products, customers, and orders.
   - Displays attributes, relationships, and other relevant details.

---

### Implementation

The Acceleo template, `generate.mtl`, dynamically generates HTML files for each entity in the model. Below are the key components of the implementation:

#### **Index Page**
The index page (`index.html`) serves as the main entry point to explore the ecommerce model. It contains:
- Links to customer pages.
- Links to product and product category pages.
- Links to order and promotion details.

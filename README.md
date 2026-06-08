# OOP-Online-Shopping-CartSystem
An encapsulation exercise for oop practice

Overview

Build a simple online shopping cart system.

The system consists of:

Product
ShoppingCart
OrderStatus (enum)
Product

Represents a product available for purchase.

Fields
Field	Type
productId	String
name	String
price	double

Constructor
Product(String productId, String name, double price)


Rules
productId cannot be null or blank

name cannot be null or blank

price must be greater than 0

If any validation fails:
throw new IllegalArgumentException

Methods

Getters

String productId()

String name()

double price()

definePrice

void definePrice(double price)

Rules:

price must be greater than 0

toString

Must include:

productId,
name,
price,

OrderStatus

Create an enum:
PENDING
PAID
SHIPPED
CANCELLED

ShoppingCart

Represents a customer's cart.

Fields
Field	Type
customerName	String
products	List<Product>
status	OrderStatus

Constructor
ShoppingCart(String customerName)

Rules
customerName cannot be null or blank

status defaults to:

OrderStatus.PENDING

Methods


customerName

String customerName()

status

OrderStatus status()

addProduct

void addProduct(Product product)

Rules:

product cannot be null

totalCost

double totalCost()

Returns the sum of all product prices.

totalItems

int totalItems()

totalItems

int totalItems()

Returns the number of products in the cart.


markPaid

void markPaid()

Sets status to:

OrderStatus.PAID



markShipped

void markShipped()

Sets status to:

OrderStatus.SHIPPED


cancel

void cancel()

Sets status to:

OrderStatus.CANCELLED


toString

Must contain:

customer name,
status,
total items.




Project Structure
shopping-cart-assessment/
│
├── pom.xml
│
└── src
    │
    ├── main
    │   └── java
    │       └── com
    │           └── shop
    │
    │               ├── Product.java
    │               ├── ShoppingCart.java
    │               └── OrderStatus.java
    │
    └── test
        └── java
            └── com
                └── shop
                    │
                    ├── ProductTest.java
                    └── ShoppingCartTest.java








Product
-------
Fields:
- productId
- name
- price

Methods:
- constructor
- productId()
- name()
- price()
- definePrice()
- toString()

ShoppingCart
------------
Fields:
- customerName
- List<Product>
- OrderStatus

Methods:
- constructor
- customerName()
- status()
- addProduct()
- removeProduct()
- totalCost()
- totalItems()
- markPaid()
- markShipped()
- cancel()
- toString()                    

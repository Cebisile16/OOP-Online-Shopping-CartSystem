//package com.shop;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ShoppingCartTest {
//
//    private ShoppingCart cart;
//    private Product laptop;
//    private Product mouse;
//
//    @BeforeEach
//    void setUp() {
//
//        cart = new ShoppingCart("Alice");
//
//        laptop =
//                new Product(
//                        "P100",
//                        "Laptop",
//                        15000);
//
//        mouse =
//                new Product(
//                        "P200",
//                        "Mouse",
//                        500);
//    }
//
//    @Test
//    void constructorDefaultsStatusToPending() {
//
//        assertEquals(
//                OrderStatus.PENDING,
//                cart.status()
//        );
//    }
//
//    @Test
//    void addProductIncreasesItemCount() {
//
//        cart.addProduct(laptop);
//
//        assertEquals(
//                1,
//                cart.totalItems()
//        );
//    }
//
//    @Test
//    void addMultipleProducts() {
//
//        cart.addProduct(laptop);
//        cart.addProduct(mouse);
//
//        assertEquals(
//                2,
//                cart.totalItems()
//        );
//    }
//
//    @Test
//    void addProductThrowsForNull() {
//
//        assertThrows(
//                IllegalArgumentException.class,
//                () -> cart.addProduct(null)
//        );
//    }
//
//    @Test
//    void removeProductReducesItemCount() {
//
//        cart.addProduct(laptop);
//        cart.addProduct(mouse);
//
//        cart.removeProduct(mouse);
//
//        assertEquals(
//                1,
//                cart.totalItems()
//        );
//    }
//
//    @Test
//    void removeProductThrowsForNull() {
//
//        assertThrows(
//                IllegalArgumentException.class,
//                () -> cart.removeProduct(null)
//        );
//    }
//
//    @Test
//    void totalCostReturnsCorrectAmount() {
//
//        cart.addProduct(laptop);
//        cart.addProduct(mouse);
//
//        assertEquals(
//                15500,
//                cart.totalCost(),
//                0.001
//        );
//    }
//
//    @Test
//    void statusUpdatesToPaid() {
//
//        cart.markPaid();
//
//        assertEquals(
//                OrderStatus.PAID,
//                cart.status()
//        );
//    }
//
//    @Test
//    void statusUpdatesToShipped() {
//
//        cart.markShipped();
//
//        assertEquals(
//                OrderStatus.SHIPPED,
//                cart.status()
//        );
//    }
//
//    @Test
//    void statusUpdatesToCancelled() {
//
//        cart.cancel();
//
//        assertEquals(
//                OrderStatus.CANCELLED,
//                cart.status()
//        );
//    }
//
//    @Test
//    void toStringContainsCustomerName() {
//
//        String result = cart.toString();
//
//        assertTrue(
//                result.contains("Alice")
//        );
//    }
//
//    @Test
//    void toStringContainsStatus() {
//
//        String result = cart.toString();
//
//        assertTrue(
//                result.contains("PENDING")
//        );
//    }
//}
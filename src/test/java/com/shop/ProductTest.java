package com.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    void constructorSetsFields() {
        Product product =
                new Product("P100", "Laptop", 15000.00);

        assertEquals("P100", product.productId());
        assertEquals("Laptop", product.name());
        assertEquals(15000.00, product.price(), 0.001);
    }

    @Test
    void constructorThrowsForZeroPrice() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Product("P100", "Laptop", 0)
        );
    }

    @Test
    void constructorThrowsForNegativePrice() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Product("P100", "Laptop", -10)
        );
    }

    @Test
    void definePriceUpdatesPrice() {
        Product product =
                new Product("P100", "Laptop", 15000);

        product.definePrice(18000);

        assertEquals(
                18000,
                product.price(),
                0.001
        );
    }

    @Test
    void definePriceThrowsForZero() {
        Product product =
                new Product("P100", "Laptop", 15000);

        assertThrows(
                IllegalArgumentException.class,
                () -> product.definePrice(0)
        );
    }

    @Test
    void toStringContainsProductDetails() {
        Product product =
                new Product("P100", "Laptop", 15000);

        String result = product.toString();

        assertTrue(result.contains("P100"));
        assertTrue(result.contains("Laptop"));
    }
}
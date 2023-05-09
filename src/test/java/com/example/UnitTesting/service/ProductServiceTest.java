package com.example.UnitTesting.service;

import com.example.UnitTesting.exception.NotFoundExeption;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductServiceTest {
    private ProductService productService;

    @BeforeEach
    public void init() {
        productService = new ProductService();
    }

    @Test
    public void testCalculateTotalCost() {
        String basket = "ABCDABA";
        double cost = productService.calculateTotalCost(basket);
        Assertions.assertEquals(13.25, cost);
    }

    @Test
    public void testCalculateTotalCostWithIncorrectCode() {
        String basket = "ASRT";
        Assertions.assertThrows(NotFoundExeption.class, () -> {
            productService.calculateTotalCost(basket);
        });
    }
}

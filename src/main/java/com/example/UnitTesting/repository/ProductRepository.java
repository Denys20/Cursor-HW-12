package com.example.UnitTesting.repository;

import com.example.UnitTesting.entity.Product;

import java.util.HashMap;

public class ProductRepository {
    private HashMap<Character, Product> products;

    public ProductRepository() {
        products = new HashMap<>();

        products.put('A', new Product('A', 1.25d, 3, 3.00d));
        products.put('B', new Product('B', 4.25d, 0, 0d));
        products.put('C', new Product('C', 1.00d, 3, 5.00d));
        products.put('D', new Product('D', 0.75d, 0, 0d));
    }

    public Product getProduct(char code) {
        return products.get(code);
    }
}

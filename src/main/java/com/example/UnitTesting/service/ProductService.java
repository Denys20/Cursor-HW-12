package com.example.UnitTesting.service;

import com.example.UnitTesting.entity.Product;
import com.example.UnitTesting.exception.NotFoundExeption;
import com.example.UnitTesting.repository.ProductRepository;

import java.util.HashMap;

public class ProductService {
    private ProductRepository productRepository;

    private Product product;

    public ProductService() {
        productRepository = new ProductRepository();
    }

    public double calculateTotalCost(String basket) {
        HashMap<Character, Integer> products = new HashMap<>();
        double totalCost = 0.0;

        for (int i = 0; i < basket.length(); i++) {
            char productCode = basket.charAt(i);
            product = productRepository.getProduct(productCode);
            if (product == null) {
                throw new NotFoundExeption("Такого коду як " + productCode + " не існує, потрібно ввести щось із (ABCD) у верхньому регістрі!");
            }
            if (!products.containsKey(productCode)) {
                products.put(productCode, 1);
            } else {
                products.put(productCode, products.getOrDefault(productCode, 0) + 1);
            }
        }

        for (char code : products.keySet()) {
            int count = products.get(code);
            product = productRepository.getProduct(code);

            if (product.getPromotionalQuantity() > 0) {
                int discountedQuantity = count / product.getPromotionalQuantity();
                int regularQuantity = count % product.getPromotionalQuantity();
                totalCost += discountedQuantity * product.getPromotionalQuantity() + regularQuantity * product.getPrice();
            } else {
                totalCost += count * product.getPrice();
            }
        }
        return totalCost;
    }
}

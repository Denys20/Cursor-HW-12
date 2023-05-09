package com.example.UnitTesting.entity;

public class Product {
    private char code;
    private double price;
    private int promotionalQuantity;
    private double promotionalPrice;

    public Product() {
    }

    public Product(char code, double price, int promotionalQuantity, double promotionalPrice) {
        this.code = code;
        this.price = price;
        this.promotionalQuantity = promotionalQuantity;
        this.promotionalPrice = promotionalPrice;
    }

    public char getCode() {
        return code;
    }

    public void setCode(char code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPromotionalQuantity() {
        return promotionalQuantity;
    }

    public void setPromotionalQuantity(int promotionalQuantity) {
        this.promotionalQuantity = promotionalQuantity;
    }

    public double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }
}

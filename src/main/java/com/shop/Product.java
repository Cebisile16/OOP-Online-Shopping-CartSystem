package com.shop;

public class Product {

    // TODO
    private String productId;
    private String name;
    private double price;

    public Product(String productId,String name,double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;

        if (productId.equals(null) || productId.isEmpty()) {
            throw new IllegalArgumentException(" ");
        }
        if (name.equals(null) || name.isEmpty()) {
            throw new IllegalArgumentException("");
        }
        if (price <=0) {
            throw new IllegalArgumentException(" ");
        }
    }

    public String productId() {
        return productId;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }

    public void definePrice(double price){
        if (price <=0) {
            throw new IllegalArgumentException(" ");
        }
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
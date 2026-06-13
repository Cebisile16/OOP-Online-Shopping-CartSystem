package com.shop;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.sum;




public class ShoppingCart {

    // TODO
    private String customerName;
    private List<Product> products;
    private OrderStatus status;


    public ShoppingCart(String  customerName){
        this.customerName= customerName;
        if (customerName.equals(null) || customerName.isEmpty()){
            throw new IllegalArgumentException(" name cannot be blank");
        }
        this.status= OrderStatus.PENDING;
        this. products= new ArrayList<>();

    }

    public String name() {
        return customerName;
    }

    public OrderStatus status() {
        return status;
    }

    public void addProduct(Product product){
        if(product == null){
            throw new IllegalArgumentException("Please provide product name");
        }
        products.add(product);

    }
    public double totalCost(){
        double total= 0.0;
        for ( Product product : products){
            total =total + product.price();
        }
        return total;
    }

    public int totalItems(){
        return products.size();

    }

    public void markPaid(){
        status = OrderStatus.PAID;

    }
    public void markShipped(){
        status = OrderStatus.SHIPPED;
    }
    public void cancel(){
        status = OrderStatus.CANCELLED;
    }



    @Override
    public String toString() {
        return "ShoppingCart{" +
                "customerName='" + customerName + '\'' +
                ", products=" + products +
                ", status=" + status +
                '}';
    }


    public void removeProduct(Product product) {
        int remaining= products.size();


            if (!products.contains(product)){
                throw new IllegalArgumentException(" ");
            }
            products.remove(product);
            remaining-= 1;




    }

}







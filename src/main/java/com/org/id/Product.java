package com.org.id;


public class Product {

    private  String name;
    private Double price;

    public Product(String name, Double price, Double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getQuantity() {
        return quantity;
    }

    private Double  quantity ;
}

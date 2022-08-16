package com.ultralesson.objectorientation;

public class Product {
    private String name;
    private String brand;
    private int quantity;

    // Default Constructor
    public Product() {
        this("Airpods", "Apple", 1);
    }

    public Product(String name, int quantity) {
        this(name, "Airpods", quantity);
    }

    public Product(String name, String brand, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.brand = brand;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public static void main(String[] args) {
        //
        Product product = new Product(); // Initialization using default constructor
        System.out.println(product);

        Product product1 = new Product("iPad", 2); // Initialization using parameterized constructor
        System.out.println(product1);

        Product product2 = new Product("iPhone12", "Apple", 1); // Initialization using parameterized constructor
        System.out.println(product2);
    }
    @Override
    public String toString() {
        return "{"
                + "\"name\":\""
                + name
                + "\""
                + ", \"brand\":\""
                + brand
                + "\""
                + ", \"quantity\":\""
                + quantity
                + "\""
                + "}";
    }
}
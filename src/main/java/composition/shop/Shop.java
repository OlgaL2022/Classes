package main.java.composition.shop;

import javax.swing.*;
import java.util.ArrayList;


public class Shop {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public String addProduct() {  // not void to return value, need to put what returning like String
        String name = JOptionPane.showInputDialog("Enter name of product");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price of product"));
        double quantity = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity of product"));


        String [] availableMeasurements = {"KG","Item","MB", "Liters" };

        String measurement = (String) JOptionPane.showInputDialog(
                null,
                "Select product measurement",
                "Product Measurement",
                JOptionPane.QUESTION_MESSAGE,
                null,
                availableMeasurements,
                availableMeasurements[0]  // default selection - KG
        );

        Product product = new Product(name, price, quantity, measurement);

        this.products.add(product);

        return name + " added successfully";
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String sellProduct() {

        Product productToSell = (Product)JOptionPane.showInputDialog(
                null,
                "Select product to buy",
                "Buy Product",
                JOptionPane.QUESTION_MESSAGE,
                null,
                this.products.toArray(),
                this.products.toArray()[0]
        );

        // do some more stuff with it, e.g reduce quantity
        return "You successfully purchased product " + productToSell;
    }

}

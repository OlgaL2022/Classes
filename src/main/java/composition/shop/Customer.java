package main.java.composition.shop;

public class Customer {

    private final String name;
    private Double balance;  // Double is a class type double

    public Customer(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}

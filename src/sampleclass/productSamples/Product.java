package sampleclass.productSamples;

public class Product {

    public String name;
    public Integer price;
    public int quantity;
    private double discount;  // private - available through this class
    protected float weight;
    //protected  // access modifiers; visible within package
    //static  // accessible from anywhere
    //final  // can't change value

    // constructor overloading
    public Product() {
        System.out.println(" Product created without values");
    }

    public Product(String name) {
        this.name = name;
        System.out.println(" Product created with name");

    }

    public Product(String name, Integer price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println(" Product created with 3 values");

    }

    public Product(String name, Integer price, int quantity, double discount, float weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.weight = weight;
        System.out.println(" Product created wit all values");

    }

    public String getDiscount() {
        return "discount for product will be " + discount;
    }


    public float getWeight () {
        return weight;
    }

    @Override
    public String toString() {   // annotation
        return
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", weight=" + weight;
    }

}

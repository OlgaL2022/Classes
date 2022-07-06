package sampleclass;

import sampleclass.productSamples.Electronic;
import sampleclass.productSamples.Food;
import sampleclass.productSamples.Product;

import java.util.Date;

//OBJECT ORIENTED PROGRAMMING

public class Main {
    public static void main(String[] args) {
        Product rice = new Product();
        Product bread = new Product("Sweet Bread");
        Product chocolate = new Product("Rimi Choco", 30,5);
        Product phone = new Product("Samsung latest", 1399, 12, 10.50d, 2.5f);

        System.out.println(rice.name);
        System.out.println(bread.name);
        System.out.println(chocolate.name + chocolate.price + chocolate.quantity);
        System.out.println(phone);

        Product television = new Electronic("Samsung TV", 3404, 34, 2.6, "24 inches");
        Electronic laptop = new Electronic("HP Latest", 3234, 5, 4.5, "12 inches");
        // casting
        //Electronic sample = (Electronic) new Product("HP Latest", 3234, 5, 20.3, 45);

        System.out.println(television);
        System.out.println(laptop);
        //System.out.println(sample);

        Food food = new Food("Chocolate", 23, 45, 10d, 2f, new Date());

        System.out.println(food.getDiscount());
        System.out.println(television.getDiscount());
        System.out.println(laptop.getDiscount());
        System.out.println(rice.getDiscount());
        System.out.println(bread.getDiscount());

        // Some valid ways to write numbers
        /*Integer value1 = 1293948;
        Integer value2 = 129 + 39 + 48;
        Integer value3 = 129_39_48;
        float value4 = 129_39_48f;
        long value5 = 129L +39_48L;*/

    }
}

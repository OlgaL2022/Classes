package main.java.composition;

import main.java.composition.petExample.Owner;
import main.java.composition.petExample.Pet;
import main.java.composition.shop.Product;
import main.java.composition.shop.Shop;

import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        Shop miniMart = new Shop();

        String result = miniMart.addProduct();

        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, miniMart.addProduct());


        //System.out.println(result);
        //System.out.println(miniMart.addProduct());

        result = miniMart.sellProduct();
        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, miniMart.addProduct());


        //System.out.println(result);
        //System.out.println(miniMart.sellProduct());



        /*Pet pet = new Pet("Tom", 3);
        Owner owner = new Owner("Olga", "Riga", pet);

        System.out.println(owner.sayHello());
        System.out.println(owner.walkPet());
        System.out.println(owner.walkPet());
        System.out.println(owner.walkPet());
        System.out.println(owner.walkPet());
        System.out.println(owner.feedPet());
        System.out.println(owner.feedPet());
        System.out.println(owner.feedPet());
        System.out.println(owner.walkPet());
        System.out.println(owner.walkPet());*/


    }
}

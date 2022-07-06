package main.abstractClassExample;

import main.abstractClassExample.humans.*;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Baby baby = new Baby("John", 1);
        System.out.println(baby.move());
        System.out.println(baby.goTo("Market"));
        System.out.println(baby.goTo("sleep"));
        System.out.println(baby.getName());
        //System.out.println(baby.getAge());

        try {
            baby.grow(2, 4);
        } catch (Exception e) {
            System.out.println(e);
        }
        // baby.grow(2,4);
        System.out.println(baby.getAge());

        Teen teen = new Teen("Jack", 15,"Rock");

        try {
            System.out.println(teen.move());
            teen.grow(5, 6);
            System.out.println(teen.move());
            teen.grow(5, 6);
            System.out.println(teen.move());
            teen.grow(5, 6);
            System.out.println(teen.move());

            teen.grow(2, 2);  // Throws Exception
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println((teen.getAge()));

        System.out.println(teen.goTo("kitchen"));
        System.out.println(teen.goTo("school"));
        System.out.println(teen.goTo("party"));

        System.out.println();

        Adult adult = new Adult("Thomas", 68);

        System.out.println(adult.move());

        try{
            adult.grow(6,6);
            adult.grow(6,6);
            adult.grow(6,4);
            adult.grow(6,4);
            adult.grow(6,4);
            adult.grow(6,4);
            adult.grow(6,4);
            adult.grow(6,4);
            adult.grow(6,4);
        }catch(Exception ex) {
            System.out.println((ex.getMessage()));
        }

        System.out.println(adult.move());

        System.out.println();

        ArrayList<Human> humans = new ArrayList<>();
        humans.add(adult);
        humans.add(teen);
        humans.add(baby);

        System.out.println("Calling same method for different implementation");
        humans.forEach(human -> System.out.println(human.move()));


        System.out.println();
        Kid kid = new Kid("Jason", 10, "happy");
        System.out.println(kid.move());
        System.out.println(kid.goTo("movies"));
        
        try{
        kid.grow(1, 1);
    } catch (Exception e) {
            System.out.println((e.getMessage()));
        }
    
    }

}

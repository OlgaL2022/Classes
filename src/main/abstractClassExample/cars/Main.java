package main.abstractClassExample.cars;

public class Main {

    public static void main(String[] args)  {


        Brand brand = new Brand("BMW", 2000, 99, 2022);

        System.out.println(brand.goTo("ride"));
        System.out.println(brand.repair());
        System.out.println(brand.repair());
        System.out.println(brand.move());
        System.out.println(brand.goTo("shop"));

        try{
            brand.tuned(300);
        }catch(Exception ex) {
            System.out.println((ex.getMessage()));
        }




        }
    }




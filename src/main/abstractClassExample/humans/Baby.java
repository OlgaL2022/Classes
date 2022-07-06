package main.abstractClassExample.humans;

public class Baby extends Human{

    public Baby(String name, int age) {
        super(name, age);
    }

    @Override    // abstract method
    public String move() {
        return "Crawling away!!!";
    }

    @Override   // abstract method
    public String goTo(String location) {
        if(!location.equals( "sleep")) return "Baby don't do " +location;

        return "Baby going to " + location;
    }
}

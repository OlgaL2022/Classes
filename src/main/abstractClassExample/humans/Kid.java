package main.abstractClassExample.humans;

public class Kid extends Human{

    public String emotion;

    public Kid(String name, int age, String emotion) {
        super(name, age);
        this.emotion = emotion;
    }

    @Override public String move() {
        if (age < 7)
            return "I'm a small kid";
        if (age >= 7)
            return "I'm growing fast";
        return "all good";
    }

    @Override public String goTo(String location) {
        if (!location.equals("movies"))
        return "I'm happy to go there";
        return "going to the " +location +" and I'm " + emotion;
    }


    @Override
    public void grow(int food, int water) throws Exception {
        if (food < 2 || water < 2) {
            throw new Exception("I want more to eat!");
        }

    }

}

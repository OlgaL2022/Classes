package main.abstractClassExample.cars;

public class Brand extends Car {

    public Brand(String name, double engineCapacity, int maxSpeed, int manufactureYear) {
        super(name, engineCapacity, maxSpeed, manufactureYear);
    }

    public String repair() {
        if (manufactureYear < 2010)
            return "I'm too old";
        if (manufactureYear > 2020)
            return "I'm super new!";

        return "What year am I?";
    }

    @Override
    public String move() {
        if (maxSpeed < 100) {
            return "I'm driving slow";
        } else
            return "I am fast!";

    }

    @Override
    public String goTo(String location) {
        if (!location.equals("ride"))
            return "Car doesn't belong to " + location;

        return "Car going to " + location;
    }

    @Override
    public void tuned(double speed) throws Exception {
        if (speed > 200) {
            throw new Exception("I'm a racing car now");
        }
        super.tuned(speed);
    }
}



package main.abstractClassExample.cars;

/*Cars > Abstract
        Brands > Extends abstract*/

public abstract class Car {

    private final String name;
    private double engineCapacity;
    public int maxSpeed;
    protected int manufactureYear;

    public Car(String name, double engineCapacity, int maxSpeed, int manufactureYear) {
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.maxSpeed = maxSpeed;
        this.manufactureYear = manufactureYear;
    }

    public String getName() {
        return name;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }


    public abstract String move();


    public String repair() {
        return "going to shop";
    }

    public void tuned(double speed) throws Exception {
        maxSpeed++;
    }

    public String fuelConsumption() {
        return "I require fuel";
    }

    public abstract String goTo(String location);

    public void openWindowDoors() {
        System.out.println(" Window doors opened!");
    }
}

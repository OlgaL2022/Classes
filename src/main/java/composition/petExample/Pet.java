package main.java.composition.petExample;

public class Pet {

    public String name;
    private int hungerLever;

    public Pet(String name, int hungerLever) {
        this.name = name;
        this.hungerLever = hungerLever;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHungerLever() {
        return hungerLever;
    }

    public void setHungerLever(int hungerLever) {
        this.hungerLever = hungerLever;
    }


}

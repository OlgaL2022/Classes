package main.java.composition.petExample;

public class Owner {

    public String name;
    private String location;
    private Pet pet;

    public Owner(String name, String location, Pet pet) {
        this.name = name;
        this.location = location;
        this.pet = pet;
    }

        public String feedPet() {
            this.pet.setHungerLever(pet.getHungerLever() -1);
            return this.pet.getName() + "'s Hunger level reduced" +
                    " New level: " +
                    this.pet.getHungerLever();
        }

        public String walkPet() {
        this.pet.setHungerLever(pet.getHungerLever() +1);
        return this.pet.getName()+
                " Walked 50 meters, hunger level: " +
                this.pet.getHungerLever();
        }

        public String sayHello() {
        return "Hello, my name is " + this.name + " and my pet name is " +
                this.pet.getName();

        }
    }




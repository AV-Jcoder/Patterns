package Creational.Factory.Example_3;

public abstract class Car {
    private int maxSpeed;
    private String colour;
    private String model;

    Car(int maxSpeed, String colour, String model){
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Model:" + this.model + "\nColour:" + this.colour + "\nMaxSpeed:" + this.maxSpeed + "\n";
    }
}

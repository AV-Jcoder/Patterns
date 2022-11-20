package Creational.Factory.Example_4;

public abstract class Delivery {
    private String title;

    Delivery(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

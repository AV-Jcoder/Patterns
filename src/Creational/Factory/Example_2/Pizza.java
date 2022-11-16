package Creational.Factory.Example_2;

public abstract class Pizza {
    private String title;
    Pizza(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Your order : " + title;
    }
}

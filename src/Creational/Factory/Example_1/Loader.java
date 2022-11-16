package Creational.Factory.Example_1;

public class Loader {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza1 = factory.createPizza("NewYorkPizza");
        System.out.println(pizza1.title);
        Pizza pizza2 = factory.createPizza("GreekPizza");
        System.out.println(pizza2.title);
        Pizza pizza3 = factory.createPizza("CheesePizza");
        System.out.println(pizza3.title);
    }
}

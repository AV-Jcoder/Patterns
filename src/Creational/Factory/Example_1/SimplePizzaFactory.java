package Creational.Factory.Example_1;

public class SimplePizzaFactory {
    public Pizza createPizza(String pizzaName){
        Pizza pizza = null;
        if (pizzaName.equals("CheesePizza")) {
            pizza = new CheesePizza();
        } else if (pizzaName.equals("NewYorkPizza")) {
            pizza = new NewYorkPizza();
        } else if (pizzaName.equals("GreekPizza")) {
            pizza = new GreekPizza();
        } else throw new RuntimeException("There aren`t type of pizza");
        return pizza;
    }
}

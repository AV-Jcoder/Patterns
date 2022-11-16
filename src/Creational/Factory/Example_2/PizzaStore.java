package Creational.Factory.Example_2;

abstract class PizzaStore {

    public Pizza orderPizza(PizzaName pizzaName) {
        Pizza pizza =  createPizza(pizzaName);
        return pizza;
    }

    abstract Pizza createPizza(PizzaName pizzaName);
}

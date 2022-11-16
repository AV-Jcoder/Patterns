package Creational.Factory.Example_2;

public class PizzaStoreNewYorkCity extends PizzaStore{
    @Override
    Pizza createPizza(PizzaName pizzaName) {
        Pizza pizza;
        switch (pizzaName) {
            case CHEESE:
                pizza = new CheesePizzaNYStyle();
                break;
            case GREEK:
                pizza = new GreekPizzaNYStyle();
                break;
            case VEGAN:
                pizza = new VeganPizzaNYStyle();
                break;
            default:
                throw new RuntimeException("Enum is missing");
        }
        return pizza;
    }
}

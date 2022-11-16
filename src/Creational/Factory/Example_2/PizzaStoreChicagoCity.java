package Creational.Factory.Example_2;

public class PizzaStoreChicagoCity extends PizzaStore{
    @Override
    Pizza createPizza(PizzaName pizzaName) {
        Pizza pizza;
        switch (pizzaName) {
            case CHEESE:
                pizza = new CheesePizzaCHStyle();
                break;
            case GREEK:
                pizza = new GreekPizzaCHStyle();
                break;
            case VEGAN:
                pizza = new VeganPizzaCHStyle();
                break;
            default:
                throw new RuntimeException("Enum is missing");
        }
        return pizza;
    }
}

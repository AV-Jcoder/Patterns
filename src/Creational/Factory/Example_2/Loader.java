package Creational.Factory.Example_2;

public class Loader {
    public static void main(String[] args) {

        PizzaStore newYorkPizzaStore = new PizzaStoreNewYorkCity();
        Pizza order1 = newYorkPizzaStore.orderPizza(PizzaName.GREEK);
        System.out.println(order1.toString());

        PizzaStore chicagoPizzaStore = new PizzaStoreChicagoCity();
        Pizza order2 = chicagoPizzaStore.orderPizza(PizzaName.GREEK);
        System.out.println(order2);
    }
}

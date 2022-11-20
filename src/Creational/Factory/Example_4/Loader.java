package Creational.Factory.Example_4;

public class Loader {
    public static void main(String[] args) {

        DeliveryFactory factory = new ConcreteDelivFactory();

        Delivery delivery = factory.getDelivery("Fast");
        System.out.println(delivery);

        delivery = factory.getDelivery("Quality");
        System.out.println(delivery);

        delivery = factory.getDelivery("Cost");
        System.out.println(delivery);
    }
}

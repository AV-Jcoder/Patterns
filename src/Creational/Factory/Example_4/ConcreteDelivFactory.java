package Creational.Factory.Example_4;

public class ConcreteDelivFactory extends DeliveryFactory {
    @Override
    Delivery createDelivery(String delivParams) {
        Delivery delivery;
        if (delivParams.equals("Fast")) {
            delivery = new AirshipDelivery();
        } else if (delivParams.equals("Quality")) {
            delivery = new RailwayDelivery();
        } else if (delivParams.equals("Cost")) {
            delivery = new TruckDelivery();
        } else throw new IllegalArgumentException();
        return delivery;
    }
}

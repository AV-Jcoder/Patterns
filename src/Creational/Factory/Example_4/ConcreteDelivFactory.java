package Creational.Factory.Example_4;

public class ConcreteDelivFactory extends DeliveryFactory {
    @Override
    Delivery createDelivery(String delivParams) {
        Delivery delivery;
        if (delivParams.equals("Fast")) {
            delivery = new AirshipDelivery("Airship delivery is very fast!");
        } else if (delivParams.equals("Quality")) {
            delivery = new RailwayDelivery("Railway delivery is quality and very safety");
        } else if (delivParams.equals("Cheap")) {
            delivery = new TruckDelivery("Truck delivery is optimal solution");
        } else throw new IllegalArgumentException();
        return delivery;
    }
}

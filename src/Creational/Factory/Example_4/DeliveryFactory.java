package Creational.Factory.Example_4;

public abstract class DeliveryFactory {

    abstract Delivery createDelivery(String  delivParams);

    public Delivery getDelivery(String delivParams) {
        Delivery delivery = createDelivery(delivParams);
        return delivery;
    }
}

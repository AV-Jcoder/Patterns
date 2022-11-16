package Creational.Factory.Example_3;

public class Loader {
    public static void main(String[] args) {

        Factory factory = new AudiFactory();
        Car car = factory.getCar("Sport");
        System.out.println(car);

        Factory factory1 = new ToyotaFactory();
        Car car1 = factory1.getCar("OffRoad");
        System.out.println(car1);
    }
}

package Creational.Factory.Example_3;

public class AudiFactory extends Factory{
    @Override
    Car createCar(String carType) {
        Car car;
        if (carType.equals("Sport")) {
            car = new SportCar(343, "Blue", "R7");
        } else if (carType.equals("City")) {
            car = new CityCar(220, "Black", "A6");
        } else if (carType.equals("OffRoad")) {
            car = new OffRoadCar(180, "Green", "Q7");
        } else throw new RuntimeException("Missing car type.");
        return car;
    }
}

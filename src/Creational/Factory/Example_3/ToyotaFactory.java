package Creational.Factory.Example_3;

public class ToyotaFactory extends Factory {
    @Override
    Car createCar(String carType) {
        Car car;
        if (carType.equals("Sport")) {
            car = new SportCar(323, "Red", "Lexus LFA");
        } else if (carType.equals("City")) {
            car = new CityCar(220, "Grey", "Corolla");
        } else if (carType.equals("OffRoad")) {
            car = new OffRoadCar(180, "Green", "Land Cruiser");
        } else throw new RuntimeException("Missing car type.");
        return car;
    }
}

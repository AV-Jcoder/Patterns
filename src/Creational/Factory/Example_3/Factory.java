package Creational.Factory.Example_3;

public abstract class Factory {
    abstract Car createCar(String carType);

    public Car getCar(String carType){
        Car car = createCar(carType);
        return car;
    }
}

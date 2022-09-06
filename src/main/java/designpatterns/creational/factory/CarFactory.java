package designpatterns.creational.factory;

public class CarFactory {

    public Car createCar(CarMark carMark) {
        Car car;

        switch (carMark) {
            case BMW -> car = new Bmw();
            case AUDI -> car = new Audi();
            case TOYOTA -> car = new Toyota();
            default -> car = new Car();
        }

        return car;
    }
}

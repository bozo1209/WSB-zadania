package zjazd1.wyk1.zad8;

public class Main {
    public static void main(String[] args) {

        Car[] cars = {
                Car.CarFactory.createCar("bmw"),
                Car.CarFactory.createCar("bmw"),
                Car.CarFactory.createCar("audi"),
                Car.CarFactory.createCar("audi"),
                Car.CarFactory.createCar("bmw"),
                Car.CarFactory.createCar("audi"),
                Car.CarFactory.createCar("audi"),
                Car.CarFactory.createCar("bmw"),
                Car.CarFactory.createCar("audi")
        };

        System.out.println("bmw " + CarCalculator.countBrand("bmw", cars));
        System.out.println("audi " + CarCalculator.countBrand("audi", cars));
    }
}

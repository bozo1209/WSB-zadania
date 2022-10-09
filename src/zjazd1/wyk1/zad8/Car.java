package zjazd1.wyk1.zad8;

public class Car {
    private String brand;

    private Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    static class CarFactory{
        public static Car createCar(String brand){
            return new Car(brand);
        }
    }
}

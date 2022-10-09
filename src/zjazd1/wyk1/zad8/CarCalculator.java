package zjazd1.wyk1.zad8;

import java.util.Arrays;

public class CarCalculator {

    public static long countBrand(String brand, Car[] cars){
        return Arrays.stream(cars).filter(car -> car.getBrand().equalsIgnoreCase(brand)).count();
    }
}

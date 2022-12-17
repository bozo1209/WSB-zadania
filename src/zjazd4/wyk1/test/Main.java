package zjazd4.wyk1.test;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("audi", "red");

        Function<String, String> fun = color -> car.changeColor(color);
        Function<String, String> fun2 = car::changeColor;

        System.out.println(fun.apply("blue"));
        System.out.println("new color1 " + car.color);
        System.out.println(fun2.apply("green"));

        System.out.println("new color2 " + car.color);

    }

}

class Car{
    public String name;
    public String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String changeColor(String newColor){
        color = newColor;
        return color;
    }


}

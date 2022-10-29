package zjazd2.wyk1.zad13;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("stefan");
        Animal cat = new Cat("miecio");
        Dog dog2 = new Dog("ste");

        System.out.println(dog.getName());
        System.out.println(dog2.getName());
        System.out.println(cat.getName());
        dog.eat();
        dog.voice();
        dog2.voice();
        dog2.eat();
    }
}

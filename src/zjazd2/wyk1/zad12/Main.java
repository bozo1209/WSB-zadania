package zjazd2.wyk1.zad12;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("joe", "doe", LocalDate.of(2000, 12,15));
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
    }
}

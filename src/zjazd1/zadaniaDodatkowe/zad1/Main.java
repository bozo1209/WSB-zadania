package zjazd1.zadaniaDodatkowe.zad1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                Person.constructPerson("jan", "nowak"),
                Person.constructPerson("alicja", "nowak"),
                Person.constructPerson("jan", "kowalski"),
                Person.constructPerson("jan", "nowak"),
                Person.constructPerson("marek", "nowak"),
                Person.constructPerson(null, "nowak"),
                Person.constructPerson("zenon", "kowal"),
                Person.constructPerson("jan", "nowak"),
                Person.constructPerson("jan", null)
        };

        familyMembers("nowak", persons);
    }

    public static void familyMembers(String lastName, Person[] persons){
        List<String> familyList = Arrays.stream(persons)
                .filter(person -> person.getLastName().equals(lastName))
                .map(Person::getFullName).toList();
        String family = String.join(", ", familyList);
        System.out.println(family);
    }
}

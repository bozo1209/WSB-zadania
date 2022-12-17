package zjazd4.examples;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

public class Complex {

    public static void main(String[] args) {

        //Validation if object contains profession address / true/false condition
        Person someAdult = new Person("Anna", "Justyna", "X", 29,
                new Profession("nurse", "HOSPITAL",
                        new Address("Street1", "13", "London")));
        Person someKid = new Person("Jan", "Junior", "X", 3,
                null);

        // don't do this
        //boolean hasAddress =  Optional.ofNullable(someKid.getProfession().getCompanyAddress()).isPresent();
        // don't do this
        //if (someKid.getProfession().getCompanyAddress()!=null){}
        //do this
        if (someKid != null
                && someKid.getProfession() != null
                && someKid.getProfession().getCompanyAddress() != null) {
        }
        //or even better do this
        boolean hasAddress = Optional.ofNullable(someKid)
                .map(Person::getProfession)
                .map(Profession::getCompanyAddress)
                .isPresent();

        System.out.println(hasAddress);


        //TODO refactor above code so that it was null-safe
        //Optional i nested objects
        List<Person> family = List.of(
                new Person("Anna", "Justyna", "X", 29,
                        new Profession("nurse", "HOSPITAL",
                                new Address("Street1", "13", "London"))),
                new Person("Marek", null, "X", 39,
                        new Profession("doctor", "HOSPITAL",
                                new Address("Street1", "13", "London"))),
                new Person("Jan", "Junior", "X", 3,
                        null));
        //Map: key - firstName-surName in upperCase, value - employment address


//        Map<String, String> addressByPerson = family.stream()
//                .collect((Collectors.toMap(
//                        p -> p.getFirstName().toUpperCase()
//                                + "-" + p.getSurName().toUpperCase(),
//                        p -> p.getProfession().getCompanyAddress().getStreet().toUpperCase()
//                                + " " + p.getProfession().getCompanyAddress().getNumber().toUpperCase())));

        /*Solution
        */
        Map<String, String> addressByPerson1 = family.stream()
                .collect((Collectors.toMap(
                        p -> p.getFirstName().toUpperCase()
                                + "-" + p.getSurName().toUpperCase(),
                        p -> ofNullable(p)
                                .map(Person::getProfession)
                                .map(Profession::getCompanyAddress)
                                .map(address -> address.getStreet()+"-"+ address.getNumber())
                                .map(String::toUpperCase)
                                .orElse(""))));


        addressByPerson1.forEach((k,v) -> System.out.println("name: " + k + " | address " + v));

    }

}

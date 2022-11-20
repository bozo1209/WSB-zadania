package zjazd3.zadaniaDodatkowe.zad14;

@FieldEquals(firstField = "s+", secondField = "s+")
public class Person {
    private final String firstName;
    private final String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
}

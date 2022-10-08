package zjazd1.zadaniaDodatkowe.zad1;

public class Person {
    private final String firstName;
    private final String lastName;

    private Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Person constructPerson(String firstName, String lastName){
        return new Person(nameIfExist(firstName), nameIfExist(lastName));
    }

    public String getFullName(){
        String fullName = firstName + " " + lastName;
        return fullName.trim();
    }

    private static String nameIfExist(String name){
        return name != null ? name : "";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}

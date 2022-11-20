package zjazd3.zadaniaDodatkowe.zad14;

public class Zad14 {

    public static void main(String[] args) throws Exception {
        Person person1 = new Person("stefan", "stefanowski");
        Person person2 = new Person("sss", "sss");

        System.out.println(FieldEqualsValidator.validate(person1));
        System.out.println(FieldEqualsValidator.validate(person2));
    }
}

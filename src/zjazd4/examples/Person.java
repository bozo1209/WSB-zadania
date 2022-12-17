package zjazd4.examples;

public class Person {

    private String firstName;
    private String middleName;
    private String surName;
    private int age;
    private Profession profession;

    public Person(String firstName, String middleName, String surName, int age, Profession profession) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surName = surName;
        this.age = age;
        this.profession = profession;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Profession getProfession() {
        return profession;
    }
}

class Profession {

    private String name;
    private String companyName;
    private Address companyAddress;

    public Profession(String name, String companyName, Address companyAddress) {
        this.name = name;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }
}

class Address {

    private String street;
    private String number;
    private String city;

    public Address(String street, String number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

}

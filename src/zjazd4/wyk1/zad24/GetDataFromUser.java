package zjazd4.wyk1.zad24;

import zjazd4.wyk1.zad24.exceptions.ValidationException;
import zjazd4.wyk1.zad24.validation.Validator;

import java.util.Map;
import java.util.Scanner;

public class GetDataFromUser {

    private final static Scanner scanner = new Scanner(System.in);

    public static Map<String, String> getPathAndCity(){
        return Map.of("path", getPath(), "city", getCity());
    }

    private static String getPath(){
        System.out.println("enter the path");
        String path = scanner.nextLine();
        try {
            Validator.pathValidator(path);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
        return path;
    }

    private static String getCity(){
        System.out.println("enter the city");
        String city = scanner.nextLine();
        try {
            Validator.validateCity(city);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
        return city;
    }
}

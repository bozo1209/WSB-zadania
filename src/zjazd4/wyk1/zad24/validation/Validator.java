package zjazd4.wyk1.zad24.validation;

import zjazd4.wyk1.zad24.exceptions.ValidationException;

import java.nio.file.Paths;

public class Validator {

    public static void validateCity(String city) throws ValidationException {
        if(city.length() <= 3){
            throw new ValidationException("city " + city + " is invalid");
        }
    }

    public static void pathValidator(String path) throws ValidationException{
        if(!Paths.get(path).toFile().exists()){
            throw new ValidationException("path " + path + " is incorrect");
        }
    }
}

package zjazd3.zadaniaDodatkowe.zad14;

import java.lang.reflect.Field;

public class FieldEqualsValidator {

    public static boolean validate(Object object) throws Exception{

        Field firstName = object.getClass().getDeclaredField("firstName");
        Field secondName = object.getClass().getDeclaredField("secondName");

        firstName.setAccessible(true);
        secondName.setAccessible(true);

        Object firstNameObject = firstName.get(object);
        Object secondNameObject = secondName.get(object);

        FieldEquals fieldEquals = object.getClass().getAnnotation(FieldEquals.class);
        String firstField = fieldEquals.firstField();
        String secondField = fieldEquals.secondField();

        if ((firstNameObject instanceof String firstNameString) && (secondNameObject instanceof String secondNameString)){
            return firstNameString.matches(firstField) && secondNameString.matches(secondField);
        }
        return false;
    }
}

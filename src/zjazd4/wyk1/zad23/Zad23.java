package zjazd4.wyk1.zad23;

import java.util.Optional;

public class Zad23 {

    public static void main(String[] args) {
        System.out.println(isDigitWithoutOptional(4));
        System.out.println(isDigitWithoutOptional(10));
        System.out.println(isDigitWithoutOptional(null));
        System.out.println(isDigitWithOptional(4));
        System.out.println(isDigitWithOptional(10));
        System.out.println(isDigitWithOptional(null));

    }


    public static boolean isDigitWithoutOptional(Integer value) {
        boolean isDigit = false;
        if (value != null && value >= 0 && value <= 9) {
            isDigit = true;
        }
        return isDigit;
    }

    public static boolean isDigitWithOptional(Integer value){
        return Optional
                .ofNullable(value)
                .filter(v -> v >= 0 && v <= 9)
                .isPresent();
    }

}

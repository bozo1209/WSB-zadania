package zjazd3.zadaniaDodatkowe.zad15;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad15 {

    public static void main(String[] args) {

        UpperCase upperCase = String::toUpperCase;

        LetterSpaceSeparated letterSpaceSeparated = s -> {
            StringBuilder sb = new StringBuilder();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++){
                sb.append(chars[i]);
                if (!(i == chars.length - 1)){
                    sb.append(" ");
                }
            }
            return sb.toString();
        };

        System.out.println(upperCase.upperCase("test"));
        System.out.println(letterSpaceSeparated.letterSpaceSeparated("test"));


        Function<String, String> function = String::toUpperCase;
        Function<String, String> function2 = s -> {
            StringBuilder sb = new StringBuilder();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++){
                sb.append(chars[i]);
                if (!(i == chars.length - 1)){
                    sb.append(" ");
                }
            }
            return sb.toString();
        };

        System.out.println(function.apply("test"));
        System.out.println(function2.apply("test"));

        String collect = Stream.of("test").map(function).map(function2).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}

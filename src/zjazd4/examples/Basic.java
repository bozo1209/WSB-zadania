package zjazd4.examples;

import java.util.Optional;

public class Basic {

    public static void main(String[] args) {
        String nullName = null;
        String name = "Ania";

        if (nullName != null) {
            System.out.println(nullName.toUpperCase());
        }

        //Exception driven development - do not handle NullPointerException like this
        try {
            System.out.println(nullName.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Name is null - cannot convert it to UpperCase");
        }


        System.out.println("-------------------");

        //Optional creation / difference between ofNullable / of
        Optional<Object> empty = Optional.empty();
        Optional.of(name) //this will fail for nulls -> better use ofNullable
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
        //Difference - try both methods with name and nullName - what is different
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(n -> System.out.println("ofNullable-null " + n));
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        n -> System.out.println("ofNullable-null " + n),
                        () -> System.out.println("ofNullable-null " + "UNKNOWN")); //new thread


        System.out.println("-------------------");

        Optional<String> nullNameOptional = Optional.ofNullable(nullName);
        // don't call get without checking if value is present - it may faile
        // System.out.println("get " + Optional.ofNullable(nullName).get().toUpperCase());

        if (Optional.ofNullable(nullName).isPresent()) {
            System.out.println("get " + nullName.toUpperCase());
        }

        Optional<String> nameOptional = Optional.ofNullable(name);
        if (nameOptional.isPresent()) {
            System.out.println("get " + nameOptional.get().toUpperCase());
        }

        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(n -> System.out.println("ofNullable-null " + n));

        System.out.println("-------------------");

       /* Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresent(n -> System.out.println("ofNullable-someValue " + n));
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        n -> System.out.println("ofNullable-someValue " + n),
                        () -> System.out.println("ofNullable-someValue UNKNOWN"));
        Optional.of(name)
                .map(String::toUpperCase)
                .ifPresent(n -> System.out.println("of-someValue " + n));*/

        System.out.println("-------------------");

        //Differance between orElse, orElseGet - see difference for null and non-null value
        Optional.ofNullable(nullName)
                .map(String::toUpperCase)
                .orElse("DEFAULT");
        // the same result if value is empty,
        Optional.ofNullable(nullName)
                .map(String::toUpperCase)
                .orElse(getDefault("orElse", null));
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse(getDefault("orElse", "SOME"));
        Optional.ofNullable(nullName)
                .map(String::toUpperCase)
                .orElseGet(() -> getDefault("orElseGet", null));
        Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElseGet(() -> getDefault("orElseGet", "SOME"));


    }

    private static String getDefault(String method, String value) {
        System.out.println("generating default name in: " + method + " value: " + value);
        return "DEFAULT";
    }
}

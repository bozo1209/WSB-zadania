package zjazd3.wyk2.zad22;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Zad22 {

    public static void main(String[] args) {
        String text1 = " W pustyni i w PUSZCZy";
        String text2 = " o dwóch TAKICH co ukradli      Księżyc";

        System.out.println(text1);
        System.out.println(normalizeTitle(text1));
        System.out.println(normalizeTitle2(text1));
        System.out.println(normalizeTitle(text1).equals(normalizeTitle2(text1)));
        System.out.println(text2);
        System.out.println(normalizeTitle(text2));
        System.out.println(normalizeTitle2(text2));
        System.out.println(normalizeTitle(text2).equals(normalizeTitle2(text2)));

    }

    public static String normalizeTitle(String value){
        return Arrays.stream(
                        value
                            .trim()
                            .replaceAll("\s+", " ")
                            .split("\s"))
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
                    .collect(Collectors.joining(" "));

    }

    public static String normalizeTitle2(String value){
        String[] s = value.trim()
                        .replaceAll("\s+", " ")
                        .split("\s");

        for (int i = 0; i < s.length; i++){
            s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase();
        }

        return String.join(" ", s);
    }

}

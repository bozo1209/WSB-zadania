package zjazd3.zadaniaDodatkowe.zad15;

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

    }
}

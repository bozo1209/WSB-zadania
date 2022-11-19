package zjazd3.wyk1.zad20;

import java.util.*;

public class Zad20 {

    public static void main(String[] args) {

        countWords(wordsFromUser()).forEach((k, v) -> System.out.printf("word %s number of occurrences %s%n", k, v));
    }

    private static List<String> wordsFromUser(){
        List<String> wordsFromUser = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.next();
            if(line.equalsIgnoreCase("Q")){
                break;
            }
            wordsFromUser.add(line);
        }
        return Collections.unmodifiableList(wordsFromUser);
    }

    private static Map<String, Integer> countWords(List<String> list){
        Map<String, Integer> map = new HashMap<>();
        list.forEach(e -> map.put(e, (int) list.stream().filter(e2 -> e2.equals(e)).count()));
        return Collections.unmodifiableMap(map);
    }
}

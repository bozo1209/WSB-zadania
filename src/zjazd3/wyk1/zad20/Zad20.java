package zjazd3.wyk1.zad20;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Zad20 {

    public static void main(String[] args) {

        List<String> list = wordsFromUser();
        countWords(list).forEach((k, v) -> System.out.printf("word %s number of occurrences %s%n", k, v));
        System.out.println("************");
        countWordsWithoutHashMap(list);
        System.out.println("************");
        List<String> list1 = countWordsWithoutHashMap2(list);
        list1.forEach(System.out::println);
        System.out.println("************");
        Map<String, Long> map = countWordsWithoutHashMap3(list);
        map.forEach((k, v) -> System.out.printf("word %s number of occurrences %s%n", k, v));
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

    private static void countWordsWithoutHashMap(List<String> list){
        list.stream().forEach(word -> System.out.printf("word %s number of occurrences %s%n", word, Collections.frequency(list, word)));
    }

    private static List<String> countWordsWithoutHashMap2(List<String> list){
        return list.stream().map(w -> "word " + w + " number of occurrences " + Collections.frequency(list, w)).distinct().toList();
    }

    private static Map<String, Long> countWordsWithoutHashMap3(List<String> list){
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}

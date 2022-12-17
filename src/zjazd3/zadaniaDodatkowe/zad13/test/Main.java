package zjazd3.zadaniaDodatkowe.zad13.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product product = new Product("apple", 1);
        list.add(product);
        product = new Product("apple", 2);
        list.add(product);
        product = new Product("apple", 3);
        list.add(product);
        product = new Product("banana", 1);
        list.add(product);
        product = new Product("banana", 2);
        list.add(product);
        product = new Product("ananas", 2);
        list.add(product);

        Map<String, List<Product>> collect = list.stream().collect(Collectors.groupingBy(p -> p.getName()));

        System.out.println(collect);
        System.out.println("------------");
        collect.forEach((k, v) -> System.out.printf("name: %s list: %s%n", k ,v));

    }
}

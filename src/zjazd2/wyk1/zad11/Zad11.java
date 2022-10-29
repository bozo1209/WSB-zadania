package zjazd2.wyk1.zad11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        List<Integer> numbersFromUser = getNumbersFromUser();

        System.out.println("----------");
        System.out.printf("odd numbers sum: %s\n", sum(getOddList(numbersFromUser)));
        System.out.println("----------");
        System.out.printf("even numbers sum: %s\n", sum(getEvenList(numbersFromUser)));
        System.out.println("----------");
        System.out.printf("numbers sum: %s\n", sum(numbersFromUser));

    }

    public static int oddSum(List<Integer> numbers){
        return numbers.stream().filter(number -> number % 2 != 0).mapToInt(Integer::intValue).sum();
    }

    public static int evenSum(List<Integer> numbers){
        return numbers.stream().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public static int sum(List<Integer> numbers){
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> getOddList(List<Integer> numbers){
        return numbers.stream().filter(number -> number % 2 != 0).toList();
    }

    public static List<Integer> getEvenList(List<Integer> numbers){
        return numbers.stream().filter(number -> number % 2 == 0).toList();
    }

    public static List<Integer> getNumbersFromUser(){
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me number.\n\"0\" will close app");

        while (true){
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();

                if (i == 0){
                    break;
                }

                numbers.add(i);
            }else {
                System.out.println("write int");
                scanner.next();
            }
        }
        return numbers;
    }
}

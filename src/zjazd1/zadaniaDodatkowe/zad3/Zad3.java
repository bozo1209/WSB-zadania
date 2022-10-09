package zjazd1.zadaniaDodatkowe.zad3;

import java.util.Arrays;

public class Zad3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,5,4,3,2,22,1,7,4};
        int[] empty = {};
        System.out.println(max(numbers));
        System.out.println(max(empty));
    }

    public static int max(int[] items){
        return Arrays.stream(items).max().orElse(0);
    }
}

package zjazd2.zadaniaDodatkowe.zad6;

import java.util.Arrays;

public class Zad6 {

    public static void main(String[] args) {
        int[] items = {1,2,3,4,5,6,7,8,9};
        System.out.println("items - " + Arrays.toString(items));
        reverse(items);
        System.out.println("reverse items - " + Arrays.toString(items));
    }

    private static void reverse(int[] items){
        for (int i = 0; i < items.length / 2; i++){
            int temp = items[i];
            items[i] = items[items.length - i - 1];
            items[items.length - i - 1] = temp;
        }
    }
}

package zjazd2.zadaniaDodatkowe.zad9;

import java.util.Arrays;

public class Zad9 {

    public static void main(String[] args) {
        int[] items = {3,7,5,6,2};
        selectionSort(items);
        System.out.println(Arrays.toString(items));
    }

    public static void selectionSort(int[] items){
        int[] tempArr = Arrays.copyOf(items, items.length);
        for (int i = 0; i < items.length; i++){
            int tempEl = Arrays.stream(tempArr).min().getAsInt();
            tempArr = Arrays.stream(tempArr).filter(e -> e > tempEl).toArray();
            items[i] = tempEl;
        }
    }
}

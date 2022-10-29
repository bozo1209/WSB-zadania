package zjazd2.wyk2.zad15;

import java.util.Arrays;

public class Zad15 {
    public static void main(String[] args) {
        int[] arr = {2,1,4,2,5,4,7,3,7,3};

        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------");
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        int[] result = Arrays.copyOf(arr, arr.length);

        for(int i = 0; i < result.length - 1; i++){
            for (int j = 0; j < result.length - i - 1; j++){
                if (result[j] > result[j + 1]){
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        return result;
    }
}

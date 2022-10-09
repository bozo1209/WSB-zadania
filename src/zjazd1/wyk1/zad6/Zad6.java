package zjazd1.wyk1.zad6;

import java.util.Arrays;

public class Zad6 {
    public static void main(String[] args) throws Exception {
        int[] arr = createArr();
        int[] arr1 = createArr();
        System.out.println(Arrays.stream(arr).average().getAsDouble());
        System.out.println(Arrays.stream(arr).average().orElseThrow());
        System.out.println(avr(arr1));
    }

    public static double avr(int[] arr) throws Exception {
        if (arr.length == 0) throw new Exception("array is empty");
        double sum = 0.0;
        for (int e : arr){
            sum += e;
        }
        return sum / arr.length;
    }

    public static int[] createArr(){
        int[] arr = new int[10];
        arr[0] = 2;
        for (int i = 1; i < arr.length; i++){
            arr[i] = arr[i - 1] + 2;
        }
        return arr;
    }
}

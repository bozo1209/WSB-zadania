package zjazd2.zadaniaDodatkowe.zad10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * still working on it
 */
public class Zad10 {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2},{1}};
        System.out.println("arr " + Arrays.deepToString(reorder(arr)));
        int[][] arr1 = {{4,5},{8,7,1}};
        System.out.println("arr1 " + Arrays.deepToString(reorder(arr1)));
        int[][] arr2 = {{1,2,3}};
        System.out.println("arr2 " + Arrays.deepToString(reorder(arr2)));
        int[][] arr3 = {{1,2,3},{1,2,3},{1,2,3},{1,2,3,4,5,6,7}};
        System.out.println("arr2 " + Arrays.deepToString(reorder(arr3)));
    }

    public static int[][] reorder(int[][] items){
        int[][] result;
        List<Integer>[] partResult;
        
        Object[] lengthsOfInnerArrays = Arrays.stream(items).map(arr -> arr.length).toArray();
        Stream<Integer> integerStream = Arrays.stream(items).map(arr -> arr.length);
        Integer lengthForArray = Arrays.stream(items).map(arr -> arr.length).max(Integer::compare).get();
        result = new int[lengthForArray][];
        partResult = new ArrayList[lengthForArray];
        for (int i = 0; i < partResult.length; i++){
            partResult[i] = new ArrayList<>();
        }
        System.out.println(Arrays.toString(lengthsOfInnerArrays));
        for (int i = 0; i < items.length; i++){
//            result[i] = new int[(Integer) lengthsOfInnerArrays[i]];
//            result[i] = new int[Arrays.stream(lengthsOfInnerArrays).filter()];
            for(int j =0; j < items[i].length; j++){

            }
        }
        arraySize(integerStream, lengthForArray);
        return result;
    }

    private static int arraySize(Stream<Integer> integerStream, int size){
        Object[] objects = integerStream.sorted(Comparator.reverseOrder()).toArray();
        System.out.println(Arrays.toString(objects));
        if (objects.length == size){

        }
        return 1;
    }

//    public static int[][] r(int[][] items){
//        int[][] result;
//
//    }
}

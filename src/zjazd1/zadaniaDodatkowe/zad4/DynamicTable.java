package zjazd1.zadaniaDodatkowe.zad4;

import java.util.Arrays;

public class DynamicTable {
    private double[] arr;

    public DynamicTable() {
        this.arr = new double[1];
    }

//    public DynamicTable(int i) {
//        this.arr = new double[i];
//    }

    void addItem(double newItem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0.0) {
                arr[i] = newItem;
                break;
            }
            if (i == arr.length - 1) {
                arr = resize(arr);
                arr[i + 1] = newItem;
                break;
            }
        }
    }

    void deleteItem(int deleteIndex) {
        arr = resize(arr, deleteIndex);
    }

    private double[] resize(double[] arr) {
        double[] newArr = new double[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
//        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    private double[] resize(double[] arr, int deleteIndex) {
        double[] newArr = new double[arr.length - 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != deleteIndex) {
                newArr[count++] = arr[i];
            }
        }
        return newArr;
    }

    @Override
    public String toString() {
        return "DynamicTable{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

package zjazd1.zadaniaDodatkowe.zas5;

import zjazd1.zadaniaDodatkowe.zad4.DynamicTable;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class UniqueTable extends DynamicTable {

    public UniqueTable() {
        super();
    }

    @Override
    public void addItem(double newItem) {
        long count = Arrays.stream(super.getArr()).filter(item -> item == newItem).count();
        if (count == 0){
            super.addItem(newItem);
        }
    }

    public void deleteItem(double deleteItem){
        boolean itemDontExist = Arrays.stream(super.getArr()).
                filter(e -> e == deleteItem).count() == 0L;
        if (itemDontExist) return;

        Random random = new Random();
        if (random.nextBoolean()){
            System.out.println("if");
            super.deleteItem(getIndexNumber(deleteItem));
        }else {
            System.out.println("else");
            super.deleteItem(getIndexNumberRecursion(deleteItem));
        }
    }

    private int getIndexNumber(double deleteItem){
        return IntStream.range(0, super.getArr().length).
                filter(i -> super.getArr()[i] == deleteItem).
                findFirst().orElseThrow();
    }

    private int getIndexNumberRecursion(double deleteItem){
        return indexRecursion(deleteItem, 0);
    }

    private int indexRecursion(double deleteItem, int start){
        if (start == super.getArr().length) return -1;
        if (deleteItem == super.getArr()[start]) return start;
        return indexRecursion(deleteItem, start + 1);
    }

    @Override
    public String toString() {
        return "UniqueTable{" +
                "arr=" + Arrays.toString(super.getArr()) +
                '}';
    }
}

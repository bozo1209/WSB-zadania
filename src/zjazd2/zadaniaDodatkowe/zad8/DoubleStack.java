package zjazd2.zadaniaDodatkowe.zad8;

import java.util.Arrays;

public class DoubleStack {

    private Double[] stackArray;

    public DoubleStack() {
        this.stackArray = new Double[0];
    }

    public void push(Double value){
        stackArray = resize(stackArray, ResizeType.UP);
        stackArray[stackArray.length - 1] = value;
    }

    public Double pop() throws NoItems {
        if (stackArray.length == 0) throw new NoItems();
        Double result = stackArray[stackArray.length - 1];
        stackArray = resize(stackArray, ResizeType.DOWN);
        return result;
    }

    public Double peek() throws NoItems {
        if (stackArray.length == 0) throw new NoItems();
        return stackArray[stackArray.length - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }

    private Double[] resize(Double[] arr, ResizeType resizeType){
        return switch (resizeType){
            case UP -> Arrays.copyOf(arr, arr.length + 1);
            case DOWN -> Arrays.copyOf(arr, arr.length - 1);
        };
    }

    private enum ResizeType{
        UP, DOWN
    }

    public static class NoItems extends Exception{
        public NoItems(){
            super("no items on the stack");
        }
    }
}

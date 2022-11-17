package zjazd2.wyk2.zad18;


import java.util.Arrays;

public class IntSet {

    private int[] setArray;

    public IntSet(){
        setArray = new int[0];
    }

    public boolean add(int e){
        if(contains(e)) return false;
        setArray = Arrays.copyOf(setArray, setArray.length + 1);
        setArray[setArray.length - 1] = e;
        return true;
    }

    public boolean remove(int e){
        if(!contains(e)) return false;
        setArray = Arrays.stream(setArray).filter(el -> el != e).toArray();
        return true;
    }

    public boolean contains(int e){
        return Arrays.stream(setArray).filter(el -> el == e).count() > 0;
    }

    public int size(){
        return setArray.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(setArray);
    }

}

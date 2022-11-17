package zjazd2.wyk2.zad18;

public class Zad18 {
    public static void main(String[] args) {
        IntSet set = new IntSet();
        System.out.println("set = " + set);
        System.out.println("set add 1 = " + set.add(1));
        System.out.println("set = " + set);
        System.out.println("set add 1 again = " + set.add(1));
        System.out.println("set = " + set);
        System.out.println("set add 2 = " + set.add(2));
        System.out.println("set = " + set);
        System.out.println("set remove 1 = " + set.remove(1));
        System.out.println("set = " + set);
        System.out.println("set remove 1 = " + set.remove(1));
        System.out.println("set = " + set);
        System.out.println("set remove 2 = " + set.remove(2));
        System.out.println("set = " + set);
        for (int i = 1; i < 10; i++){
            System.out.println(set.add(i));
        }
        System.out.println("set = " + set);
        System.out.println("set remove 5 = " + set.remove(5));
        System.out.println("set = " + set);
        System.out.println("set remove 7 = " + set.remove(7));
        System.out.println("set = " + set);


    }
}

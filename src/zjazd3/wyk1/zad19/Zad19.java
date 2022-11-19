package zjazd3.wyk1.zad19;

public class Zad19 {

    public static void main(String[] args) {
        Container<Integer> c1 = new Container<>(1);
        Container<String> c2 = new Container<>("hello");
        Pair<Integer, String> p1 = new Pair<>(1, "one");
        Pair<Container<Integer>, Container<String>> p2 = new Pair<>(c1,c2);

        System.out.println("c1 " + c1.getT());
        System.out.println("c2 " + c2.getT());
        System.out.println("p1 " + p1.getT1());
        System.out.println("p1 " + p1.getT2());
        System.out.println("p2 " + p2.getT1().getT());
        System.out.println("p2 " + p2.getT2().getT());

    }
}

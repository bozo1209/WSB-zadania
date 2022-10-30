package zjazd2.wyk2.zad17;

public class Zad17 {
    public static void main(String[] args) {
        IntegerQueue iq = new IntegerQueue();
        iq.addLast(1);
        iq.pickFirst();
        iq.pickLast();
        iq.addLast(2);
        iq.pickFirst();
        iq.pickLast();
        iq.addLast(3);
        iq.pickFirst();
        iq.pickLast();
        iq.addLast(4);
        iq.pickFirst();
        iq.pickLast();

        System.out.println("-----------------");

        iq.showAll();

        System.out.println("-----------------");

        System.out.println(iq.getFirst());

        System.out.println("-------start----------");

        iq.showAll();

        System.out.println("--------end---------");

        System.out.println(iq.getFirst());

        System.out.println("-------start----------");

        iq.showAll();

        System.out.println("--------end---------");

        System.out.println(iq.getFirst());

        System.out.println("-------start----------");

        iq.showAll();

        System.out.println("--------end---------");

        System.out.println(iq.getFirst());

        System.out.println("-----------------");

        System.out.println("-------start----------");

        iq.showAll();

        System.out.println("--------end---------");



    }


}

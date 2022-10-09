package zjazd1.zadaniaDodatkowe.zas5;

public class Main {
    public static void main(String[] args) {
        UniqueTable ut = new UniqueTable();
        ut.addItem(55.5);
        ut.addItem(1.5);
        System.out.println(ut);
        ut.addItem(1.5);
        System.out.println(ut);
        ut.addItem(2.5);
        System.out.println(ut);
        ut.addItem(3.5);
        System.out.println(ut);
        ut.deleteItem(1.5);
        System.out.println(ut);
        ut.deleteItem(0.5);
        System.out.println(ut);
    }
}

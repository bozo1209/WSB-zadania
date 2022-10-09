package zjazd1.zadaniaDodatkowe.zad4;

public class Main {
    public static void main(String[] args) {
        DynamicTable dt = new DynamicTable();
        dt.addItem(1.5);
        dt.addItem(2.5);
        dt.addItem(3.5);
        System.out.println(dt);
        dt.deleteItem(0);
        System.out.println(dt);
    }

}

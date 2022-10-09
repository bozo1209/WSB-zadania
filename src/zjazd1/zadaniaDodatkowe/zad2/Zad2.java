package zjazd1.zadaniaDodatkowe.zad2;


public class Zad2 {
    public static void main(String[] args) {
        String[] items = {"a","b","c","d"};
        String[] items2 = reverse(items);
        print(items);
        print(items2);
    }

    public static String[] reverse(String[] items){
        String[] result = new String[items.length];
        for (int i = 0; i < items.length; i++){
            result[items.length - 1 - i] = items[i];
        }
        return result;
    }

    public static void print(String[] items){
        System.out.println("Table: " + String.join(" ", items));
    }
}

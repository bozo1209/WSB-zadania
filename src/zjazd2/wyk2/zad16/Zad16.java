package zjazd2.wyk2.zad16;

public class Zad16 {
    public static void main(String[] args) {
        System.out.println(fib(19));
    }

    public static int fib(int a){
        if (a == 0) return 0;
        if (a == 1) return 1;
        return fib(a - 1) + fib(a - 2);
    }
}

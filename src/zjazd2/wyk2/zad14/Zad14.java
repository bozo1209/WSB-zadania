package zjazd2.wyk2.zad14;

public class Zad14 {
    public static void main(String[] args) {
        System.out.println(nwd(1989, 867));
    }

    public static int nwd(int a, int b){
        if (b == 0) return a;
        return nwd(b, a % b);
    }
}

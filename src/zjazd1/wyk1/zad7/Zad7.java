package zjazd1.wyk1.zad7;

public class Zad7 {
    public static void main(String[] args) {
        System.out.println(convertEurToPln(5.32, 4.8606));
    }

    public static double convertEurToPln(double eurValue, double exchangeRate){
        return eurValue * exchangeRate;
    }
}

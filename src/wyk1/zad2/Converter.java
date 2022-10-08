package wyk1.zad2;

public class Converter {
    public static void main(String[] args) {
        double priceInEur = 5;
        double eurToPlnRatio = 4.25;
        double priceInPln;

        printValue(priceInEur, eurToPlnRatio);
    }

    public static double convert(double priceInEur, double eurToPlnRatio){
        return priceInEur * eurToPlnRatio;
    }

    public static void printValue(double priceInEur, double eurToPlnRatio){
        System.out.printf("Cena w EUR: %s\nPrzelicznik: %s\nCena w PLN: %s", priceInEur, eurToPlnRatio, convert(priceInEur, eurToPlnRatio));
    }
}

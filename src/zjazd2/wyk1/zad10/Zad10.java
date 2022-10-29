package zjazd2.wyk1.zad10;

import java.util.Arrays;

public class Zad10 {
    public static void main(String[] args) {

        double[] prices = {1.0, 1.0, 1.0};
        int discount = 10;

        System.out.printf("sum before discount: %s\n", sum(prices));
        System.out.printf("sum after discount: %s\n", sum(createDiscountArr(prices, discount)));

    }

    public static double sum(double[] prices){
        return Arrays.stream(prices).sum();
    }

    public static double[] createDiscountArr(double[] prices, int discountInPercent){
        return Arrays.stream(prices).map(e -> priceAfterDiscount(e, discountInPercent)).toArray();
    }

    public static double priceAfterDiscount(double price, int discountInPercent){
        return price * (1.0 - discountInPercent / 100.0);
    }
}

package zjazd1.wyk1.zad4;

public class Zad4 {

    public static void main(String[] args) {
        int number;

        for (number = 1; number < 3; number++){
            System.out.printf("number %s is %s", number, checkIfOddOrEven(number));
            System.out.println();
        }
    }

    public static String checkIfOddOrEven(int number){
        return (number % 2 == 0) ? "even" : "odd";
    }
}

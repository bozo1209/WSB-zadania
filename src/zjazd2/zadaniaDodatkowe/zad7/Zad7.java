package zjazd2.zadaniaDodatkowe.zad7;


public class Zad7 {

    public static void main(String[] args) throws Exception {
        int number = 12;
        System.out.println("factorial " + number + " = " + factorial(number));
        System.out.println("factorial " + number + " = " + factorialRecursive(number));
    }

    private static int factorial(int n) throws TooBigNumberException {
        int result = 1;
        if (n == 0 || n == 1) return result;
        if (n >= 13) throw new TooBigNumberException();
        for (int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }

    private static int factorialRecursive(int n) throws TooBigNumberException {
        if (n == 0 || n == 1) return 1;
        if (n >= 13) throw new TooBigNumberException();
        return n * factorialRecursive(n - 1);
    }

    private static class TooBigNumberException extends Exception {

        public TooBigNumberException(){
            super("to big number for int");
        }
    }
}

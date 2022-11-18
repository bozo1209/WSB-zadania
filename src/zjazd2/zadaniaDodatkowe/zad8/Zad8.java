package zjazd2.zadaniaDodatkowe.zad8;

public class Zad8 {

    public static void main(String[] args) {
        DoubleStack stack = new DoubleStack();
        try {
            System.out.println(stack.peek());
        } catch (DoubleStack.NoItems e) {
            e.printStackTrace();
            System.out.println("1 err");
        }
        stack.push(1.0);
        stack.push(2.0);
        stack.push(3.0);
        stack.push(4.0);
        System.out.println(stack);
        try {
            System.out.println(stack.peek());
        } catch (DoubleStack.NoItems e) {
            e.printStackTrace();
            System.out.println("2 err");
        }
        System.out.println(stack);
        try {
            System.out.println(stack.pop());
        } catch (DoubleStack.NoItems e) {
            e.printStackTrace();
            System.out.println("3 err");
        }
        System.out.println(stack);
        try {
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        } catch (DoubleStack.NoItems e) {
            e.printStackTrace();
            System.out.println("4 err");
        }


    }
}

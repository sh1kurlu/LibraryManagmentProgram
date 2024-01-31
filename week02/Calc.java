package week02;
public class Calc {
    public static void main(String[] args) {

        int first = Integer.parseInt(args[0]), second = Integer.parseInt(args[1]);

        System.out.println("Sum: " + (first + second));
        System.out.println("Substraction: " + (first - second));
        System.out.println("Multiplication: " + (first * second));
        System.out.println("Integer division: " + (first / second));
        System.out.println("Remainder: " + (first % second));

        //Use Integer.parseInt because 'args' is in String

    }
}

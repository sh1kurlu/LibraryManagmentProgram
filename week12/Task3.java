package week12;

interface Calculator {
    double calculate(double a, double b);
}

public class Task3 {
    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.calculate(5, 3));

        Calculator subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.calculate(5, 3));

        Calculator multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.calculate(5, 3));

        Calculator division = (a, b) -> a / b;
        System.out.println("Division: " + division.calculate(5, 3));

        Calculator exponentiation = Math::pow;
        System.out.println("Exponentiation: " + exponentiation.calculate(5, 3));
    }
}


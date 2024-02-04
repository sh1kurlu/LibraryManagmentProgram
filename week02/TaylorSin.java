package week02;
import java.util.Scanner;

public class TaylorSin {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();

        int n = s.nextInt();

        double taylorSin = calculateSin(x, n);
        double mathSin = Math.sin(x);

        System.out.println("Taylor Series sin(" + x + ") with " + n + " terms: " + taylorSin);
        System.out.println("Math.sin(" + x + "): " + mathSin);

        // Compare with Math.sin(x) for different values of n
        for (int i = 1; i <= n; i++) {
            double taylorApproximation = calculateSin(x, i);
            System.out.println("sin("+ x +") with " + i + "nd term: " + taylorApproximation);

        }
        
    }

     static double calculateSin(double x, int n) {
        double sinValue = 0;

        for (int i = 0; i < n; i++) {
            int exponent = 2 * i + 1;
            double term = Math.pow(-1, i) * (Math.pow(x, exponent) / factorial(exponent));
            sinValue += term;
        }

        return sinValue;
    }

    // Factorial finding with Recursion:
     static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

        
    }
    
}

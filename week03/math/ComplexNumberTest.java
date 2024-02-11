package week03.math;

import java.util.Scanner;

public class ComplexNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real part for Complex Number 1:");
        double real1 = scanner.nextDouble();

        System.out.println("Enter imaginary part for Complex Number 1:");
        double imag1 = scanner.nextDouble();

        System.out.println("Enter real part for Complex Number 2:");
        double real2 = scanner.nextDouble();

        System.out.println("Enter imaginary part for Complex Number 2:");
        double imag2 = scanner.nextDouble();

        ComplexNumber num1 = new ComplexNumber(real1, imag1);
        ComplexNumber num2 = new ComplexNumber(real2, imag2);

        System.out.println("num1: " + num1.toString());
        System.out.println("num2: " + num2.toString());

        System.out.println("Equals: " + num1.equals(num2));

        System.out.println("Conjugate of num1: " + num1.conjugate().toString());
        System.out.println("Absolute value of num2: " + num2.abs().toString());

        ComplexNumber sum = num1.add(num2);
        System.out.println("Sum: " + sum.toString());

        ComplexNumber difference = num1.sub(num2);
        System.out.println("Difference: " + difference.toString());

        ComplexNumber product = num1.mult(num2);
        System.out.println("Product: " + product.toString());
        
        scanner.close();
    }

   



    


   
}

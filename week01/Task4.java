package week01;

public class Task4 {
    public static void main(String[] args) {

        double res = (1.0/5) * (2.0/3) - (3.0/10);
        // 'double' is one of the best for making decimal computations 
        /* Either denominator or numerator should be decimal for program
         to know that return is not going to be remainder rather a decimal value */

        // 1) System.out.println()
        System.out.println(res);
        // Gives output: -0.16666666666666666
        // Explanation: Appends a newline character, so the next output will be on a new line.

        // 2) System.out.print()
        System.out.print(res);
        // Gives output: -0.16666666666666666
        // Explanation: Does not append a newline character, the next output will be on the same line.

        // 3) System.out.printf()
        System.out.printf("%f", res);
        // Gives output: -0.166667

        /*Explanation: Prints the result rounded to one 'decimal place'

        using formatted printing. */ 
        

        // In this case format specifier for the 'double 'should be '%f'


        

    }
}

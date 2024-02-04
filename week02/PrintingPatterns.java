package week02;
import java.util.Scanner;

class PrintingPatterns {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Please enter the size: ");

        // Read the size of the pattern from the user
        int size = scanner.nextInt();

        // it calls nested for loops.
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print '*' if the sum of row and column indices is even, otherwise print '#'
                System.out.print(((i + j) % 2 == 0) ? "* " : "# ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

  
        scanner.close();
    }
}
package week01;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Integer value
        int num = scan.nextInt();

        // Print out the same value in different formats (int, hex, octal and binary)
        System.out.println("Integer Value" + num);

        System.out.println("Hexadecimal Format: " + Integer.toHexString(num));
        
        System.out.println("Octal Format: " + Integer.toOctalString(num));

        System.out.println("Binary Format: " + Integer.toBinaryString(num));
        


    }
}

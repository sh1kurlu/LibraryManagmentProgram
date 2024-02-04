package week02;
import java.util.*;

public class Digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num < 0){
            num *= -1;
        }

        double sum = 0;
        int product = 1;

        int count = 0;

        while(num > 0){
            sum += num%10;
            product *= num%10;
            num /= 10;

            count++;
            
    

        }

        double average = sum/count;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.printf("Average: %.1f", (average));

        s.close();
    }

}

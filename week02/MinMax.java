package week02;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float number = s.nextFloat();

        float max = number;
        float min = number;
        
        while(s.hasNextFloat()){
            number = s.nextFloat();
            if(number < min){
                min = number;
                // Getting the minimum value
            }
            else if(number > max){
                max = number;
                // Getting the maximum value
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Minimum value: " + max);

        s.close();
    }
    
}
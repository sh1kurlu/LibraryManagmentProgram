package week02;
import java.util.*;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt(), num2 = s.nextInt();
        int sum = 0;

        //Check if the order is correct
        if(num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
            
        }

   
        
        // Sum of odd integers
        for(int i = num1; i <= num2; i++){
            if(i%2!=0){
                sum += i;
            }
        }

        System.out.println(sum);

    
        s.close();
    }
}

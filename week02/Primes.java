package week02;
import java.util.*;


public class Primes{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), count = -1;
        

        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                count++;
            }
            
        }

        if(count == 0){
            System.out.println("Its a prime");
        }
        else{
            System.out.println("Its not a prime!");
        }

        s.close();
        
    }

    
}
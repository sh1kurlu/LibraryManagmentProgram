package week02;
import java.util.*;

public class Fact {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int result = 1;

       if(n == 1){
        System.out.println(1);
       }
       
      
       else{
        for(int i = 1; i<=n; i++){
            result = result * i;
        }
       }

       System.out.println(result);
    }
}

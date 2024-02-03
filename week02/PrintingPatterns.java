package week02;
import java.util.*;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        for(int i = 1; i<size-1; i++){
                System.out.println("*#");
                for(int j = 1; j<size-1; j++){
                    System.out.print("*#");
                }
            
        }

    }
    
    
    
    
}

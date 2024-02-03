package week02;
import java.util.*;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        String[][] pattern = new String[size][size];

        for(int i = 0; i<size-1; i++){
            for(int j = 0; j<size; j++){
                if((i+j)%2==0){
                    pattern[i][j] = "*";
                }
                else{
                    pattern[i][j] = "#";
                }
            }
                }

                for(int i = 0; i<size-1; i++){
                    for(int j = 0; j<size; j++){
                        System.out.print(pattern[i][j]);

                    }

                    System.out.println();
                        }
                
            
            
                s.close();
            }
    
        
     
    }
    
    
    
    


package week02;
import java.util.*;

public class Average {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while(s.hasNextInt()){
            sum += s.nextInt();
            count++;

        }
        if(sum == 0){
            System.out.println("Error");
        }

        else if (sum != 0){
            System.out.println(sum/count);
        }

        // Use control + D once you entered all values


        s.close();

    }
}
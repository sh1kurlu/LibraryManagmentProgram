package week02;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Its a leap year!");

        }
        else{
            System.out.println("Its not a leap year");
        }

        s.close();
    }
}

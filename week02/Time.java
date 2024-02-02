package week02;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int second = s.nextInt();

        System.out.println("Hour: " + (second/3600));
        
        // Calculate and print remaining minutes by '%' to 3600 in order to convert from hours to minutes
        System.out.println("Minute: " + (second%3600)/60);
        // Calculate and print remaining minutes by '%' to 60 in order to convert from minutes to seconds.
        System.out.println("Seconds: " + (second%60));


    }
}

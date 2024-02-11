package week03.datetime;
import java.util.*;

public class CustomTimeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours for time1: ");
        int hours1 = scanner.nextInt();
        System.out.print("Enter minutes for time1: ");
        int minutes1 = scanner.nextInt();
        System.out.print("Enter seconds for time1: ");
        int seconds1 = scanner.nextInt();
        CustomTime time1 = new CustomTime(hours1, minutes1, seconds1);

        System.out.print("Enter hours for time2: ");
        int hours2 = scanner.nextInt();
        System.out.print("Enter minutes for time2: ");
        int minutes2 = scanner.nextInt();
        System.out.print("Enter seconds for time2: ");
        int seconds2 = scanner.nextInt();
        CustomTime time2 = new CustomTime(hours2, minutes2, seconds2);

        System.out.print("Enter hours for time3: ");
        int hours3 = scanner.nextInt();
        System.out.print("Enter minutes for time3: ");
        int minutes3 = scanner.nextInt();
        System.out.print("Enter seconds for time3: ");
        int seconds3 = scanner.nextInt();
        CustomTime time3 = new CustomTime(hours3, minutes3, seconds3);

        System.out.print("Enter hours for time4: ");
        int hours4 = scanner.nextInt();
        System.out.print("Enter minutes for time4: ");
        int minutes4 = scanner.nextInt();
        System.out.print("Enter seconds for time4: ");
        int seconds4 = scanner.nextInt();
        CustomTime time4 = new CustomTime(hours4, minutes4, seconds4);

        scanner.close();

        System.out.println("Time 1 with (Universal Format): " + time1.toUniversalString());
        System.out.println("Time 1 with (Standard Format): " + time1.toStandardString());

        System.out.println();

        System.out.println("Time 2 with (Universal Format): " + time2.toUniversalString());
        System.out.println("Time 2 with (Standard Format): " + time2.toStandardString());

        System.out.println();

        System.out.println("Time 3 with (Universal Format): " + time3.toUniversalString());
        System.out.println("Time 3 with (Standard Format): " + time3.toStandardString());

        System.out.println();

        System.out.println("Time 4 with (Universal Format): " + time4.toUniversalString());
        System.out.println("Time 4 with (Standard Format): " + time4.toStandardString());
    }
}

package week03.datetime;
import java.util.*;

public class CustomDateTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Month Of Date1: ");
        int date1_month = s.nextInt();

        System.out.print("Day Of Date1: ");
        int date1_day = s.nextInt();

        System.out.print("Year Of Date1: ");
        int date1_year = s.nextInt();

        System.out.print("Month Of Date2: ");
        int date2_month = s.nextInt();

        System.out.print("Day Of Date2: ");
        int date2_day = s.nextInt();

        System.out.print("Year Of Date2: ");
        int date2_year = s.nextInt();

        CustomDate date1 = new CustomDate(date1_month, date1_day, date1_year);
        CustomDate date2 = new CustomDate(date2_month, date2_day, date2_year);

        System.out.print("Date 1: ");
        date1.displayDate();
        System.out.print("Date 2: ");
        date2.displayDate();

        System.out.print("Formatted Date 1: ");
        date1.displayFormatted();
        System.out.print("Formatted Date 2: ");
        date2.displayFormatted();

        System.out.println("Difference between dates in terms of 'days': " + date1.difference(date2));

        int result = CustomDate.compare(date1, date2);
        System.out.println("Comparison result: " + result);

        s.close();
    }

    
}
package week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate date1 = new CustomDate(3, 3, 2020);
        CustomDate date2 = new CustomDate(2, 10, 2024);

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
    }
}
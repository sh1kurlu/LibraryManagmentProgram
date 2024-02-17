package week04;
import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

    public static String toSort(String input) {
        char[] sorted = input.toLowerCase().toCharArray();
        Arrays.sort(sorted);
        return new String(sorted);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        String sortedText = toSort(input);

        System.out.println("Sorted Text: " + sortedText);

        s.close();
    }
}

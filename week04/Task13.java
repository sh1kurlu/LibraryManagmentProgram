package week04;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputWord = scanner.nextLine();

        for (int i = 0; i < inputWord.length(); i++) {
            String slice = inputWord.substring(0, i) + " " + inputWord.substring(i);
            System.out.println(slice);
        }

        scanner.close();
    }
}

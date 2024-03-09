package week07;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts;
        String word;

        do {
            counts = new int[26];
            System.out.print("Enter a word, preferably only English letters (0 to exit): ");
            word = scan.nextLine();

            word = word.toLowerCase();

            if (word.trim().equals("0"))
                break;

            try {
                for (int i = 0; i < word.length(); i++) {
                    char currentChar = word.charAt(i);
                    if (Character.isLetter(currentChar)) {
                        counts[currentChar - 'a']++;
                    }
                }

                System.out.println("\tHere are the letters:");

                for (int i = 0; i < counts.length; i++) {
                    if (counts[i] != 0) {
                        System.out.println((char) (i + 'a') + ": " + counts[i]);
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter only English letters!");
            }

        } while (true);

        scan.close();
    }
}

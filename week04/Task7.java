package week04;

public class Task7 {
    public static void main(String[] args) {
        String input = "Salam";

        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }

    private static String reverseString(String input) {
        StringBuilder reversedBuilder = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedBuilder.append(input.charAt(i));
        }

        return reversedBuilder.toString();
    }
}

package week04;

public class Task8 {
    public static void main(String[] args) {
        String input = "Baku";

        String exploded = explodeString(input);
        System.out.println("Exploded String: " + exploded);
    }

    private static String explodeString(String input) {
        StringBuilder explodedBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j <= i; j++) {
                explodedBuilder.append(input.charAt(j));
            }
        }

        return explodedBuilder.toString();
    }
}


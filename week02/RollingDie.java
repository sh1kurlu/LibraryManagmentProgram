package week02;
import java.util.Random;


public class RollingDie {
    public static void main(String[] args) {
        Random r = new Random();
        double probability = r.nextDouble(); 
        // This generates a random number between 0 and 1

        int result;
        if (probability < 1.0 / 8.0) {
            result = r.nextInt(4) + 1; // Values 1, 2, 3, 4 with probability 1/8
        } else {
            result = r.nextInt(2) + 5; // Values 5, 6 with probability 1/4
        }

        System.out.println("Rolled: " + result);
    }
}

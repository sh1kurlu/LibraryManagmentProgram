package week02;
import java.util.Random;
import java.util.*;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 

        for (int i = 0; i < n; i++) {
            double x = Math.random() * 2 - 1; // Generate random x-coordinate in the range [-1, 1]
            double y = Math.random() * 2 - 1; // Generate random y-coordinate in the range [-1, 1]

            // Check if the point is inside the circle
            if (x * x + y * y <= 1) {
                System.out.printf("Point %d: (%.4f, %.4f)%n", i + 1, x, y);
            } else {
                // If the point is outside the circle, decrement i to generate another point in the same iteration
                i--;
            }
        }

        s.close();
        
    }
}

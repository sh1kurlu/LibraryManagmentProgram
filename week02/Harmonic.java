package week02;
import java.util.*;

public class Harmonic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();

        double result = 0.0;

        for(int i = 1; i<=n;i++){
            result += 1.0/i;
        }

        System.out.println(result);

        s.close();
    }
}

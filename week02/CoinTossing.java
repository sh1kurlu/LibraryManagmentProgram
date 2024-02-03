package week02;

import java.util.Scanner;

public class CoinTossing {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < n; i++) {
            int tossResult = (int) (Math.random() * 2);

            if (tossResult == 0) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

        double headsProbability = (double) headsCount / n;
        double tailsProbability = (double) tailsCount / n;

        System.out.println("Heads: " + headsCount + " times, Probability: " + headsProbability);
        System.out.println("Tails: " + tailsCount + " times, Probability: " + tailsProbability);
    }

    
}


package week04;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers;

        if (args.length > 0) {
            numbers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int sizeOfArray = scanner.nextInt();
            numbers = new int[sizeOfArray];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < sizeOfArray; i++) {
                numbers[i] = scanner.nextInt();
            }
            scanner.close();
        }

        System.out.println("Maximum: " + findMaximum(numbers));
        System.out.println("Minimum: " + findMinimum(numbers));

        int[] minMax = findBothMinimumAndMaximum(numbers);
        System.out.println("Both Minimum and Maximum: " + minMax[0] + ", " + minMax[1]);
    }

    public static int findMaximum(int[] numbers) {
        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        return maximum;
    }

    public static int findMinimum(int[] numbers) {
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return minimum;
    }

    public static int[] findBothMinimumAndMaximum(int[] numbers) {
        int maximum = numbers[0];
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        return new int[]{minimum, maximum};
    }
}

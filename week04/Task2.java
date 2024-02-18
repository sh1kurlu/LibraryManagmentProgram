package week04;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] elements;

        if (args.length > 0) {
            elements = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                elements[i] = Integer.parseInt(args[i]);
            }
            System.out.println(findMaximumElement(elements));
            System.out.println(findMinimumElement(elements));
        } else {
            Scanner scanner = new Scanner(System.in);
            int sizeOfArray = scanner.nextInt();
            elements = new int[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                elements[i] = scanner.nextInt();
            }
            scanner.close();
        }

        System.out.println(findMaximumElement(elements));
        System.out.println(findMinimumElement(elements));
        int[] minMax = findBothMinimumAndMaximum(elements);
        System.out.println("Minimum element: " + minMax[0]);
        System.out.println("Maximum element: " + minMax[1]);
    }

    public static int findMaximumElement(int[] elements) {
        int maximum = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > maximum) {
                maximum = elements[i];
            }
        }
        return maximum;
    }

    public static int findMinimumElement(int[] elements) {
        int minimum = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] < minimum) {
                minimum = elements[i];
            }
        }
        return minimum;
    }

    public static int[] findBothMinimumAndMaximum(int[] elements) {
        int maximum = elements[0];
        int minimum = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] > maximum) {
                maximum = elements[i];
            }
            if (elements[i] < minimum) {
                minimum = elements[i];
            }
        }
        return new int[]{minimum, maximum};
    }
}

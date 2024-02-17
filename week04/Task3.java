package week04;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        int[] grades = {1,1,1,1,1,1,1,1,1,1,2,2,2};

        Map<Integer, Integer> histogram = createHistogram(grades);
        System.out.println("Histogram: " + histogram);

        double mean = calculateMean(grades);
        int median = calculateMedian(grades);
        int mode = calculateMode(grades);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    private static Map<Integer, Integer> createHistogram(int[] grades) {
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int grade : grades) {
            histogram.put(grade, histogram.getOrDefault(grade, 0) + 1);
        }
        return histogram;
    }

    private static double calculateMean(int[] grades) {
        int sum = Arrays.stream(grades).sum();
        return (double) sum / grades.length;
    }

    private static int calculateMedian(int[] grades) {
        Arrays.sort(grades);
        int middle = grades.length / 2;
        if (grades.length % 2 == 0) {
            return (grades[middle - 1] + grades[middle]) / 2;
        } else {
            return grades[middle];
        }
    }

    private static int calculateMode(int[] grades) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int mode = -1;
        int maxCount = 0;

        for (int grade : grades) {
            int count = countMap.getOrDefault(grade, 0) + 1;
            countMap.put(grade, count);

            if (count > maxCount) {
                maxCount = count;
                mode = grade;
            }
        }

        return mode;
    }
}

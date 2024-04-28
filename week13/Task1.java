package week13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    
    public static int countWords(String text) {
        int count = 0;
        String[] tokens = text.split("\\s+");
        for (String token : tokens) {
            if (token.length() > 3) {
                count++;
            }
        }
        return count;
    }

    public static int countWordsWithoutConcurrency(String filename) throws IOException {
        int totalCount = 0;
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            totalCount += countWords(line);
        }
        reader.close();
        return totalCount;
    }

    public static int countWordsWithConcurrency(String filename, int chunkSize) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List        <Integer> counts = new ArrayList<>();
        String line;
        int lineNumber = 0;
        while ((line = reader.readLine()) != null) {
            if (lineNumber % chunkSize == 0) {
                final int currentLineNumber = lineNumber;
                Thread thread = new Thread(() -> {
                    try {
                        int count = 0;
                        for (int i = currentLineNumber; i < currentLineNumber + chunkSize; i++) {
                            String chunkLine = reader.readLine();
                            if (chunkLine == null) break;
                            count += countWords(chunkLine);
                        }
                        synchronized (counts) {
                            counts.add(count);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
                thread.start();
                thread.join(); 
            }
            lineNumber++;
        }
        reader.close();
        
        int totalCount = 0;
        for (int count : counts) {
            totalCount += count;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        String filename = "/Users/meh2/Desktop/HW/practical-work-sh1kurlu/week13/balzac1.txt";
        int chunkSize = 300;

        // Without concurrency
        long startTime = System.currentTimeMillis();
        try {
            int countWithoutConcurrency = countWordsWithoutConcurrency(filename);
            System.out.println("Total words without concurrency: " + countWithoutConcurrency);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken without concurrency: " + (endTime - startTime) + " milliseconds");

        // With concurrency
        startTime = System.currentTimeMillis();
        try {
            int countWithConcurrency = countWordsWithConcurrency(filename, chunkSize);
            System.out.println("Total words with concurrency: " + countWithConcurrency);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with concurrency: " + (endTime - startTime) + " milliseconds");
    }
}



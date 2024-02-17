package week04;

public class CommandLineArgument {

    public static void main(String[] args) {
        printCommandLineArguments(args);

        if (args.length > 0) {
            int[] numbers = parseArgumentsToIntArray(args);
            printIntArray(numbers);
            printSumAndAverage(numbers);
        } else {
            System.out.println("No integers provided");
        }
    }

    private static void printCommandLineArguments(String[] args) {
        System.out.println("Command Line Arguments:");
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    private static int[] parseArgumentsToIntArray(String[] args) {
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
           numbers[i] = Integer.parseInt(args[i]);  
        }
        return numbers;
    }

    private static void printIntArray(int[] numbers) {
        System.out.println("Integer Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printSumAndAverage(int[] numbers) {
        int sum = calculateSum(numbers);
        double average = (double) sum / numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

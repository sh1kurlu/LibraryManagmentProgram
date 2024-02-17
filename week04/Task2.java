package week04;

public class Task2 {
    private static int[] parseArgumentsToIntArray(String[] args) {
        int [] numbers = new int[args.length];
        for(int i = 0; i<args.length; i++){
            numbers[i] += Integer.parseInt(args[i]);
        }

        return numbers;
    }

    private static int FindMin(int [] numbers){
        int min = Integer.MIN_VALUE;

        for(int number: numbers){
        if(number < min){
            min = number;
        }
    }
    return min;

    }

    private static int FindMax(int [] numbers){
        int max = Integer.MAX_VALUE;

        for(int number: numbers){
           if(max > number){
            max = number;
           }
        }

        return max;
    }

    





}

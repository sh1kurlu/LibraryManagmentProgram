package week04;
import java.util.*;

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

    private static int[]FindMinAndMax(int [] numbers){
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for(int number: numbers){

            if(number < min){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }

        return new int[]{min,max};
    }


    private static void PrintMinAndMax(int [] numbers){
        int min = FindMin(numbers);
        int max =FindMax(numbers);

        System.out.println(min);
        System.out.println(max);

    }



}

package week08;
import java.util.*;

public class SortElementsOfList {
    public static void main(String[] args) {

        List <Integer> unsorted = new ArrayList<Integer>();
        unsorted.add(5);
        unsorted.add(4);
        unsorted.add(3);

        Collections.sort(unsorted);
        System.out.println("\"Collections.sort\" version: " +unsorted);

        List <Integer> unsorted2 = new ArrayList<Integer>();
        unsorted2.add(6);
        unsorted2.add(5);
        unsorted2.add(4);
        unsorted2.sort(null);
        System.out.println("\"List.sort\" version: " +unsorted2);


        List <Integer> unsorted3 = new ArrayList<Integer>();
        unsorted3.add(10);
        unsorted3.add(9);
        unsorted3.add(8);

        unsorted3.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo(num2);
            }
        });
        System.out.println("\"Comparator\" (anonymous class): " + unsorted3);
        
        // Sort using Comparator interface (concrete class)
        unsorted3.sort(new CustomComparator());
        System.out.println("\"Comparator\" (concrete class): " + unsorted3);
    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        return num1.compareTo(num2);
    }

    }


package week08;
import java.util.*;

public class DistinctWords {
    public static void main(String[] args) {

        String[] namesArray = {"Mehdi", "Nazrin", "Peter", "Tamilla", "Ali", "Omar", "Nazrin"};

        List<String> namesList = Arrays.asList(namesArray);

        LinkedHashSet<String> uniqueNamesSet = new LinkedHashSet<>(namesList);

        List<String> uniqueNamesList = new ArrayList<>(uniqueNamesSet);

        Collections.sort(uniqueNamesList);

        for(String name: uniqueNamesList){
            System.out.println(name);
        }
    }
}

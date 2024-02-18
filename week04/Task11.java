package week04;

public class Task11 {

    public static String swapFirstAndLast(String sentence) {
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 1) {
                char firstChar = words[i].charAt(0);
                char lastChar = words[i].charAt(words[i].length() - 1);
                
                words[i] = lastChar + words[i].substring(1, words[i].length() - 1) + firstChar;
            }
        }
        
        
        return String.join(" ", words);
    }

    public static void main(String[] args) {

        String input = "This is PP2 Fall 2021";
        String output = swapFirstAndLast(input);
        System.out.println(output);
    }


}


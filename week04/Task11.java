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


}


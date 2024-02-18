package week04;
import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String mainString = s.nextLine();
        String subString = s.nextLine();

        int index = findSubstringIndex(mainString, subString);

        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println(-1);
        }

        s.close();
    }

    private static int findSubstringIndex(String mainString, String subString) {
        int mainLen = mainString.length();
        int subLen = subString.length();

        for (int i = 0; i <= mainLen - subLen; i++) {
            int j;
            for (j = 0; j < subLen; j++) {
                if (mainString.charAt(i + j) != subString.charAt(j)) {
                    break;
                }
            }
            if (j == subLen) {
                return i; 
            }
        }

        return -1;
    }
}


package week07;
import java.util.Scanner;

class NoInputException extends Exception{
    public NoInputException(String message){
        super(message);
    }
}

public class ParseNumbers {


    public static void main(String[] args) throws NoInputException {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine(), word = null;
        scan.close();

        scan = new Scanner(line); 
        int sum = 0, count = 0;
        while (scan.hasNext()) { 
            word = scan.next();
            try{
            sum += Integer.parseInt(word); 
            count++;
            }
            catch(NumberFormatException e){}
        }

        scan.close();

        try{
        if (count == 0)
        throw new NoInputException("No Input");
        else
            System.out.printf("Sum = %d\nCount = %d\nAverage = %.3f\n", sum, count, (float) sum / count);
    }

        catch (NoInputException e){
            System.out.println(e.getMessage());
        }

    }

}

        


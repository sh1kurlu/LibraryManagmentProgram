package week02;

public class PolarityOfNumber {
    public static void main(String[] args) {
        double num = Double.parseDouble(args[0]);

        if(num > 0){ 
            System.out.println("Number is positive");
        }
        else if (num < 0){
            System.out.println("Number is negative");
        }

        else { 
            System.out.println(0);
        }
    }
}

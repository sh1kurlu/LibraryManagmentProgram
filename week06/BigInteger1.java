package week06;
import java.math.BigInteger;

public class BigInteger1 {

    public void factorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + n + " is: " + result);

    }

        public void power(int base, int exponent){
           
            BigInteger result = BigInteger.valueOf(base).pow(exponent);
    
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        }

        public static void main(String[] args) {
            BigInteger1 bg = new BigInteger1();


            bg.factorial(10);
            bg.power(5,10);
        }
    }





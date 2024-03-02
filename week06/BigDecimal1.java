package week06;
import java.math.BigDecimal;

public class BigDecimal1 {

    public static void main(String[] args) {

        BigDecimal result_A = new BigDecimal("2.35").subtract(new BigDecimal("1.95"));
        System.out.println("Result of a: " + result_A);

        BigDecimal result_B = new BigDecimal("1000000.0").add(new BigDecimal("1.2"))
                .subtract(new BigDecimal("1000000.0"));

        System.out.println("Result of b: " + result_B);
    }
}



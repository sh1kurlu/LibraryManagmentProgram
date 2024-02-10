package week03.invoice;
import java.util.*;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Invoice invoice = new Invoice(s.nextLine(),s.nextLine(),s.nextInt(), s.nextDouble());

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPrice());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());

        s.close();
    }
}

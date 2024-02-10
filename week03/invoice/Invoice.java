package week03.invoice;

public class Invoice {
    private String partNumber, partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price){
        this.partDescription = partDescription;
        this.partNumber = partNumber;

        if(quantity <= 0){
        this.quantity = 0;
        }

        if(price <= 0.0){
        this.price = 0.0;
        } 
    }
   



}

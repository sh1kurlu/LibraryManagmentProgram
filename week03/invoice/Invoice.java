package week03.invoice;

public class Invoice {
    private String partNumber, partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price){
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPrice(price);
        
    }

    public String getPartNumber(){
        return partNumber;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        if(quantity > 0){
            this.quantity = quantity;
          }
          else{
              this.quantity = 0;
          }
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price > 0.0){
            this.price = price;
        }
        else{
            this.price = 0.0;
        }
    }

    public double getInvoiceAmount(){
        return (double) price * quantity;
    }

    public String toString() {
        return String.format("Invoice[PartNumber=%s, PartDescription=%s, Quantity=%d, Price=%.2f]",
                partNumber, partDescription, quantity, price);
    }
}

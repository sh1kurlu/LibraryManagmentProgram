package week07;

public class InvoiceRecall {

public class Invoice {
    private String partNumber;
    private String description;
    private int quantityOfItem;
    private double pricePerItem;
    
    public Invoice (String partNumber, String description, int quantityOfItem, double pricePerItem){
        this.partNumber = partNumber;
        this.description = description;
        setQuantity(quantityOfItem);
        setPriceItem(pricePerItem);
    }
    public String getPartNumber(){
        return partNumber;
    }
    public String getPartDescription(){
        return description;
    }
    public int getQuantity(){
        return quantityOfItem;
    }
    public double getPrice(){
        return pricePerItem;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public void setPartDescription(String description){
        this.description = description;
    }
    public void setQuantity(int quantityOfItem){
        if(quantityOfItem <= 0) {
            throw new IllegalArgumentException("Quantity cannot be negative or zero");
        }
        this.quantityOfItem = quantityOfItem;
    }
   
    public void setPriceItem(double pricePerItem){
        if(pricePerItem <= 0.0) {
            throw new IllegalArgumentException("Price cannot be negative or zero");
        }
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount(){
        return quantityOfItem * pricePerItem;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Part Number: %s, Description: %s, Quantity: %d, Price: %.2f", partNumber, description, quantityOfItem, pricePerItem));
        return sb.toString();
    }
}
}

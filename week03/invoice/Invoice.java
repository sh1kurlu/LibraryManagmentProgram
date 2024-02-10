package week03.invoice;

public class Invoice {
    private String partNumber, partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price){
        this.partDescription = partDescription;
        this.partNumber = partNumber;

        if(quantity > 0){
          this.quantity = quantity;
        }
        else{
            this.quantity = 0;
        }

        if(price > 0.0){
            this.price = price;
        }
        else{
            this.price = 0.0;
        }
    }

    public String getPartNumber(){
        return partNumber;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public void setPartNumber(){
        this.partNumber = partNumber;
    }

    public void setPartDescription(){
        this.partDescription = partDescription;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(){
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

    public void setPrice(){
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
}

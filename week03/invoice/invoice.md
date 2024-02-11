+---------------------+
|      Invoice        |
+---------------------+
| - partNumber: String|
| - partDescription:  |
|    String           |
| - quantity: int     |
| - price: double     |
+---------------------+
| + Invoice(partNumber|
|   : String,          |
|   partDescription:   |
|   String,            |
|   quantity: int,     |
|   price: double)     |
| + getPartNumber():   |
|   String            |
| + getPartDescription()|
|   : String           |
| + setPartNumber(partN|
|   umber: String)     |
| + setPartDescription(|
|   partDescription:   |
|   String)            |
| + getQuantity(): int |
| + setQuantity(quantit|
|   y: int)            |
| + getPrice(): double |
| + setPrice(price: dou|
|   ble)               |
| + getInvoiceAmount():|
|   double            |
+---------------------+
|
|   InvoiceTest        |
+----------------------+
|                      |
| + main(args: String[]):|
|   void               |
+----------------------+

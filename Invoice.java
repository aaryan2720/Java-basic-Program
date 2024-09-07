public class Invoice {

    private String partNumber;
    private String description;
    private double price;
    private int quantity;

    public Invoice(String p, String d, double pe, int q) {
        partNumber = p;
        description = d;
        price = pe;
        quantity = q;
    }

    public Invoice() {}

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setPrice(23);
        invoice.setQuantity(6);
        invoice.setPartNumber("6-55S21");
        invoice.setDescription("Thin and Sharp");

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getDescription());
        System.out.println("Price: " + invoice.getPrice());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }

    public void setPrice(double price) { 
        if(price<0){
    }
    else{

        this.price = price;
    }
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
       
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDescription() {
        return description;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public double getInvoiceAmount() {
        return price * quantity;
    }
}
package Ex_Classes.Bai1_5;

public class Main {
    public static void main(String[] args) {
        InvoiceItem invoiceItem1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(invoiceItem1);

        invoiceItem1.setQty(999);
        invoiceItem1.setUnitPrice(0.99);
        System.out.println(invoiceItem1);
        System.out.println(invoiceItem1);
        System.out.println("Id is: " + invoiceItem1.getId());
        System.out.println("Desc is: " + invoiceItem1.getDesc());
        System.out.println("Qty is: " + invoiceItem1.getQty());
        System.out.println("UnitPrice is: " + invoiceItem1.getUnitPrice());

        System.out.println("The total is: " + invoiceItem1.getTotal());
    }
}

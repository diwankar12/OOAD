package SolidPrinciples.SingleResponsibilityPrinciple;

public class InvoiceDao {
    Invoice invoice ;
    public InvoiceDao(Invoice invoice){
          this.invoice = invoice ;
    }
    public void saveToDb(){

    }
}

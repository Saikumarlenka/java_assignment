package oops_1;
// 17. Create classes to store details for two different types of Products,
//    a) ImportedProducts which have import duty.
//    b) DiscountedProducts which have a discount rate.
// All products have name and base_price.Create required Constructors and following
//  methods: print(), getNetPrice(), setPrice(), setImportDuty(), setDiscountRate()
//   also experiment with upcasting and downcasting.
public class Seventeen {
    public static void main(String[] args) {
        ImportedProducts ip = new ImportedProducts("Laptop", 500000, 0.12);
        DiscountedProducts dp = new DiscountedProducts("mac", 50000, 0.1);


        // Products2 p3 = new Products2("phone", 200);
        
        // DiscountedProducts ddps = (DiscountedProducts) p3;
        // ddps.setDiscountRate(0);
        


        

        //converting from child to parent
        //upcasting
        Products2 ddp = ip;

        //converting from parent to child
        //downcasting
        Products2 p2 = new Products2("mobile", 1000);
        
        DiscountedProducts dp1 = (DiscountedProducts) p2;
        dp1.setDiscountRate(0);
        
    }
    
}
class Products2{
    String name;
    double price;
    public Products2(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getNetPrice() {
        return price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
class ImportedProducts extends Products2{
    double importduty;

    public ImportedProducts(String name, double price, double importduty) {
        super(name, price);
        this.importduty=importduty;
    }

    public double getImportduty() {
        return importduty;
    }

    public void setImportduty(double importduty) {
        this.importduty = importduty;
    }
    
    public double getNetPrice(){
        return price+=price*importduty;

    }

}
class DiscountedProducts extends Products2{
    double DiscountRate;

    public DiscountedProducts(String name, double price , double DiscountRate) {
        super(name, price);
        this.DiscountRate=DiscountRate;
        //TODO Auto-generated constructor stub
    }

    public double getNetPrice(){
        return price+=price*DiscountRate;

    }

    public void setDiscountRate(double discountRate) {
        DiscountRate = discountRate;
    }



}

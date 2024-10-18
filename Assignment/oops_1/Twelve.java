package oops_1;
// 12. Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
// Methods are:  init(prod_id,prod_name, price)
//                  getNetPrice() (returns the price after adding 12% tax)
//                  purchase()
//                 sell()

public class Twelve {
    public static void main(String[] args) {
        Product p = new Product();
        p.init(1, "Laptop", 50000.00);     
        p.getNetPrice();
        p.purchase(50);   
        p.sell(60);
    }
    
}
class Product{
    int prod_id;
    String prod_name;
    double price;
    static double tax=0.12;
    int product_count=0;
    public void init(int prod_id, String prod_name, double price){
        this.prod_id=prod_id;
        this.prod_name=prod_name;
        this.price=price;

    }
    public double getNetPrice(){
        return price=price+price*tax;

    }
    public void purchase(int number){
        product_count+=number;
        System.out.println(number+ " number products purchased");
        

    }
    public void sell(int number){
        if(product_count>=number && number>0){
            product_count-=number;
            System.out.println(number+" of products sold");
        }
        else{
            System.out.println("insufficient number of products to sell");
        }
    }

}

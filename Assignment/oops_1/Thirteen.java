// 13. Introduce multiple constructors in Product class.

package oops_1;

public class Thirteen {
    public static void main(String[] args) {
        Product1 p = new Product1("Laptop");
        Product1 pp = new Product1();
        
    }
    
}
class Product1{
    String name;
    Product1(){
        System.out.println("this is a product class");
    }
    Product1(String name){
        this.name=name;
        System.out.println("this is a parametrezied constructor  and prodcut name is "+name);
    }
}

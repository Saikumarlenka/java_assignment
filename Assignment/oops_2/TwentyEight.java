package oops_2;
// 28. Design classes that need to sort a collection of Product
//  objects either by product name or by price.

import java.util.*;

public class TwentyEight {
    public static void main(String[] args) {
        Prod p = new Prod("p1", 10);
        Prod p1 = new Prod("sai", 20);
        List<Prod> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p);
        Collections.sort(arr,new Sortbyname());
        System.out.println(arr);
        Collections.sort(arr, new Sortbyprice());
        System.out.println(arr);
        
    }
    
}
class Prod{
    String name;
    int price;
    public Prod(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Prod [name=" + name + ", price=" + price + "]";
    }
    
    
}


class Sortbyname implements Comparator<Prod> {
    // Compare two Prod objects based on their name property
    public int compare(Prod p1, Prod p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
class Sortbyprice implements Comparator<Prod> {
    // Compare two Prod objects based on their name property
    public int compare(Prod p1, Prod p2) {
        return Integer.compare(p1.getPrice(), p2.getPrice());
    }
}

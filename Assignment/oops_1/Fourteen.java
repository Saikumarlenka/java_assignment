package oops_1;
// 14. Create a class called Counter that stores a number and provides methods to increment, 
// decrement and return the count. Provide the constructor without parameters that sets the values to 
// zero and another constructor with parameters takes the values and starts from there.

public class Fourteen {
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c1 = new Counter(23);
        c.increment();
        c1.increment();

        
    }
    
}
class Counter{
    int num;
    Counter(int num){
        this.num=num;
    }
    Counter(){

    }
    public void increment(){
        num++;
        System.out.println(num);
    }
    public void decrement(){
        num--;
        System.out.println(num);
    }
}

package oops_2;
// 27. Write a program to create an interface called account operation with methods deposit(),
//  getBalance().Implement this interface in Account class.


public class TwentySeven {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(5000);
        acc.getBalance();
        
    }
    
}

interface AccountOperation{
    void deposit(int number);
    void getBalance();
}
class Account implements AccountOperation{
    int balance=0;
    public  void deposit(int number){
         balance+=number;
    }
    public void getBalance(){
        System.out.println(balance);
    }

}
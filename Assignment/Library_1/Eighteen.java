package Library_1;
// 18. Write a program to guess the random number in three attempts. The range is (1 to 25).
import java.util.*;
public class Eighteen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int attempts =3;
       Random r = new Random();
       int num=r.nextInt(25)+1;
       for(int i=0;i<attempts;i++){
        int guessnum = s.nextInt();
        if(num==guessnum){
            System.out.println("guessed successfuly");
            break;
        }
        else if(guessnum>num){
            System.out.println("number is too big");
        }
        else if(guessnum<num){
            System.out.println("number is too small");
        }
        else{
            System.out.println("attemps are over");
        }
       }

    }
}

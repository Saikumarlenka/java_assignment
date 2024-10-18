package Library_2;
// 32. Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.

import java.util.Scanner;

public class Thtwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=0;
        int sum=0;

        // while(!((str=s.nextLine()).equalsIgnoreCase("o"))){
        //     sum+=Integer.parseInt(str);
            

        // }
        while (!((num=s.nextInt())==0)) {
            sum+=num;
            
        }
        System.out.println(sum);
    }
    
}

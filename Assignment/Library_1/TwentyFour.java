import java.util.Arrays;
import java.util.Objects;
import java.util.Random;


public class TwentyFour {

    private int[] arr;
    private double avg;

    public Program24(int size){
        arr = new int[size];
        fillArr();
        calAvg();
    }

    private void fillArr(){
        Random ran = new Random();
        for(int i=0; i<arr.length;i++){
            arr[i] = ran.nextInt(25) + 1;

        }
    }

    private void calAvg(){
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        this.avg = (double) sum/arr.length; 
    }

    public void Greaterthanavg(){
        for(int n: arr){
            if (n > avg){
                System.out.println(n);
            }
        }

    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Program24 that = (Program24) obj;
        return Arrays.equals(arr, that.arr) && Double.compare(that.avg, avg) == 0;
    }

    @Override
    public int hashCode(){
        return Objects.hash(Arrays.hashCode(arr),avg);
    }

    @Override
    public String toString(){
        return Arrays.toString(arr) + avg;
    }

    public static void main(String[] args) {

        Program24 r1 = new Program24(10);
        Program24 r2 = new Program24(5);

        System.out.println(r1.toString());
        System.out.println(r1.equals(r2));

        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());



    
    }
    
    
}
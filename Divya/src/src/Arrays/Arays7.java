package Arrays;
import java.util.Scanner;
public class Arays7 {
    static int arr[]=new int[5];                //declaring and initialising array variable
  public  static void mthd1(int arrymet[]){
        for(int i=1;i<arrymet.length;i=i+2){           // loop to print the even position of array elements
            System.out.println(arrymet[i]);
        }
    }
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);            // craation of Scanner objects
       for(int i=0;i<arr.length;i++){                //loop to take the inputs from the user
           arr[i]=s.nextInt();
       }
       mthd1(arr);
    }
}
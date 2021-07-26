package Arrays;
import java.util.Scanner;
public class Arrays11 {
  static  int arr[]=new int[5];                         //declaration and initialising array variable
    public static void count(int arr1[]){            // method for counting the number of elements in array
        int count=0;
        for(int i=0;i<arr1.length;i++){
            count++;
        }
        System.out.println("The number of elements in an array are:"+count);
    }
    public static void main(String[] args){
        Scanner scannerObject=new Scanner(System.in);         // scanner object to take inputs from the user
        for(int i=0;i<arr.length;i++){
            arr[i]=scannerObject.nextInt();
        }
        count(arr);                                      //calling created method
    }
}
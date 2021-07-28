package Arrays;
import java.util.Scanner;
public class Arrays9 {
    public static void main(String[] args){
         int arr[]=new int[5];                //declare and initialising the array variable
        int max=arr[0];                          // to compare each element in array by taking 0 index as max
         Scanner scannerObj=new Scanner(System.in);
        // System.out.println("largest element of an array:");
        System.out.println("enter the elements of  an array:");
        for(int i=0;i<arr.length;i++){             // to take inputs from the end user
           arr[i]=scannerObj.nextInt();
        }
        System.out.println( "the largest element of an array is:");
            for(int i=0;i<arr.length;i++){             // to find the largest number
                if (arr[i]>max)                      //condition to find the largest element
                 max=arr[i];
            }
        System.out.println(max);
        }
}
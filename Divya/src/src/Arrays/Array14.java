package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Array14 {
   static int arr1[]=new int[5];               // declaration and initialisation of array variable
    public static void sort(int []arr){
        for(int i=0;i<arr.length;i++) {
            Arrays.sort(arr);                        // sort method to sort the elements in ascending order
           // Arrays.Reverse(arr);
        }
        System.out.println("sorted numerical array in ascending order"+Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        sort(arr1);
    }
}
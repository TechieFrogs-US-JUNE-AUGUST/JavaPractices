package Arrays;
import java.util.Scanner;
public class Arrays28 {
    public static void oddEven(int arr[][]){         // method to print the values of lower triangle
      int even_count=0,odd_count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==0)  {                      // element of coloumn is greater than the row element
                    even_count++;}
                else {
                    odd_count++;}
            }
        }
        System.out.println("frequency of even numbers:"+even_count);
        System.out.println("frequency of odd number:"+odd_count);
    }
    public static void main(String[] args){                 // main method
        int arr1[][]=new int[3][3];                     //initialising the array variables
        Scanner s= new Scanner(System.in);
        for(int i=0;i<arr1.length;i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        oddEven(arr1);                      // callimg created method to print elements of array
    }
}
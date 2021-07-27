package Arrays;
import java.util.Scanner;
public class Arrays27 {
    public static void upperTriangle(int arr[][]){         // method to print the values of lower triangle
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i>j)                                // element of row is greater than the coloumn element
                    System.out.print("0 ");
                else
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){                 // main method
        int arr1[][]=new int[3][3];                     //initialising the array variables
        Scanner s= new Scanner(System.in);
        for(int i=0;i<arr1.length;i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
        upperTriangle(arr1);                      // callimg created method to print elements of array
    }
}
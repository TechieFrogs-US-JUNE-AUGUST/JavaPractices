package Arrays;
import java.util.Scanner;
public class Arrays31 {
    public static void transporse(int arr[][]){
        int rows, cols;
                                     //Calculates number of rows and columns present in given matrix
        rows = arr.length;                       //length of rows
        cols = arr[0].length;                    //length of coloms
                                            //Declare array t with reverse dimensions
        int t[][] = new int[cols][rows];
                                                   //Calculates transpose of given matrix
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                                 //Converts the row of original matrix into column of transposed matrix
                t[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of given matrix: ");
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr1[][]=new int[3][3];
        Scanner s=new Scanner(System.in);              // scanner object to take the inputs from the user
        for(int i=0;i<arr1.length;i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = s.nextInt();
            }
        }
      transporse(arr1);                              // calling created method to print elements of an array
    }
}
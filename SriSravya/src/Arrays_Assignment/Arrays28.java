//TO FIND THE FREQ OF ODD AND EVEN NUMBERS IN THE MATRIX
package Arrays_Assignment;

import java.util.Scanner;

public class Arrays28 {
    public static void main(String[] args) {
        //int array[][]= new int[][]{{1,2,3},{4,5,6}};
        Scanner scannerObj= new Scanner(System.in);            //reading the i/p from user by using scanners
        int rows, columns;
        System.out.println("Enter the size of rows: ");
        rows= scannerObj.nextInt();
        System.out.println("Enter the size of columns: ");
        columns= scannerObj.nextInt();

        int array[][]= new int[rows][columns];                  //initialisation

        System.out.println("Enter the elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                array[i][j]= scannerObj.nextInt();
            }
        }
        
        int countEven=0, countOdd=0;                  //taking 2 counters for even and odd
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(array[i][j]%2 == 0)               //checks the condition
                countEven++;
                else
                countOdd++;
            }
        }
        System.out.println("Frequency of Even Numbers: " +countEven);
        System.out.println("Frequency of Odd Numbers: "  +countOdd);
        scannerObj.close();
    }
}

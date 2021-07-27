//TO DETERMINE IF THE GIVEN MATRIX IS SPARSE
//If the no.of zero elements are more than the non-zero elements in a matrix, then it is called sparse matrix
package Arrays_Assignment;

import java.util.Scanner;

public class Arrays24 {
    public static void main(String[] args) {
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
        //to check if the no.of zero elements are more than the no.of non-zero elements
        int zero= 0, count= 0;                     //taking 2 variables as counters for zero and non-zero elements
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(array[i][j] == 0){                 //checks the condition for every element in the matrix
                    zero++;                           //if the condition is true it increments zero counter value by 1
                }
                else{
                    count++;                         //else it increments the non-zero elemnts counter by 1
                }
            }
        }
    if(zero> count)
        System.out.println("It is a Sparse matrix");
    else
        System.out.println("It is not a Sparse matrix");
        scannerObj.close();
    }
}

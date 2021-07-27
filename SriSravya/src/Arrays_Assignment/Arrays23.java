//TO DETERMINE WHETHER A GIVEN MATRIX IS AN IDENTITY MATRIX
//Identity matrix contains the diagonal elements as 1 and rest of the elements as  0
package Arrays_Assignment;

import java.util.Scanner;

public class Arrays23 {
    public static void main(String[] args) {
       //int array[][]= new int [3][3];
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
        //checks for diagonal elements are 1 and rest of the elements are 0
        int count= 0;                                     //taking a varibale as counter for diagonal elements
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(i==j && array[i][j]!=1){              //checks for diagonal elements
                    count=1;                            //if the condition is true it increments the count value
                    break;
                }
                else if(i!=j && array[i][j]!=0){       //checks for rest of the elements
                    count=1;
                    break;
                }
            }
        }
        if(count == 1)
        System.out.println("It is is not an Identity matrix");
        else
        System.out.println("It is an Identity matrix");
        scannerObj.close();
    }
 }


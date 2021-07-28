package Arrays_Assignment;

import java.util.Scanner;

public class Arrays33 {
    static int[][] createAssignJaggedArray() {

        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter number of Rows of Matrix : ");                     //for reading the i/p from user
        int rows=scannerObj.nextInt();
        int[][] matrix= new int[rows][];
        for(int i=0;i<rows;i++){
            System.out.print("Enter Number of Coumns in " + (i+1) + "Row : ");
            matrix[i] =new int[scannerObj.nextInt()];
        }
        scannerObj.close();
        return matrix;
       
    }
    static void assignMatrix(int[][] matrix) {
        Scanner scannerObj1=new Scanner(System.in);
        int val;
        for(int i=0;i<matrix.length;i++){                          //for iterating through the jagged elements
            for(int j=0;j<matrix[i].length;j++) {
                val=scannerObj1.nextInt();
                matrix[i][j]=val;
            }  
        }
        scannerObj1.close();
    }

    static void Product(int[][] matrix1, int[][] matrix2){
          int a[][]= {{1,2},{3,4}};
          int b[][]= {{5,6},{7,8}};

        int c[][]= new int[2][2];           //c matrix of 2 rows and 2 columns is used for storing the product of 2 martices a and b

        for(int i=0; i<2; i++){           //multiplying and printing multiplication of 2 matrices   
            for(int j=0; j<2; j++){
                c[i][j]= 0;             
           for(int k=0; k<2; k++){             //k loop is for, each row element of 1st matrix is multiplied by all columns in 2nd matrix
             c[i][j]= matrix1[i][k] * matrix2[j][k];       //implements the condition and stores in c matrix
           }
           System.out.print(c[i][j]+" ");         //printing matrix elements
        }
        System.out.println();
    }
}
    public static void main(String[] args) {

         //Create jagged Matrix1
         int[][] matrix1=createAssignJaggedArray();                   //returning an array from method
         System.out.println("Enter First matrix");
         //Assign Values to Jagged Matrix1
         assignMatrix(matrix1);                                     //calling method to iterate through the jagged elements
         //Create jagged Matrix2
         int[][] matrix2=createAssignJaggedArray();
         System.out.println("Enter Second Matrix");
         //Assign Values to Jagged Matrix2
         assignMatrix(matrix2);
         
         System.out.println("Multiplication of Two Matrices");
         Product(matrix1, matrix2);                                //calling method to perform multiplication
    }
}

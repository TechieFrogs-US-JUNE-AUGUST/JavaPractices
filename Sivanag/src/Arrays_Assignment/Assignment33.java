package Arrays_Assignment;

import java.util.Scanner;

public class Assignment33 {
    
    static int[][] createAssignJaggedArray()
    {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter number of Rows of Matrix : ");
        int rows=scannerObj.nextInt();
        int[][] matrix= new int[rows][];
        for(int i=0;i<rows;i++)
        {
            System.out.print("Enter Number of Coumns in " + (i+1) + "Row : ");
            matrix[i] =new int[scannerObj.nextInt()];
        }
        //scannerObj.close();
        return matrix;
       
    }
    static void assignMatrix(int[][] matrix)
    {
        Scanner scannerObj1=new Scanner(System.in);
        int val;
        for(int i=0;i<matrix.length;i++)
        {

            for(int j=0;j<matrix[i].length;j++) {
                val=scannerObj1.nextInt();
                matrix[i][j]=val;
            }
            
        }
        //scannerObj1.close();
    }
    public static void main(String[] args) {
        System.out.println("First Matrix");
        //Create jagged Matrix1
        int[][] matrix1=createAssignJaggedArray();
        System.out.println("Enter First matrix");
        //Assign Values to Jagged Matrix1
        assignMatrix(matrix1);
        System.out.println("SEcond Matrix");
        //Create jagged Matrix1
        int[][] matrix2=createAssignJaggedArray();
        System.out.println("Enter Second Matrix");
        //Assign Values to Jagged Matrix1
        assignMatrix(matrix2);
        System.err.println("First Matrix");
          System.out.println("SEcond Matrix");
        Assignment23.displayMatrix(matrix2);
        System.out.println("Multiplication of Two Matrices");
        Assignment29.productMatrix(matrix1, matrix2);
        
    }
}

package Arrays;

import java.util.Scanner;

public class ArraysAssignment31 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter rows of array");
         int row=scannerObject.nextInt();
        System.out.println("enter coloumn of array");
         int col=scannerObject.nextInt();
        int matrix[][]=new int[row][col];
        System.out.println("enter elements of matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            matrix[i][j]=scannerObject.nextInt();
            }
        }
        System.out.println("input matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int temp[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            temp[i][j]=matrix[j][i];  // interchanging rows and coloumns
            }
        }
        System.out.println("transpose matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(temp[i][j]+" ");
            }
            System.out.println();
    }
}
}
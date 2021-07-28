package Arrays;

import java.util.Scanner;

public class ArraysAssignment30 {
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
        for(int i=0;i<row;i++){
            int sumOfRow=0;
            for(int j=0;j<col;j++){
                sumOfRow=sumOfRow+matrix[i][j];   // summing the row
            }
            System.out.println("sum of "+(i+1)+" row is: "+sumOfRow);
        }
        for(int i=0;i<col;i++){
            int sumOfcol=0;
            for(int j=0;j<row;j++){
                sumOfcol=sumOfcol+matrix[j][i];  // summing the coloumn
            }
            System.out.println("sum of "+(i+1)+" coloumn is: "+sumOfcol);
        }
    }
}

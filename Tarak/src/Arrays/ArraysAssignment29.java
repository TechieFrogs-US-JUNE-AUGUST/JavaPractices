package Arrays;

import java.util.Scanner;

public class ArraysAssignment29 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter rows of matrix-1");
        int row1=scannerObject.nextInt();
        System.out.println("enter coloumn of matrix-1");
         int col1=scannerObject.nextInt();
        int matrix1[][] = new int[row1][col1];
        System.out.println("enter elements of matrix-1");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
            matrix1[i][j]=scannerObject.nextInt();
            }
        }
        System.out.println("enter rows of matrix-1");
        int row2=scannerObject.nextInt();
        System.out.println("enter coloumn of matrix-1");
         int col2=scannerObject.nextInt();
        int matrix2[][] = new int[row2][col2];
        System.out.println("enter elements of matrix-1");
        
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
            matrix2[i][j]=scannerObject.nextInt();
            }
        }
        System.out.println("input matrix-1 is");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
            System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("input matrix-2 is");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
            System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        int product[][]=new int[row1][col2];
        if(row2!=col1){
            System.out.println("matrices cannot me multiplied");
        }
        else{
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    for(int k=0;k<row2;k++){
                        product[i][j]=product[i][j]+matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        }
        System.out.println("product of two matrices");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
            System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }
    }
}

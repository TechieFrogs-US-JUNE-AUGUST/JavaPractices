package Arrays;

import java.util.Scanner;

public class ArraysAssignment36 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter rows of array");
         int row=scannerObject.nextInt();
        System.out.println("enter coloumn of array");
        int col=scannerObject.nextInt();
        int matrix1[][] = new int[row][col];
        System.out.println("enter elements of matrix-1");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            matrix1[i][j]=scannerObject.nextInt();
            }
        }
        int matrix2[][]=new int[row][col];
        System.out.println("enter elements of matrix-2");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            matrix2[i][j]=scannerObject.nextInt();
            }
        }
        System.out.println("input matrix-1 is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("input matrix-2 is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }
        int add[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            add[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("sum of two multi dimensional arrays");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
        scannerObject.close();
    }
}

package Arrays;

import java.util.Scanner;

public class ArraysAssignment24 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter rows of array");
         int row=scannerObject.nextInt();
        System.out.println("enter coloumn of array");
         int col=scannerObject.nextInt();
        int matrix[][]=new int[row][col];
        System.out.println("enter elements of matrix-1");
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
        int size=row*col;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    count++;
                }
            }
        }
        if(count>size/2){
            System.out.println("it is a sparse matrix");
        }
        else
        System.out.println("it is not a sparse matrix");

    }
}

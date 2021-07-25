package Arrays;

import java.util.Scanner;

public class ArraysAssignment34 {
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
        double average=1;
        int sum=0;
        int size=row*col;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            sum=sum+matrix[i][j];
            average=sum/size;
            }  
        }
        System.out.println("average of matrix is: "+average);
        }
    }


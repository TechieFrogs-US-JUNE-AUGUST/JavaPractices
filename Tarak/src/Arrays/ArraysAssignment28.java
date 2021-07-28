package Arrays;

import java.util.Scanner;

public class ArraysAssignment28 {
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
        int count1=0;
        int count2=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            if(matrix[i][j]%2==0){
                count1++;
            }
            else if(matrix[i][j]%2!=0){
                count2++;
            }
            }
        }
        System.out.println("frequency of even numbers: "+count1);
        System.out.println("frequency of odd numbers: "+count2);
    }
}

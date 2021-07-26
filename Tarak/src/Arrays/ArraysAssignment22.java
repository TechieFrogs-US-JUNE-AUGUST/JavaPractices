package Arrays;

import java.util.Scanner;


class Input{
public int row;
public int col;
public  int matrix1[][];
public  int matrix2[][];

public  void input(){
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter rows of array");
         row=scannerObject.nextInt();
        System.out.println("enter coloumn of array");
         col=scannerObject.nextInt();
         matrix1 = new int[row][col];
        System.out.println("enter elements of matrix-1");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            matrix1[i][j]=scannerObject.nextInt();
            }
        }
        matrix2=new int[row][col];
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
        scannerObject.close();

}
}
public class ArraysAssignment22 {
    public static void main(String[] args) {
        Input inputObject=new Input();
        inputObject.input();
        int difference[][]=new int[inputObject.row][inputObject.col];
        for(int i=0;i<inputObject.row;i++)
        {
            for(int j=0;j<inputObject.col;j++)
            {
                difference[i][j]=inputObject.matrix1[i][j]-inputObject.matrix2[i][j];
            }
        }
        System.out.println("Substraction of Two Matrices:");
        for(int i=0;i<inputObject.row;i++)
        {
            for(int j=0;j<inputObject.col;j++)
            {
                System.out.print(difference[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

package arrays;

import java.util.Scanner;

public class Arrays23 {
    public static void main(String[] args) {
        int array[][]=new int[5][5];
        boolean flag=true;
        System.out.println("Number of Rows :");
        Scanner scannerObj=new Scanner(System.in);
        int rows=scannerObj.nextInt();
        System.out.println("Number of Columns :");
        int columns=scannerObj.nextInt(); 
        if(rows!=columns)//for identity matrix rows and columns shouls be equal
        {
            System.out.println("Matrix is not an Identity Matrix :");
        }
        else
        {
            System.out.println("Enter elements of the Matrix :");
            for(int i=0;i<rows;i++)
            {
                for (int j=0;j<columns;j++)
                {
                    array[i][j]=scannerObj.nextInt();//getting input from the user
                }
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if((i==j)&&array[i][j]!=1)//for identity matrix the diagonal values must be 1
                {
                    flag=false;
                    break;
                }
                if((i!=j) && array[i][j]!=0)//except the diagonal matrix every element should be zero
                {   
                    flag=false;
                    break;

                }
            }
        }
        if(flag)
        {
            System.out.println("Matrix is an Identity Matrix");
        }
        else
        {
            System.out.println("Matrix is not an Identity Matrix :");
        }
        scannerObj.close();
    }
    
}

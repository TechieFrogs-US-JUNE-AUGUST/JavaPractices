package Assignment;

import java.util.Scanner;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Number of rows ");
        int m=scannerObj.nextInt();
        System.out.println("Number of columns");
        int n=scannerObj.nextInt();
        System.out.println("Enter Matrix");
        int array[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j]=scannerObj.nextInt();
            }
        }
        scannerObj.close();
        System.out.println("Original Matrix ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

        for(int i=0;i<m;i++)//for rows
        {
            for(int j=0;j<n;j++) //for columns
            {
                for(int k=j;k<n;k++) //columns
                {
                    if(array[i][j]>array[i][k])
                    {
                        int temp=array[i][j];
                        array[i][j]=array[i][k];
                        array[i][k]=temp; // sorting into ascending order
                    }
                }
            }
        }
        System.out.println("Sorted Matrix is ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
    
}

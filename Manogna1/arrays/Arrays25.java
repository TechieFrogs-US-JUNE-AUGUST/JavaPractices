package arrays;

import java.util.Scanner;

public class Arrays25 {
    public static void main(String[] args) {
        int array1[][]=new int[5][5];
        int array2[][]=new int[5][5];
        boolean flag=true;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Number of Rows in first Array:");
        int rows1=scannerObj.nextInt();
        System.out.println("Number of Columns in first Array:");
        int columns1=scannerObj.nextInt(); 
        System.out.println("Number of Rows in Second Array:");
        int rows2=scannerObj.nextInt();
        System.out.println("Number of Columns in Second Array:");
        int columns2=scannerObj.nextInt(); 
        System.out.println("Enter elements of First Matrix :");
            for(int i=0;i<rows1;i++)
            {
                for (int j=0;j<columns1;j++)
                {
                    array1[i][j]=scannerObj.nextInt();//getting input from the user
                }
            }
            System.out.println("Enter elements of Second Matrix :");
            for(int i=0;i<rows2;i++)
            {
                for (int j=0;j<columns2;j++)
                {
                    array2[i][j]=scannerObj.nextInt();//getting input from the user
                }
            } 
            if(rows1!=rows2 || columns1!=columns2)  
                {
                    System.out.println("Both Matrices are not equal");
                }  
            else
            for(int i=0;i<rows1;i++)
            {
                for (int j=0;j<columns1;j++)
                {
                    if(array1[i][j]!=array2[i][j])
                    {
                        flag=false;
                        break;
                    }
                }
            } 
            if(flag)
            {
                System.out.println("Both Matrices are equal");
            }
            else
            {
                System.out.println("Both Matrices are not equal");
            }
            scannerObj.close();   
    }

    
}

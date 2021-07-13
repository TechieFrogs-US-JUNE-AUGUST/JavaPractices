//package Patterns;

import java.util.Scanner;

public class Assignment3
 {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // System.out.print("Enter Number of Rows : ");
        // int num =sc.nextInt();
        // System.out.println("Enter Number of Columns : ");
        // int m = sc.nextInt();
        int num =4;
        int m=9;
        int mm =m;
        int k=1;
        int l=(m/2)+1;
        //int m =9;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if((j==k) || (j==l) || (j==mm))
                {
                    System.out.print("*");


                }else
                System.out.print("0");
            }
            k++;
            mm--;
            System.out.println("");
        }
        //sc.close();
    }  
    
}

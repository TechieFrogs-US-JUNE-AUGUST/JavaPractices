package Patterns;

import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);                //reading i/p from user
        System.out.println("Enter the number of rows ");
        int rows= scannerObj.nextInt();
         
        int letter= 65;
        int k=1;
        for(int i=1; i<=rows; i++){                        //for rows
            k=i;
            for(int j=1; j<=i; j++){                       //for columns
                System.out.print((char)(letter+k-1)+" ");
                k= k+rows-j;                               //logic for printing the last half of letters in the respective row
            } 
            System.out.println();
        }
        scannerObj.close();
    }
}

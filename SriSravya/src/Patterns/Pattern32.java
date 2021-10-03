package Patterns;

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);                //reading i/p from user
        System.out.println("Enter the number of rows ");
        int rows= scannerObj.nextInt();
         
        int letter= 65;
        int temp= (rows*(rows-1))/2;            //temp is to keep the count of the printing letters
        for(int i=1; i<rows; i++){              //for rows
            temp= temp-i;
            for(int j=1; j<=i; j++){            //for columns
                System.out.print((char)(letter+temp+j-1)+" ");
            }
            System.out.println();
        }
        scannerObj.close();  
    }
}

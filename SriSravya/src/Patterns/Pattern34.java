package Patterns;

import java.util.Scanner;

public class Pattern34 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);                //reading i/p from user
        System.out.println("Enter the number of rows ");
        int rows= scannerObj.nextInt();
         
        int letter= 65;
        int temp= 1;
        for(int i=1; i<=rows/2 +1; i++){                           //for first half rows
        for(int j=1; j<=i; j++){                                  //for first half columns
            System.out.print((char)(letter+(temp*j)-1)+" ");     //prints the letters with difference between each letter as the row number(eg: 2nd row has 2 letters B D) in the respective row
        }
        System.out.println();
        temp++;
        }
        for(int i=1; i<=rows/2; i++){                         //for second half columns
            for(int j=1; j<=rows/2+1-i; j++){                 //for second half columns
                System.out.print((char)(letter+(temp*j)-1)+" ");   //prints the letters with difference between each letter as the row number in the respective row
            }
            System.out.println();
            temp++;
        }
        scannerObj.close();
    }
}

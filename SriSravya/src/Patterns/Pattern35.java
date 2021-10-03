package Patterns;

import java.util.Scanner;

public class Pattern35 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);                //reading i/p from user
        System.out.println("Enter the number of rows ");
        int rows= scannerObj.nextInt();
          
        int letter= 65;
        for(int i=0; i<rows; i++){               //for rows 
            for(int j=0; j<=i; j++){             //for columns
                if(j%2 == 0)                      //if the logic is true       
                System.out.print((char)(letter+j*rows-(j-1)*j/2+i-j)+" ");        //prints this line
                else
                System.out.print((char)(letter+j*rows-(j-1)*j/2+ rows-1-i)+" ");   //else it orints this line
            }
            System.out.println();
        }
        scannerObj.close();
    }
}

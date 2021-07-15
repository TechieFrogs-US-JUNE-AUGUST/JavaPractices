package Patterns;

import java.util.Scanner;

public class Patterns3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no of lines to be printed");
        int n=sc.nextInt();
        int j;
        for(int i=1;i<=n;i++){
            for( j=1;j<=n;j++){
                if(i==j)
                System.out.print("*"); 
                else
                System.out.print("0");
            }
            j--;
            System.out.print("*");
            while(j>=1){
                if(i==j)
                System.out.print("*");
                else System.out.print("0");
                j--;
            }
        System.out.println("");
        }
    }
}

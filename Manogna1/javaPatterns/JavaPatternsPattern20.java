package javaPatterns;

import java.util.Scanner;

public class JavaPatternsPattern20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("how many rows you want to Print");
        int rows=sc.nextInt();
        int alphabet=65;
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=rows-1;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print((char)(alphabet+k));
            }
            for(int l=i-1;l>=0;l--)
            {
                System.out.print((char)(alphabet+l));
            }

            System.out.println();
        }
        sc.close();
    }
    
}


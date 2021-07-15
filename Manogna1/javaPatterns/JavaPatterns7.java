package javaPatterns;

import java.util.Scanner;

public class JavaPatterns7 {
    public static void main(String[] args) {
        int j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Number of lines : " );
        int l=sc.nextInt();
        for(int i=0;i<l;i++)
        {
            
            for( j=1;j<=l;j++)
            
            {
                if(j<=(l-i))
                System.out.print(j);
                else
                System.out.print("*");
            }
            j--;
            while(j>0)
            {
                if(j>l-i)
                System.out.print("*");
                else
                System.out.print(j);
                j--;

            }
           
            System.out.println(" ");
        }
        sc.close();

    }

    
}

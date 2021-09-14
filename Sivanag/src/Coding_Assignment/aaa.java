package src.Coding_Assignment;

import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1=scannerObj.nextInt();
        System.out.println("Enter Second Number");
        int num2=scannerObj.nextInt();
        System.out.println("The perfect numbers within the given range is :");
        int n,i,sum;
        for( i=num1;i<num2;i++)
        {
            n=1;
          sum=0;
           while(n<i)
           {
               if(i%n==0)
               {
                   sum=sum+n;
                   //n++;
               }
               n++;
           }
           //System.out.println("outside while loop");
            if(sum==i)
            {
                System.out.println(i); //i is equal to the sum of divisors of i
            }
        }
        //System.out.println("sum " +sum);
        //System.out.println("i value " +i);
       
        scannerObj.close();

    }
    
}
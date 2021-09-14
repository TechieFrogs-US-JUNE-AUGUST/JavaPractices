package Assignment;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1=scannerObj.nextInt();
        System.out.println("Enter Second Number");
        int num2=scannerObj.nextInt();
        System.out.println("The perfect numbers within the given range is :");
        scannerObj.close();
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
           
            if(sum==i)
            {
                System.out.println(i); //i is equal to the sum of divisors of i
            }
        }
       
       

    }
    
}

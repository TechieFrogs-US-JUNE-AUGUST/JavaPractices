package Assignment;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=scannerObj.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of Factors" +sum);
        scannerObj.close();
    }
}

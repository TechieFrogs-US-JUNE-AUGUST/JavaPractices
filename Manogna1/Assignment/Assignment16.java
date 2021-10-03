package Assignment;

import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
       int sumeven=0;
        int sumodd=0;
        int sum=0;
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Enter a num");
        int num=scannerObj.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                sumeven=sumeven+i;
            }
            else
            {
                sumodd=sumodd+i;
            }
        }
        System.out.println("sum of Even Numbers : " +sumeven);
        System.out.println("Sum of Odd Numbers :" +sumodd);
        sum=sumeven+sumodd;
        System.out.println("sum of even and odd Numbers :" +sum);
        scannerObj.close();

    }
    
}

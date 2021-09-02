package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment14 {
    static void digiRoot(int num)
    {
        int temp,sum=0;
        while(num>0)
        {
            temp=num%10;
            sum+=temp;
            num/=10;
        }
        if(sum>9)
        digiRoot(sum);
        else
        System.out.println("Digi Root of given Number  is: " +sum);
    }
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num =scannerObj.nextInt();
        digiRoot(num);
        scannerObj.close();
    }
    
}

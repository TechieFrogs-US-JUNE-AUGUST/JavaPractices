package tcscodingquestions;

import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n= scannerObj.nextInt();
        int even=1;
        int odd=1;
        if(n%2==0) //for even numbers
        {
            for(int i=1;i<=(n-2);i=i+2)
            {
                even=even*2;
                odd=odd*3;
            }
            System.out.println(n+" element of the series is = "+odd);
        }
        else // for odd numbers
        {
            for(int i=1;i<=(n-2);i=i+2)
            {
                even=even*2;
                odd=odd*3;
            }
            System.out.println(n+" element of the series is = "+even);
        }
        scannerObj.close();
    }
    
}

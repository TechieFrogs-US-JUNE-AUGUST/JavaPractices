package tcscodingquestions;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int n=10,k=5;
        int num;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("INPUT VALUE :");
        num=scannerObj.nextInt();
        System.out.println("OUTPUT VALUE");
        if(num>=1&&num<=k)
        {
            System.out.println("Number of Candies Sold :" +num); // prints num of candies sold
            System.out.println("Number of Candies Available : " +(n-num)); // prints num of candies available
        }
        else
        {
            System.out.println("INVALID INPUT");
            System.out.println("Number of Candies Available : " +n);
        }
        scannerObj.close();

    }
    
}

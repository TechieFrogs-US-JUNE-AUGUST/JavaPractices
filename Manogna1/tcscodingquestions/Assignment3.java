package tcscodingquestions;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Input Value :");
        int machineWeight=scannerObj.nextInt();// takes input value from user
        if(machineWeight==0)
        {
            System.out.println("Time Estimated : 0 Minutes");// if weight is equal to 0
        }
        else if(machineWeight>0 &&machineWeight<=2000)
        {
            System.out.println("Time Estimated : 25 Minutes"); // if weight is in between 0 to 2000
        }
        else if(machineWeight>2000 && machineWeight<=4000)
        {
            System.out.println("Time Estimated : 35 Minutes");// if weight is in between 2000 to 4000
        }
        else if(machineWeight>4000 && machineWeight<=7000)
        {
            System.out.println("Time Estimated : 45 Minutes"); // if weight is in between 4000 to 7000
        }
        else if(machineWeight > 7000)
        {
            System.out.println("OVERLOADED"); // if it exceeds 7000
        }
        else
        {
            System.out.println("Invalid Input"); // for all other inputs 
        }
        scannerObj.close();
   }
    
}

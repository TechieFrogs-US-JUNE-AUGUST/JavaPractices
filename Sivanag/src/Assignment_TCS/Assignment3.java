

import java.util.Scanner;
public class Assignment3 {
    static int numericInput()
    {
        Scanner scannerObject = new Scanner(System.in);
        int num;
        while(!scannerObject.hasNextInt())
        {
            System.out.println("Enter Integer:");
            scannerObject.next();
        }
        num=scannerObject.nextInt();
        scannerObject.close();
        return num;
    }
    public static void main(String[] args) {
        System.out.print("Enter Weight of the Clothes : ");
        int weight=numericInput();
        if(weight<0)
            System.out.println("Invalid Input");
            else if(weight<=7000)
            {
                if(weight<=2000)
                {
                    System.out.println("Time Estimated : 25 Minutes");
                }
                else if(weight <=4000)
                    System.out.println("Time Estimated : 35 Minutes");
                    else
                    System.out.println("Time Estimated : 40 Minutes");
            }
            
            else 
            System.out.println("Overloaded");
    }
    
}

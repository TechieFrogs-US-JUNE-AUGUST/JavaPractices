package src.Coding_Assignment;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scannerObject=new Scanner(System.in);
        System.out.print("Enter x value: ");
        int x=scannerObject.nextInt();
        System.out.print("Enter position from the series : ");
        int pos=scannerObject.nextInt();
        System.out.println(pos +" th number in the series is: " +(1+x));

        scannerObject.close();
    }
    
}

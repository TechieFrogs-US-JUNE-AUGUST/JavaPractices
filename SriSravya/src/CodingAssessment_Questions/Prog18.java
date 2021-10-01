// Write a program to find the factorial of a number.

package CodingAssessment_Questions;
import java.util.Scanner;

public class Prog18 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Enter a number: ");             //reading the i/p from user
        int n= scannerObj.nextInt();

        int factorial= 1;                             //declaring a counter variable to count the factorial of the num
        for (int i=1; i<=n; i++) {                 //traversing through the loop until i value is <= n value
            factorial= factorial * i;
            {
                System.out.println("factorial is: "+factorial);       //printing the factorial 
            }
        }
        scannerObj.close();
    }
}

// Finding the Sum of odds and evens in a number.

package CodingAssessment_Questions;
import java.util.Scanner;

public class Prog16 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        int sumE= 0, sumO= 0;
        System.out.println("Enter the number of elements in an array: ");
        int n= scannerObj.nextInt();                        
        int a[]= new int[n];                            //initialising an array 'a' with size 'n'(no. of elements)
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){                        //for reading the elements of an array
            a[i]= scannerObj.nextInt();
        }

        for(int i=0; i<n; i++){
            if(a[i]%2== 0){                            //checking if the number is divisible by 2
                sumE= sumE + a[i];                     //if its divisible then it is added to  sumE
            }
            else{                                     //if its not divisible then it is added to sumO 
                sumO= sumO + a[i];
            }
        }
        System.out.println("Sum of Even numbers is:" +sumE);
        System.out.println("Sum of Odd numbers is: "+sumO);
        scannerObj.close();

    }
}

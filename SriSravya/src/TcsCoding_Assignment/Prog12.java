package TcsCoding_Assignment;

import java.util.Scanner;

public class Prog12 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= scannerObj.nextInt();          //reading the i/p value from user
        scannerObj.close();

        if(n<0){
            System.out.println("Please enter the positive number");
        }
        else{
            prime(n);                                //calling method prime by passing i/p value n as parameter
        }
    }
    public static void prime(int n){              //prime method to check whether given num is prime or not
            int count= 0;                  //taking a variable count to count if the num is divisible only 2 times
            for(int i=2; i<n; i++){
                if(n%i == 0){               //checking the condition
                    count++;
                    break;
                }
            }
     if(count == 0){
         System.out.println("The number is Prime");
     }
     else{
         System.out.println("The number is Not Prime");
     }
   } 
}

// 1,2,3,4,5,6,8,9,10,12,14,15……n. The digits are factors of 2, 3 and 5.
package TcsCoding_Assignment;
import java.util.Scanner;

public class Prog18 {
    static int maxDivide(int a, int b){               //this method divides 'a' by greatest divisible power of 'b'
        while(a%b == 0)
            a = a/b;
            return a;
        }
        static int isNthNo(int number){           //this method is to check if the number is Nth Number or not i.e, checks if the number is factors of 2,3,5
            number= maxDivide(number, 2);         //control goes to maxDivide method
            number= maxDivide(number, 3);
            number= maxDivide(number, 5);

            return (number == 1) ? 1 : 0;         //using ternary operator
        }
       public static int getNthNo(int input){           //Method to get the Nth number
            int i=1, count= 1;
            while(input>count){                    //checks for all the integers until count becoms n
                i++;
                if(isNthNo(i) == 1)               //checks the condition and control goes to isNthNo method
                count++;
            }
            return i;
        }
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Enter the input: ");
        int input= scannerObj.nextInt();                       //reading the i/p value from the user
        int number= getNthNo(input);                           //calling method by passing i/p value as parameter and stroig it in variable 'number'
        System.out.println("Nth term in the series is: " +number);
         scannerObj.close();
    }
}

package TcsCoding_Assignment;
import java.util.Scanner;

public class Prog1 {
   public static void main(String[] args) {
       int n=10, k=5;
       int num;
       Scanner scannerObj= new Scanner(System.in);
       System.out.println("Enter Input value: ");
       num= scannerObj.nextInt();                       //reading the i/p from user
       if(num>=1 && num<=k){                            //num is i/p and it should be >1 and less than k value which is minimum
           System.out.println("NUMBER OF CANDIES SOLD: " +num);
           System.out.println("NUMBER OF CANDIES AVAILABLE: " +(n-num));
       }
       else{
           System.out.println("INVALID INPUT");
           System.out.println("NUMBER OF CANDIES LEFT: " +n);
       }
       scannerObj.close();  
   } 
}

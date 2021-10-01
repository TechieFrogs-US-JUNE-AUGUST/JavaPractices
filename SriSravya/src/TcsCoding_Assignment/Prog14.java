package TcsCoding_Assignment;
import java.util.Scanner;

// 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …
// For example , if N=16, the 16th term in the series is 2187, so only value 2187 should be printed

public class Prog14{
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n= scannerObj.nextInt();
        int a=1, b=1;
        if(n%2==0){                 //for even numbers
            for(int i=1; i<=(n-2); i=i+2){
                a= a*2;
                b= b*3;
            }
            System.out.println(b);          //prints the nth num in the series which is odd number
        }
        else{                        //for odd numbers
            for(int i=1; i<=(n-2); i=i+2){
                a= a*2;
                b= b*3;
            }
            System.out.println(a);         //prints the nth num in the series which is even number
        }
        scannerObj.close();
    }  
}

/* public class Prog14 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        int n= scannerObj.nextInt();

        //if the condition is true, it calculates the first set which is of Odd terms  and  if the condition is false then it caluclates right side set which is for even terms
        System.out.println(n%2==0 ? (int)Math.pow(3,(n-1)/2) : (int)Math.pow(2,(n-1)/2));   

        scannerObj.close();
    }
}         */
 
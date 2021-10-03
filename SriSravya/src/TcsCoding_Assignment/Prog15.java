package TcsCoding_Assignment;
import java.util.Scanner;

// 0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
//For example if n=10,the 10 th term in the series is to be derived from the 9th term in the series. The 9th term is 8 so the 10th term is (8/2)=4.

public class Prog15 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        int n= scannerObj.nextInt();
        int a=0, b=0;
        if(n%2 == 0){                     //for even series
            for(int i=1; i<=(n-2); i=i+2){
                a= a+2;
                b= a/2;
            }
            System.out.println(b);               //prints the nth number in the series which is odd number
        }
        else{                            //for odd series
            for(int i=1; i<(n-2); i=i+2){
                a= a+2;
                b= a/2;
            }
            System.out.println(a);              //prints the nth number in the series which is even number    
        }
        scannerObj.close();
    }
}


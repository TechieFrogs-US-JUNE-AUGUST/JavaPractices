import java.util.Scanner;
public class NumberIsEvenOrOdd {
    public static void main(String[] args){
        int n;
     System.out.println("enter n value");
Scanner s=new Scanner(System.in);
       n=s.nextInt();
        if (n % 2 == 0) {
     System.out.println("enter number is even");
        }
        else{
     System.out.println("enter number is odd") ;
 }
 s.close();
    }
}   
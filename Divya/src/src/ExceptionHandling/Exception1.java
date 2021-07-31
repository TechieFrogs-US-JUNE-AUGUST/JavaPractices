package ExceptionHandling;
import java.util.Scanner;
public class Exception1 {
    public static void main(String[] args){
        System.out.println("enter two numbers");
        sum();                              //calling created method
    }
    public static void sum(){
        int a,b;                             // declaration of two variables
        Scanner s=new Scanner(System.in);
        try{
            a=s.nextInt();                    // taking inputs from the user
            b=s.nextInt();
            System.out.println("sum:"+(a+b));
        }catch(Exception ae){                     // super exception it will handle all tyeps of exceptions
          System.out.println("enter the number in correct format:");
          sum();
        }
        finally{
            s.close();
        }
    }
}

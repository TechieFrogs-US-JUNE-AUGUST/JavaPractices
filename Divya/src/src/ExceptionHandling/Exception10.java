package ExceptionHandling;
import java.util.Scanner;
public class Exception10  {
    public static void arithException(int num1,int num2 ){
        try{                                      //created method for showing arithmetic exception
          int  result=num1/num2;
          System.out.println(num1/num2);
        }catch(ArithmeticException ae){
            System.out.println("cannot be divided by zero");
        }
    }
    public static void arrayException(int arr[]){
        try{
            arr[4]=3/0;                               //created method for showing another way of arithmetic exception
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
    }
    public static void main(String[] args){
        int n1,n2,result;
        int a[]=new int[5];
        System.out.println("enter the two input values");
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        n2=s.nextInt();
        arithException(n1,n2);                             //called method1
        arrayException(a);                                  //called method2
    }
}
package ExceptionHandling;
import java.util.Scanner;
public class Exception15 {
    public static void main(String args[]){
        int i,n;
        int a[];                            //declaration of ann array variable
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        n = s.nextInt();                    // scanner objects for taking the inputs from the user
        try {
            a = new int[n];
        }catch(NegativeArraySizeException err){
            n=n*(-1);
            a=new int[n];
            //System.out.println("we cannot give negative size for arrays");
        }
        System.out.println("enter"+n+"elements one by one");
        for( i=0;i<n;i++){               // taking inputs from the user
            a[i]=s.nextInt();
        }
        for( i=0;i<n;i++){
            System.out.print(a[i]+",");       // this loop is used to print the values of an array
        }
    }
}
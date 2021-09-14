package ExceptionHandling;
import java.util.Scanner;
public class Exception8{
    public static void main(String[] args){
        int n1,n2,result;                   // declaring and initialisation of variables
        int a[]=new int[5];                                //declare and initialise the array variable
        Scanner scannerObject=new Scanner(System.in);
        System.out.println("enter the n1 and n2 values:");
        n1=scannerObject.nextInt() ;                       //taking the inputs from the user by using scanner
        n2=scannerObject.nextInt();
        meth1(n1,n2);
        meth1(a);
    }
    static void meth1(int n1,int n2){
        try{                                               //method for arithmethic exception
            int n3=n1/n2;
            System.out.println("result:"+n3);
        }catch(ArithmeticException ae){
            System.out.println("cannot be divided by zero");
        }
    }
    static void meth1(int[] arr1){
        try{                                            //method overloaded to show the ArrayOutOfBoundIndex
            arr1[6]=8;
            System.out.println(arr1[6]);
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("array out of bound");
        }
    }
}
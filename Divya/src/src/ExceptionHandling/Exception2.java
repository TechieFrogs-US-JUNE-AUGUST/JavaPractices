package ExceptionHandling;
import java.util.Scanner;
public class Exception2 {
    public static void main(String[] args){
        int a,b,c;
        int a1[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two input values:");
        try{
            a=s.nextInt();                   // taking inputs from the user
            b=s.nextInt();
            c=a/b;
            System.out.println(c);
        }catch(ArithmeticException ae){          // this type of exception occured when any number is divided by 0
            System.out.println("cannot divided by zero");
        }
        try{
            a1[6]=10;
            System.out.println(a1[6]);             // when the length of the array exceeds the given length
        }catch(ArrayIndexOutOfBoundsException aie){         // we will get arrayindexoutofbounds Exception
            System.out.println("array out of bound");
        }
        try{
            String s1="divya";
            int num=Integer.parseInt(s1) ;
            System.out.println(num);
        }catch(NumberFormatException e){            //this exception occurred when an attempt is made to convert
            System.out.println("Number format exception occurred");  //a string with improper format in to string
        }
        try{
            String str="divya";
            System.out.println(str.length());
            char ch=str.charAt(0);              // this exception occurred if we want the char which exceeds the
            ch = str.charAt(40);                         // given String length
            System.out.println(ch);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }

        try{
            String str=null;
            System.out.println (str.length());
        }
        catch(NullPointerException e){               // this exception occured if we want the string length
            System.out.println("NullPointerException");            // when no value is assigned
        }
        finally{
            s.close();
        }
    }
}
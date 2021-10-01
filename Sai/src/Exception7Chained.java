import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception7Chained {
    public static void main(String[] args){
      Scanner scannerObj = new Scanner(System.in);
      System.out.println("Enter the values");
      int a,b;
      try {
          a = scannerObj.nextInt();
          b = scannerObj.nextInt();
          if(a>b){
              ArithmeticException ae = new ArithmeticException("a value is greater");
              System.out.println("From try block");
              scannerObj.close();  // if am not closing the scanner here, its sh0wing an error
              throw ae;
          }
      } catch (InputMismatchException ie) {
          System.out.println("from catch block");
          //a = 10;
          //b = 5;
          try{ 
              System.out.println("give values");
              
              //a = scannerObj.nextInt();
              //b = scannerObj.nextInt();
              a = 10;
              b = 5;
              int i = a/b;
              System.out.println("from nested try block");
              System.out.println(i);
          } catch(ArithmeticException ae){ // if b = 0 it will process
              System.out.println("from nested catch block");
          }finally{
              System.out.println("from finally block");
              scannerObj.close();
          }
    }

    }
}

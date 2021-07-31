
import java.util.InputMismatchException;
import java.util.Scanner;

//SOLUTION BY EXCEPTION HANDLING

/*  public class ExceptionHandling {
   public static void main(String[] args) {
       //int a=5/0;
       try{
        //write the code that may cause exception
         int a= 5/0;
       }
       catch(ArithmeticException ae){
        //handling the exception
        ae.printStackTrace();
       }

       int array[]= new int[5];
       System.out.println("My array value is: " +array[4]);
   } 
}                */



//RESOLVING EXCEPTION IN CATCH BLOCK

/* public class ExceptionHandling{
    public static void main(String[] args) {
        int array[]= new int[5];
        try {
            array[6]= 6;                                     //we have got ArrayIndexOutOfBoundsException here
        } catch (Exception e) {
            e.printStackTrace();
            array[4]= 6;                                                //exception is handled here
        }
       // array[4]= 4;
        System.out.println("My array value is: " +array[4]);
    }
}            */



//USING FINALLY

/* public class ExceptionHandling{
    public static void main(String[] args) {
        try {
            int i= 10/0;                                   //exception is caused
            System.out.println(i);
        } catch (ArithmeticException ae) {                //exception is handled
           System.out.println(ae);
        }
        finally{
            System.out.println("Finally block is always executed");            //the finally block is always executed
        }
        System.out.println("Rest of the code");
    }
}                 */

/* public class ExceptionHandling{
public static void main(String[] args) {
    int a,b;
   // a=5;
   // b=0;
    Scanner sc= new Scanner(System.in);
    try {
        a=sc.nextInt();                       //when we give correct i/p values it executes complete try block
        b=sc.nextInt();                       //if we give wrong i/p that means exception is raised and it directly goes to catch block and executes that block
        int i= a/b;
        sc.close();                         //it doesn't execute this sc.close and "In try"
        System.out.println("In try");
    } catch (ArithmeticException ae) {
       int i=10/2;
       System.out.println(i); 
    }
 }
}                */

/* public class ExceptionHandling{
    public static void main(String[] args) {
        int a,b;
       // a=5;
       // b=0;
        Scanner sc= new Scanner(System.in);
        try {
            a=sc.nextInt();                       //when we give correct i/p values it executes complete try block
            b=sc.nextInt();                       //if we give wrong i/p that means exception is raised and it directly goes to catch block and executes that block
            int i= a/b;
            
      //  } catch (ArithmeticException ae) {     //if we give string i/p we will not able to handle as this catch is ArthimeticException
          } catch (Exception ae) {              //As we given the string i/p,we can handle the InputMismatchException by using the parent "Exception"
           int i=10/2;
           System.out.println(i); 
        }
        finally{                                 //this block of code is executed even if exception is occured
            sc.close();
            System.out.println("In try");
        }
    }
}       */



//USING MULTIPLE CATCH BLOCKS
public class ExceptionHandling{                    //This is sample program of multiple catch blocks
    public static void main(String[] args) {
        try {
            int array[]= new int[5];
            array[5]= 10/0;                      //here exception occurs for arthimetic and arrayindexoutofbound
        } 
        catch(ArithmeticException ae){
            System.out.println("Arthimetic Exception occurs");
        }
        catch (Exception e) {
            System.out.println("Parent exception occurs");
        }
    }
}

/* public class ExceptionHandling{
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        try {
            a=sc.nextInt();                   //suppose we have given string i/p here      
            b=sc.nextInt();                       
            int i= a/b;
            
        } 
        catch(InputMismatchException ime){   //As we given the string i/p,we can handle the InputMismatchException by using another catch
            a=10;                         //also it follows hierarchy as try block first contains InputMismatchException, so we need to handle that first and later we need to handle Arthimetic     
            b=5;
                        //even though we are trying to resolve the exception here by giving crct i/p values, but this catch block handles only InputMismatchExceptionbut not arthimetic
            System.out.println("In catch block");    //so it doesn't execute a,b values but it executes the next code which is written in this catch
        }
        catch (ArithmeticException ae) {     //if we give string i/p we will not able to handle as this catch is ArthimeticException
           int i=10/2;
           System.out.println(i); 
        }
        
        finally{                                 //this block of code is executed even if exception is occured
            sc.close();
            System.out.println("In try");
        }
    }
}    */

//NESTED TRY-CATCH--- it can be only written in main catch block
/* public class ExceptionHandling{
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        try {
            a=sc.nextInt();                   //suppose we have given string i/p here      
            b=sc.nextInt();                        
        } 
        catch(InputMismatchException ime){ 
            System.out.println("In catch block");   
            a= 10;                           
            b= 0;                         //here exception is raised as arthimetic... if we given i/p correctly,an int value it directly goes to the finally
           
            try {                        //so another try-catch is written
                int i= a/b;
            } catch (ArithmeticException ae1) {          //arthimetic exception is handled here
                int i= 10/2;
                System.out.println(i);
            }   
        }
        finally{                                 
            sc.close();
            System.out.println("In try");
        }
        System.out.println("Rest of code");
    }
}                   */


/* public class ExceptionHandling{
    public static void main(String[] args) {
        int a,b;
        int arr[]= new int[5];
        Scanner sc= new Scanner(System.in);
        try {
            a=sc.nextInt();                         
            b=sc.nextInt(); 
            
            arr[6]=8;                          //got exception for ArrayIndexOutOfBoundsException
        } 
        catch(InputMismatchException ime){ 
            System.out.println("In catch block");   
            a= 10;                           
            b= 0;                        
           
            try {                        
                int i= a/b;
            } catch (ArithmeticException ae1) {          
                int i= 10/2;
                System.out.println(i);
            }   
        }
        catch(ArrayIndexOutOfBoundsException aie){            //control goes here and exception is handled
            arr[4]=8;
            System.out.println("My array value is: " +arr[4]);
        }
        finally{                                 
            sc.close();
            System.out.println("In try");
        }
        System.out.println("Rest of code");
    }
}                  */





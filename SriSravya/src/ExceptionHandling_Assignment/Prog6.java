//NESTED TRY STATEMENTS
package ExceptionHandling_Assignment;


public class Prog6 {
   public static void main(String[] args) {
     int a;
     int array[]= new int [5];
     try{
       array[6]= 20;
       System.out.println(array[6]);                  //if the i/p is given correct it goes to the nested try block
       //System.out.println(array[10]);              //if the i/p is given wrong it throws exception as ArrayIndexOutOfBoundsException
       try {
            a= 10/0;                                 //Arthimetic exception is raised
       } catch (ArithmeticException ae) {                                    //Arthimetic excpetion is handled
          //System.out.println("Division is Not Possible in Nested Catch block");
          a=10/2;
          System.out.println(a);
       }
   }
     catch(ArrayIndexOutOfBoundsException aie){             //and the exception is handled here
     // System.out.println("In Array Index Out of Bound Exception");
       array[3]= 20;
       System.out.println(array[3]);  
   }
   
   } 
}

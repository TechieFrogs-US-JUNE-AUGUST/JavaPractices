package ExceptionHandling;
import java.util.Scanner;
 
class AgeNegativeException extends Exception {
 
    public AgeNegativeException(String msg) {
  
    super(msg);
  }
}
 
public class NameAgeExcDemo {
 
 public static void main(String[] args) {
 
  Scanner s = new Scanner(System.in);
  //for(int i=0;i<5;i++){
  System.out.print("Enter ur name :: ");
  String name = s.nextLine();
  System.out.print("Enter ur age :: ");
  int age = s.nextInt();

  try {
   if(age < 0)
    throw new AgeNegativeException("Age must be greater than 0");
   else
    System.out.println("Valid age !!!");
  }
  catch (AgeNegativeException a) {
   System.out.println("Caught an exception");
   System.out.println(a.getMessage());
  }
//}
}
}


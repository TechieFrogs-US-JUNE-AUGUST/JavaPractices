import java.util.Scanner;
public class Area1 {                 // main class
 int length;
 int breadth;                           // variables declaration
   Scanner s=new Scanner(System.in);
   Area1(){}
  public Area1(int length,int breadth){     //parametrized constructor
      this.length=length;                       // instance variables and the variables declared in the constructor same
      this.breadth=breadth;                       // so this keyword used
  }
  int returnArea(){                        // returnArea method creation
      System.out.println("enter length of a rectangle");
      length=s.nextInt();                               // this method is used to print the values from the keyboard
      System.out.println("enter breadth of a rectangle");
      breadth=s.nextInt();
      return length*breadth;
  }
  public static void main(String[] args){
      Area1 obj1=new Area1();                           // craetion of object for a given class
      System.out.println("Area of rectangle="+obj1.returnArea());
  }
}

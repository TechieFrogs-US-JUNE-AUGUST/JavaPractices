import java.util.Scanner;
public class Average
 {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
       System.out.print("Enter a value");
    int  a =sc.nextInt();
     System.out.print("Enter b value");
      int b =sc.nextInt();
      System.out.print("Enter c value");
       int c =sc.nextInt();
     double d=(a+b+c)/3;
      System.out.println("average of a,b,c is " +d);
      sc.close();
    }
}
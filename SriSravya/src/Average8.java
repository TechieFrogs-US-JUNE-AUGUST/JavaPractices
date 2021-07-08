import java.util.Scanner;

public class Average8 {

    public static double Average(double x, double y, double z){         //method with parameters
        return (x+y+z)/3;
    }
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter x value ");
    double x=s.nextDouble();
    System.out.println("Enter y value ");
    double y=s.nextDouble();
    System.out.println("Enter z value ");
    double z=s.nextDouble();
    
    System.out.println("Value is " +Average(x,y,z));         //calculating avg i.e, sum/count
 }   
}

package oops.Interfaces;

import java.util.Scanner;
abstract class Shape1
{
    abstract double RectangleArea(double l,double b);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}
class Area extends Shape1
{
    double RectangleArea(double l,double b)
    {
        return l*b;
    }
    double SquareArea(double side)
    {
        return side*side;
    }
    double CircleArea(double radius)
    {
        return 3.14*(radius*radius);
    }

}


public class Abstract_Assignment6{
    public static void main(String[] args) {
        Area objarea =new Area();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Length of Rectangle : ");
        double l=sc.nextDouble();
        System.out.print("Enter Width of Rectangle : ");
        double w =sc.nextDouble();
        System.out.print("Enter side of Square : ");
        double s =sc.nextDouble();
        System.out.print("Enter Radious of Circle : ");
        double r =sc.nextDouble();
       System.out.println("Area of Rectangle : "+objarea.RectangleArea(l, w));
       System.out.println("Area of Square: " +objarea.SquareArea(s));
       System.out.println("Area of Circle: " +objarea.CircleArea(r));
       sc.close();
      
    }
  

    
}

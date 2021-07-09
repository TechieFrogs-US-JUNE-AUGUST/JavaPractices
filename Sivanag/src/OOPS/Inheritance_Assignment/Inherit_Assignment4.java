package Inheritance_Assignment;

import java.util.Scanner;

public class Inherit_Assignment4 {

    public static void main(String[] args) {
        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter length of Rectangle : ");
        double le = sc1.nextDouble();
        System.out.println("Enter breadth of Rectangle : ");
        double br = sc1.nextDouble();
        
        //Scanner sc =new Scanner(System.in);
        System.out.println("Enter Side of square : ");
        double ss=sc1.nextDouble();

        System.out.println("Area and Perimeter of Rectangle ");
        Rectangle robj =new Rectangle(le,br);
        System.out.println("Area and Perimeter of Square ");
        Square ssobj =new Square(ss);
        
        sc1.close();
        
    }

    
}
class Rectangle
{
    double length,breadth;
    
    void Rarea()
    {
        System.out.println("Area is : " + length*breadth);
    }
    void Rperimeter()
    {
        System.out.println("Perimeter is : " + 2*(length+breadth));
    }
    Rectangle(double l,double b)
    {
        this.length=l;
        this.breadth=b;
        Rarea();
        Rperimeter();
    }
    Rectangle()
    {

    }
}
class Square extends Rectangle
{
    Square(double side)
    {
        super(side,side);
    }
    Square()
    {

    }



}
package Interface;
import java.util.Scanner;
interface RegularPolygon
{                   
    abstract int getNumSides();             
    abstract double getSideLength();
}
class EquilateralTriangle implements RegularPolygon
{        
        double length;
    EquilateralTriangle(double length)
    {
        this.length=length;
    }
   public int getNumSides()
   {
        return 3;
    }
   public double getSideLength()
   {
        return length;
    }
    double getPerimeter()
    {
        return getNumSides()*length;
    }
    double getInteriorAngle()
    {
        return (getNumSides()-2)*180;
    }
}
class Square implements RegularPolygon
{
    double side;
    Square(double side)
     { 
        this.side=side; 
     }
    public int getNumSides()
     {          
               return 4;
     }
   public double getSideLength()
    {
        return side;
    }
    double getPerimeter()
    {   
        return getNumSides()*side;
    }
    double getInteriorAngle()
    {
        return (360/getNumSides());        //square internal angle 360/n
                                             // triangle internal angle 
    }
}
public class Interface1
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter length of triangle: ");
        double l=obj.nextDouble();
        System.out.println("Enter side of Square: ");
        double s=obj.nextDouble();

        EquilateralTriangle T = new EquilateralTriangle(l);                 
        System.out.println("Number of sides of a triangle: "+T.getNumSides());
        System.out.println("Length of sides of a triangle: "+T.getSideLength());
        System.out.println("Perimeter of the triangle: "+T.getPerimeter());
        System.out.println("Internal angle of a triangle: "+T.getInteriorAngle());

        Square S=new Square(s);                                        
        System.out.println("Number of sides of a Square: "+S.getNumSides());
        System.out.println("Length of sides of a Square: "+S.getSideLength());
        System.out.println("Perimeter of the Square: "+S.getPerimeter());
        System.out.println("Internal angle of a Square: "+S.getInteriorAngle());
    }
}
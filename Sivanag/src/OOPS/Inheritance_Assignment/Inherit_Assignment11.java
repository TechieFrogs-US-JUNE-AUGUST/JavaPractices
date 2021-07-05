package Inheritance_Assignment;

import java.util.Scanner;

class Circlee
{
    double radius=1.0;
    String color="Red";
    double area;
    private double π;
    Circlee()
    {


    }
    Circlee(double radius)
    {


    }
    Circlee(double radius,String color)
    {

        
    }
    double getRadius()
    {
        return radius;
    }
    void setRadius(double radius)
    {

    }
    String getColor()
    {
        return color;
    }
    void setColor(String color)
    {

    }
    void getArea()
    {
        area = 3.14 * (radius * radius);
        System.out.println("Area : " +area); 
    }

} 
class Cylinder extends Circle
{
double height=1.0;
double volume;
double radius;
private double π;
Cylinder()
{

}
Cylinder(double radius)
{
this.radius=radius;
}
Cylinder(double radius,double height)
{
this.radius=radius;
this.height=height;
}
Cylinder(double radius,double height,String color)
{
    this.radius=radius;
    this.height=height; 
}
double getHeight()
{
    return height;
}
void setHeight(double height)
{
height=5.3;
}
void getVolume()
{
    
    volume  = 3.14 * (radius * radius)*height;
    System.out.println("Volume of Cylinder is: " + volume);
}
void getArea()
{
    double area;
    area = ((2*3.14) * (radius * height))+(\u03C0 * (radius * radius));
    System.out.println("surface Area : " +area); 
}

}
public class Inherit_Assignment11 {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Circle Radious: ");
        double r =sc.nextDouble();
        System.out.print("Enter Height of Cylinder: ");
        double h=sc.nextDouble();
        Circlee cobj =new Circlee(r,"Yellow");
        Cylinder ccobj = new Cylinder(r,h,"Blue");
        cobj.getArea();
        ccobj.getArea();
        ccobj.getVolume();
        sc.close();
    }
    
}

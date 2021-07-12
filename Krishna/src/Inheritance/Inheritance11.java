package Inheritance;

import java.util.Scanner;

class Circle11{
    double radius=1;
    String colour="red";
    double area;
    Circle11()
    {  }
    Circle11(double radius)
    {
        this.radius=radius;
    }
    Circle11(double radius,String colour)
    { }
    double getRadius()
    {
        return radius;
    }
    void setRadius(double radius)
    { }
    String getColour()
    {
        return colour;
    }
    void setColour(String colour)
    {

    }
    double getArea()
    {
        area=3.14*(radius*radius);
        System.out.println("Area is " +area);
        return area;
    }
}
class Cylinder1 extends Circle11
{
    double height=1.0d;
    double volume;
    Cylinder1()
    { }
    Cylinder1(double radius)
    {
        this.radius=radius;
    }
    Cylinder1(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }
    Cylinder1(double radius,double height, String colour)
    {
        this.radius=radius;
        this.height=height;
        this.colour=colour;
    }
    double getHeight()
    {
        return height;

    }
    void setHeight(double height)
    { }
    double getvolume()
    {
        volume=(3.14*(radius*radius)*height);
        System.out.println("volume of cylinder is " +volume);
        return volume;
    }
    double getArea()
    {
        double area;
        area=((2*3.14)*(radius*height))+ (2*3.14*(radius*radius));
        System.out.println("surface area is " +area);
        return area;
    }
}
public class Inheritance11{
    public static void main(String[ ] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter raius " );
        double r=sc.nextDouble();
        System.out.print("enter height " );
        double h=sc.nextDouble();
        Circle11 circleObj=new Circle11(r);
        Cylinder1 cylinderObj=new Cylinder1(r,h);
        cylinderObj.getArea();
        cylinderObj.getvolume();
        circleObj.getArea();
    }
}
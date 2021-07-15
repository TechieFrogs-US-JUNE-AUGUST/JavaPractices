package inheritance;

import java.util.Scanner;

class Circle1{
    double radius=1;
    String colour="red";
    double area;
    Circle1()
    {

    }
    Circle1(double radius)
    {
        this.radius=radius;
    }
    Circle1(double radius,String colour)
    {

    }
    double getRadius()
    {
        return radius;
    }
    void setRadius(double radius)
    {

    }
    String getColour()
    {
        return colour;
    }
    void setColour(String colour)
    {

    }
    double getArea()
    {
        
        area=(3.14*(radius*radius));
        System.out.println("Area : " +area);
        return area;
    }
}
class Cylinder extends Circle1
{
        double height=1.0;
        double volume;
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
        Cylinder(double radius,double height,String colour)
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
        {
            
        }
        double getVolume()
        {
            volume=3.14*(radius*radius)*height;
            System.out.println("volume of Cylinder : " +volume);
            return volume;
        }
       double getArea()
        {
            double area;
            //area1 = ((2*3.14) * (radius * height))+2(3.14 * (radius * radius));
            //System.out.println(radius);
            //System.out.println(height);

            area=(2*3.14*radius*height)+(2*3.14*radius*radius);
            System.out.println("surface Area : " +area + "radius : " +radius + "height : " +height); 
            return area;

        }

}

public class InheritanceAssignment11{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Radius :");
        double r=sc.nextDouble();
        System.out.println("Enter Height  :");
        double h=sc.nextDouble();
        Circle1 circleobj=new Circle1(r);
        Cylinder cylinderobj=new Cylinder(r,h);
        cylinderobj.getArea();
        cylinderobj.getVolume();
        circleobj.getArea();

        

    }
}
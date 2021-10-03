package src.OOPS.Abstract_Assignment;

//package Interfaces;

import java.util.Scanner;
//------------------Start Abstract Class----------------
abstract class Shape3
{
    protected String color="red";
    protected Boolean filled =true;

    Shape3()
    {


    }
  Shape3(String color,Boolean filled)
  {
    this.color =color;
    this.filled=filled;
  }

  String getColor()
  {
      return color;
  }
  void setColor(String color)
  {
      this.color=color;
  }
  Boolean isFilled()
  {
      return filled;
  }
  void setFilled(Boolean filled)
  {
      this.filled=filled;
  }
  abstract double getArea();
  abstract double getPerimeter();
  public String toString()
  {
      return "Shape[color="+color+",filled="+filled+"]";
  }

}
//------------------End Abstract Class----------------
//-------------  circle class---------------------
class Circle3 extends Shape3
{
 double radius=1.0;
 Circle3()
 {

 }
 Circle3(double radius)
 {
     this.radius=radius;
 }
 Circle3(double radius,String color,Boolean filled)
 {
    this.radius=radius;
    this.color=color;
    this.filled=filled;

 }
 double getRadius()
 {
    return radius;
 }
 void setRadius(double radius)
 {
     this.radius=radius;
 }
double getArea()
{
    return 3.14*(radius*radius);
}
double getPerimeter()
{

    return 2*3.14*radius;
}
public String toString()
{
    return "Circle[Shape[color=" +color+",filled="+filled+",radius="+radius+"]";
}

}

//------------- End circle class---------------------
//-------------  Rectangle class---------------------
class Rectangle3 extends Shape3
{
double width=1.0;
double length =1.0;
Rectangle3()
{

}
Rectangle3(double width,double length)
{
    this.width=width;
    this.length=length;

}
Rectangle3(double width,double length,String color,Boolean filled)
{
    this.width=width;
    this.length=length;
    this.color=color;
    this.filled=filled;
}
double getWidth()
{
    return width;
}
void setWidth(double width)
{
    this.width=width;
}
double getLength()
{
    return length;
}
void setLength(double length)
{
    this.length=length;
}
double getArea()
{

    return length*width;
}
double getPerimeter()
{
    return 2*(width+length);
}
public String toString()
{
    return "Rectangle[Shape[color=" +color +",filled="+ filled +"],width="+width+",length="+length+"]";

}


}
//------------- End Rectangle class---------------------
//------------- Square class---------------------
class Square3 extends Shape3
{
    double side=1.0;
    Square3()
    {

    }
    Square3(double side)
    {
        this.side =side;
    }
    Square3(double side,String color, Boolean filled)
    {
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    double getSide()
    {
        return side;
    }
    void setSide(double side)
    {
        this.side=side;
    }
    double getArea()
    {
        return side*side;
    }
    double getPerimeter()
    {
        return 4*side;
    }
    public String toString()
    {
        return "Square[Shape[color=" +color +",filled="+filled+"],side="+side+"]";
    }

}


//-------------End Square class---------------------
public class Abstract_Assignment7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Circle Radius : ");
        double r =sc.nextDouble();
        System.out.print("Enter Circle colour : ");
        String c = sc.next();
        System.out.print("Is Circle Filled(true/false) : ");
        Boolean d = sc.nextBoolean();
    
        System.out.print("Enter Width of Rectangle : ");
        double w =sc.nextDouble();
        System.out.print("Enter Length of Rectengle : ");
        double l =sc.nextDouble();
        System.out.print("Enter Rectangle colour : ");
        String cc = sc.next();
        System.out.print("Is Rectangle Filled(true/false) : ");
        Boolean dd = sc.nextBoolean();
        System.out.print("Enter side of Square : ");
        double s =sc.nextDouble();
        System.out.print("Enter Square colour : ");
        String ccc = sc.next();
        System.out.print("Is Square Filled(true/false) : ");
        Boolean ddd = sc.nextBoolean();


        Circle3 objcircle =new Circle3(r,c,d);
        Rectangle3 objrect = new Rectangle3(w,l,cc,dd);
        Square3 objsquare = new Square3(s,ccc,ddd);
        //objcircle.setRadius(9);
        System.out.println("Radius of Circle : " +objcircle.getRadius());
        System.out.println("Color of Circle : " +objcircle.getColor());
        System.out.println("Is Circle Filled: " +objcircle.isFilled());
        System.out.println("Area of Circle : " + objcircle.getArea());
        System.out.println("Perimeter of Circle : " +objcircle.getPerimeter());

        System.out.println("Width of Rectangle : " +objrect.getWidth());
        System.out.println("Length of Rectangle : " +objrect.getLength());
        System.out.println("Color of Circle : " +objrect.getColor());
        System.out.println("Is Circle Filled: " +objrect.isFilled());
        System.out.println("Area of Rectangle : "  +objrect.getArea());
        System.out.println("Perimeter of Rectangle : " +objrect.getPerimeter());

        System.out.println("Side of Square : " +objsquare.getSide());
        System.out.println("Color of Circle : " +objsquare.getColor());
        System.out.println("Is Circle Filled: " +objsquare.isFilled());
        System.out.println("Area of Square : " + objsquare.getArea());
        System.out.println("Perimeter of Square : " +objsquare.getPerimeter());

        
        
        sc.close();
        
    }
    
}

package Inheritance;

import java.util.Scanner;
class Circle1{
    double radius;
    String colour;
    Circle1(){}
    Circle1(double radius){
        this.radius=radius;
    }
    Circle1(double radius,String colour){
        this.radius=radius;
        this.colour=colour;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    String getColour(){
        return colour;
    }
    void setColour(String colour){
        this.colour=colour;
    }
    double getArea(){
        System.out.println("colour of circle: "+colour);
        return 3.14*radius*radius;
    }
}
class Cylinder extends Circle1{
    double height;
    Cylinder(){}
    Cylinder(double radius){
        this.radius=radius;
    }
    Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    Cylinder(double radius,double height,String colour){
        this.radius=radius;
        this.height=height;
        this.colour=colour;
    }
    double getHeight(){
        return height;
    }
    void setHeight(double height){
        this.height=height;
    }
    double getArea(){
        System.out.println("colour of cylinder: "+colour);
        return ((2*3.14) * (radius * height))+2*(3.14 * (radius * radius));
    }
    double getVolume(){
        return 3.14 * (radius * radius)*height;
    }
}
public class CircleCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter colour");
        String colour=sc.nextLine();
        System.out.println("enter radius");
        double radius=sc.nextDouble();
        System.out.println("enter height");
        double height=sc.nextDouble();
        Circle1 obj1=new Circle1(radius,colour);
        System.out.println("area of circle: "+obj1.getArea());
        Cylinder obj2=new Cylinder(radius,height,colour);
        System.out.println("surface area of cylinder is: "+obj2.getArea());
        System.out.println("volume of cylinder is: "+obj2.getVolume());
    }
}

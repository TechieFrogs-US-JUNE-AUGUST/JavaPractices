package AbstractClass_Assignment;
import java.util.Scanner;

abstract class Shape1{                      //abstract class
    protected String colour;               
    protected boolean filled;
    Shape1(){}                              //constructor
    Shape1(String colour,boolean filled){
        this.colour=colour;
        this.filled=filled;
    }
    String getColour(){
        return colour;
    }
    void setColour(String colour){
        this.colour=colour;
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled=filled;
    }
    abstract double getArea();              //abstract method
    abstract double getPerimeter();
}
class Circle extends Shape1{                 //inheritance
    double radius;
    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius, String colour, boolean filled){
        this.radius=radius;
        this.colour=colour;
        this.filled=filled;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    } 
    double getArea() {                                  //overriding method
        return 3.14*radius*radius;
    }
    double getPerimeter(){
        return 2*3.14*radius;
    }
}
class Rectangle extends Shape1{
    double width;
    double length;
    Rectangle(){}                              //constructors
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    Rectangle(double width,double length, String colour, boolean filled){
        this.width=width;
        this.length=length;
        this.colour=colour;
        this.filled=filled;
    }
    double getWidth(){                      //mutators
        return width;
    }
    void setWidth(double width){            //accessors
        this.width=width;
    }
    double getLength(){
        return length;
    }
    void setLength(double length){
        this.length=length;
    }
    double getArea() {                      //overriding method
        return length*width;
    }
    double getPerimeter(){
        return 2*(length+width);
    }
}
class Square extends Rectangle{              //inheritance
    double side;
    Square(){}
    Square(double side){
        this.side=side;
    }
    Square(double side, String colour, boolean filled){
        this.side=side;
        this.colour=colour;
        this.filled=filled;
    }
    double getSide(){
        return side;
    }
    void setSide(double side){
        this.side=side;
    }
    double getArea() {                        //overriding method
        return side*side;
    }
    double getPerimeter(){
        return 4*side;
    }
}
public class Ass4Prog7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter colour");
        String colour=scan.nextLine();
        System.out.println("Enter filled");
        boolean filled=scan.nextBoolean();
        System.out.println("Enter radius");
        double r=scan.nextDouble();
        System.out.println("Enter width");
        double w=scan.nextDouble();
        System.out.println("Enter length");
        double l=scan.nextDouble();
        System.out.println("Enter side");
        double s=scan.nextDouble();

        Circle cir=new Circle(r, colour, filled);                         //circle obj
        System.out.println("Radius of circle: "+cir.getRadius());
        System.out.println("Colour of circle: "+cir.getColour());
        System.out.println("Area of circle: "+cir.getArea());
        System.out.println("Perimeter of circle: "+cir.getPerimeter());

        Rectangle rect=new Rectangle(w, l, colour, filled);                //rectangle obj
        System.out.println("Width of rectangle: "+rect.getWidth());
        System.out.println("Length of rectangle: "+rect.getLength());
        System.out.println("Colour of rectangle: "+rect.getColour());
        System.out.println("Area of rectangle: "+rect.getArea());
        System.out.println("Perimeter of rectangle: "+rect.getPerimeter());

        Square sq=new Square(s, colour, filled);                           //square obj
        System.out.println("Side of square: "+sq.getSide());
        System.out.println("Colour of square: "+sq.getColour());
        System.out.println("Area of square: "+sq.getArea());
        System.out.println("Perimeter of square: "+sq.getPerimeter());
    }
}

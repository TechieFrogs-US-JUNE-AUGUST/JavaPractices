package AbstractClass;

import java.util.Scanner;

abstract class Shape1{
    protected String colour;
    protected boolean filled;
    Shape1(){}
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
    abstract double getArea();
    abstract double getPerimeter();
   public String toString(){
        return "Shape[colour "+colour+" filled"+filled+"]";
    }
}
class Circle extends Shape1{
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
    double getArea() {
        return 3.14*radius*radius;
    }
    double getPerimeter(){
        return 2*3.14*radius;
    }
   public String toString(){
        return "circle[Shape: colour "+colour+" filled "+filled+" radius "+radius+"]";
    }
}
class Rectangle extends Shape1{
    double width;
    double length;
    Rectangle(){}
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
    double getWidth(){
        return width;
    }
    void setWidth(double width){
        this.width=width;
    }
    double getLength(){
        return length;
    }
    void setLength(double length){
        this.length=length;
    }
    double getArea() {
        return length*width;
    }
    double getPerimeter(){
        return 2*(length+width);
    }
   public String toString(){
        return "Rectangle[Shape: colour "+colour+" filled "+filled+" width "+width+" length "+length+"]";
    }
}
class Square extends Rectangle{
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
    double getArea() {
        return side*side;
    }
    double getPerimeter(){
        return 4*side;
    }
   public String toString(){
        return "Square[Shape: colour "+colour+" filled "+filled+" side "+side+"]";
    }
}
public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter colour");
        String colour=sc.nextLine();
        System.out.println("enter filled");
        boolean filled=sc.nextBoolean();
        System.out.println("enter radius");
        double r=sc.nextDouble();
        System.out.println("enter width");
        double w=sc.nextDouble();
        System.out.println("enter length");
        double l=sc.nextDouble();
        System.out.println("enter side");
        double s=sc.nextDouble();
        Circle cir=new Circle(r, colour, filled);
        System.out.println("radius of circle is: "+cir.getRadius());
        System.out.println("colour of circle is: "+cir.getColour());
        System.out.println("area of circle is: "+cir.getArea());
        System.out.println("perimeter of circle is: "+cir.getPerimeter());
        Rectangle rect=new Rectangle(w, l, colour, filled);
        System.out.println("width of rectangle is: "+rect.getWidth());
        System.out.println("length of rectangle is: "+rect.getLength());
        System.out.println("colour of rectangle is: "+rect.getColour());
        System.out.println("area of rectangle is: "+rect.getArea());
        System.out.println("perimeter of rectangle is: "+rect.getPerimeter());
        Square sq=new Square(s, colour, filled);
        System.out.println("side of square is: "+sq.getSide());
        System.out.println("colour of square is: "+sq.getColour());
        System.out.println("area of square is: "+sq.getArea());
        System.out.println("perimeter of square is: "+sq.getPerimeter());
    }
}

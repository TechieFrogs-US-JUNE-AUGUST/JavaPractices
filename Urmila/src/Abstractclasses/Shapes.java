package Abstractclasses;
import java.util.Scanner;
abstract  class Shapes {
    protected String colour;
    protected boolean filled;
    Shapes(){}
    Shapes(String colour,boolean filled){
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
class Circle extends Shapes{
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
class Rectangle extends Shapes{
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
 class AddShapes{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter colour");
        String colour=scanner.nextLine();
        System.out.println("enter filled");
        boolean filled=scanner.nextBoolean();
        System.out.println("enter radius");
        double radius=scanner.nextDouble();
        System.out.println("enter width");
        double width=scanner.nextDouble();
        System.out.println("enter length");
        double lenght=scanner.nextDouble();
        System.out.println("enter side");
        double side=scanner.nextDouble();
        Circle circle=new Circle(radius, colour, filled);
        System.out.println("radius of circle is: "+circle.getRadius());
        System.out.println("colour of circle is: "+circle.getColour());
        System.out.println("area of circle is: "+circle.getArea());
        System.out.println("perimeter of circle is: "+circle.getPerimeter());
        Rectangle rectangle=new Rectangle(width, lenght, colour, filled);
        System.out.println("width of rectangle is: "+rectangle.getWidth());
        System.out.println("length of rectangle is: "+rectangle.getLength());
        System.out.println("colour of rectangle is: "+rectangle.getColour());
        System.out.println("area of rectangle is: "+rectangle.getArea());
        System.out.println("perimeter of rectangle is: "+rectangle.getPerimeter());
        Square square=new Square(side, colour, filled);
        System.out.println("side of square is: "+square.getSide());
        System.out.println("colour of square is: "+square.getColour());
        System.out.println("area of square is: "+square.getArea());
        System.out.println("perimeter of square is: "+square.getPerimeter());
    }
}
package AbstractAssinment;
abstract class Shapes{
    protected String color="red";
    protected boolean filled=true;
    Shapes(){}
    Shapes(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean getIsFilled(){
        return filled;
    }
    public void setIsFilled(boolean filled){
        this.filled=filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public String toString(String color,boolean filled ){
        return color;
    }
}
class Circle extends Shapes{
    double radius=1.0;
    String color;
    boolean filled;
    Circle(){}
    Circle(double radius,String color,boolean filled){
        this.radius=radius;
        this.color=color;this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
        System.out.println(radius);
    }
    double getArea(){
        double radius=5;
        System.out.println("Area of a circle:");
        double area=3.14*radius*radius;
        return area;
    }
    double getPerimeter(){
        double radius=5;
        System.out.println("perimeter of a circle");
        double perimeter=2*3.14*radius;
        return perimeter;
    }
    public  String toString(){
        String color="red";
        System.out.println("color of a circle:"+color);
        boolean filled=true;
        System.out.println("shape filled:"+filled);
        return color;
    }
}
class Rectangle extends Shapes{
    double width=1.0;
    double length=1.0;
    String color;
    boolean filled;
    Rectangle(){
    }
    Rectangle(double width,double length,String color,boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public  double getWidth(){
        return width;
    }
    public void setWidth( double width){
        this.width=width;
        System.out.println("width of side of rectangle:"+width);
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
        System.out.println("length of a rectangle:"+length);
    }
    double getArea(){
        double length=9;
        double width=7;
        double area=length*width;
        System.out.println("Area of a rectangle:"+area);
        return area;
    }
    double getPerimeter(){
        // double length=9;
        //  double width=7
        System.out.println("perimeter of a rectangle");
        double perimeter=2*(length+width);
        return perimeter;
    }
    public String toString() {
        String color = "yellow";
        boolean filled = true;
        System.out.println("color of a rectangle:" + color);
        System.out.println("shape filled of a rectangle:" + filled);
        return color;
    }
}
class Square extends Rectangle{
    double side;
    String color;
    boolean filed;
    Square(){

    }
    Square(double side,String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide(){
        return side;
    }
    public void setSide(){
        this.side=side;
    }
    double setWidth(){
        return width;
    }
    double setLength(){
        return length;
    }
    public void getWidth(double side){
        this.side=side;
        System.out.println("width of side of a square:"+side);
    }
    public void getLength(double side){
        this.side=side;
        System.out.println("length of a side of a square:"+side);
    }
    public String toString(){
        String color="pink";
        boolean filled=true;
        System.out.println("color of a Square:" + color);
        System.out.println("shape filled of a Square:" + filled);
        return color;
    }
}
public class Abstract10 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println("Requirements of a circle");
        System.out.println("---------------------");
        System.out.println("Shape of a circle:");
        obj.toString();
        System.out.print("Radius of a circle:");
        obj.setRadius(5);
        Rectangle obj2=new Rectangle();
        System.out.println("Requirements of a rectangle");
        System.out.println("---------------------");
        obj2.toString();
        //  System.out.println("width of a rectangle");
        obj2.setWidth(6);
        //  System.out.println("length of a rectangle");
        obj2.setLength(8);
        Square obj3=new Square();
        System.out.println("Requirements of a Square:");
        obj3.toString();
        obj3.getWidth(4);
        obj3.getLength(4);
    }
}

package Inheritance;
class Circle{
    Circle(){}
    private double radius=1.0;
    private String color="red";
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        System.out.println("radius of a circle:");
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        System.out.println("color of a circle");
        this.color=color;
    }

    double getArea(double r){
        radius=r;
        System.out.println("Area of circle:");
        double a=3.14*r*r;
        return a;}

}
class Cylinder extends Circle{
    private double height=1.0;
    double radius;
    String color;
    Cylinder(){}
    Cylinder(double radius,double height,String color){
        this.height=height;
        this.radius=radius;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        System.out.println("height of a cylinder");
        this.height=height;
    }

    double volume(){
        System.out.println("volume of a cylinder");
        double volume=3.14*radius*radius*height;
        return volume;
    }
    double getArea(double radius,double height){
        System.out.println("Area of a cylinder");
        double h=2*3.14*radius*height;
        double b=2*3.14*radius*radius;
        double area=h+b;
        return area;
    }
}
public class Inheritance11 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        Cylinder obj1 = new Cylinder();
        System.out.println(obj.getArea(5));
        System.out.println(obj1.getArea(5,8));
    }
}


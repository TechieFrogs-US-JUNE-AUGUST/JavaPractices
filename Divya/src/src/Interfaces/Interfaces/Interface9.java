package Interfaces;
interface Circles{
  void getRadius();
  void getColor();
}
interface Rectangles{
    void getLength();
    void getWidth();
    void getColor();
}
interface Shapes{
    String Shape();
}
interface Signs{
    String sign();
}
class Circle implements Circles {
    Circle(){}
    double radius;
    String color;
    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void getRadius() {
        double radius = 5;
        System.out.println("radius of a circle:" + radius);
    }

    public void getColor() {
        String color = "white";
        System.out.println("color of a circle:"+color);
    }
}
class Rectangle implements Rectangles{
    Rectangle(){}
    double length;
    double width;
    String color;
    Rectangle(double width,double length,String color){
        this.length=length;
        this.width=width;
        this.color=color;
    }
    public void getWidth(){
        double width=5;
        System.out.println("width of a rectangle:"+width);
    }
    public void getLength(){
        double length=7;
        System.out.println("length of a rectangle:"+length);
    }
    public void getColor(){
        String color="pink";
        System.out.println("color of a rectangle:"+color);
    }
}
class Shape1 implements Shapes{
    Shape1(){}
        String shape3;
        Shape1(String sh){
            shape3=sh;}
        public String Shape() {
            String sh = "circle is a Shape";
            System.out.println("the size of the String is:"+sh.length());
            return sh;
        }
}
class Sign implements Signs{
    String sign;
    Sign(){}
    Sign(String sign){
        this.sign=sign;
    }
    public String sign() {
            String sign="@";
            System.out.println("sign assigned to circle is:"+sign);
            return sign;
        }
    }
    public class Interface9 {
public static void main(){
    Circle obj=new Circle();
    obj.getRadius();
    obj.getColor();
    Rectangle obj1=new Rectangle();
    obj1.getLength();
    obj1.getWidth();
    obj1.getColor();
    Shape1 obj3=new Shape1();
    obj3.Shape();
    Sign obj4=new Sign();
    obj4.sign();
}
}

package Abstractclasses;
import java.util.Scanner;
abstract class Shape {
    abstract void RectangleArea(int length,int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
}
class Area extends Shape{
    void RectangleArea(int length,int breadth){
       double area=(length*breadth);
       System.out.println("Area of rectangle is: "+ area);
    }
    void SquareArea(int side){
        double area=(side*side);
        System.out.println("Area of Square is: "+ area);
    }
    void CircleArea(int radius){
        double area=(3.14*radius*radius);
        System.out.println("Area of Circle is: "+ area);
    }
}
 class AddShape{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length and breadth");
        int lenght =scanner.nextInt();
        int breadth =scanner.nextInt();
        System.out.println("enter side");
        int side =scanner.nextInt();
        System.out.println("enter radius");
        int radius=scanner.nextInt();
        Area area=new Area();
        area.RectangleArea(lenght, breadth);
        area.SquareArea(side);
        area.CircleArea(radius);
    }
}
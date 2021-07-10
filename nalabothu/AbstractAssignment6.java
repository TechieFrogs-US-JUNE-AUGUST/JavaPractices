import java.util.Scanner;
public class AbstractAssignment6 
    {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length and breadth");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter side");
        int s=sc.nextInt();
        System.out.println("enter radius");
        int r=sc.nextInt();
        Area obj=new Area();
        obj.RectangleArea(l, b);
        obj.SquareArea(s);
        obj.CircleArea(r);
    }
}


abstract class Shape{
    abstract void RectangleArea(int length,int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
}
class Area extends Shape{
    void RectangleArea(int length,int breadth){
       double area=length*breadth;
       System.out.println("Area of rectangle is: "+area);
    }
    void SquareArea(int side){
        double area=side*side;
        System.out.println("Area of Square is: "+area);
    }
    void CircleArea(int radius){
        double area=3.14*radius*radius;
        System.out.println("Area of Circle is: "+area);
    }
    

    
}

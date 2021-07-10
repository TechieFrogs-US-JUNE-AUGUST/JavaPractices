package Abstractclass;

abstract class Shape{
    abstract int rectangeleArea(int l,int b);
    abstract int squareArea(int s);
    abstract double circleArea(int r);
}
class Area extends Shape{

   
    int rectangeleArea(int l, int b) {
        System.out.println("Area of Rectangle : " +l*b);
        return (l*b);
    }

    
    int squareArea(int s) {
        System.out.println("Area of Square : " +(s*s));
        
        return (s*s);
    }

  
    double circleArea(int r) {
        
        
        return (3.14*(r*r));
    }
    
}
public class AbstractAssignment6 {
    public static void main(String[] args) {
        Area area=new Area();
        area.rectangeleArea(5, 6);
        area.squareArea(9);
        System.out.println("Area of Circle : " +(area.circleArea(4)));
    }
    
}

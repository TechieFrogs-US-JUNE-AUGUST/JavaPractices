abstract class Shape{                                     //abstract class
    abstract void RectangleArea(double length,double breadth);    //abstract methods with parameters
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape{                       //subclass with inheritance

    void RectangleArea(double length,double breadth){          //overriding methods
        double Area=length*breadth;
        System.out.println("Area of Rectangle is: " +Area);
    }
    
    void SquareArea(double side){
        double Area=side*side;
        System.out.println("Area of Square is: " +Area);
    }

    void CircleArea(double radius){
        double Area=3.14*(radius*radius);
        System.out.println("Area of Circle is: " +Area);
    }
}

public class Ass4Prog6 {
    public static void main(String[] args){
        Area obj=new Area();                  //creating the instance for subclass
        obj.RectangleArea(4,5);               //calling the methods with passing the i/p's
        obj.SquareArea(4);
        obj.CircleArea(2);
    }
}

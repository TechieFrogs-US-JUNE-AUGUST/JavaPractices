package Inheritance;

class Shape{
    void shape(){
        System.out.println("This is Shape");
    }
}
class Rectangle1 extends Shape{
    void rectangleMethod(){
        System.out.println("This is Rectangle");
    }

}
class Circle extends Shape{
    void circleMethod(){
        System.out.println("This is Circle");
    }
}
class Square1 extends Rectangle1{
    void squareMethod(){
        System.out.println("Square is a Rectangle");
    }
}

public class InheritanceAssignment6 {
    public static void main(String[] args) {
        Square1 s = new Square1();
        s.shape();
        s.rectangleMethod();
    }
    
}

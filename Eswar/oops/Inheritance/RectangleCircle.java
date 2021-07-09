package oops.Inheritance;
class Shape{
    void display(){
        System.out.println("This is Shape");
    }
}
class Rectangle1 extends Shape{
void display(){
    System.out.println("This is Rectangular Shape");
}
}
class Square1 extends Rectangle1{
    void display(){
        super.display();
        System.out.println("This is Square");
    }
}
class Circle extends Shape{
void display(){
    System.out.println("This is Circular shape");
}
}
public class RectangleCircle {
    public static void main(String[] args) {
        Square1 s=new Square1();
        Circle c=new Circle();
        s.display();
        c.display();

    }
}

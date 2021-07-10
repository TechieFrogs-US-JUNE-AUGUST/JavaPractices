package Inheritance;

 class Shape {
    void shape()
    {
        System.out.println("This is shape ");
    }
}
    class rectangle1 extends Shape
    {
        void Rectanglemethod()
        {
            System.out.println("This is rectangular shape");
        }
    }
    class Circle extends Shape
    {
        void circlemethod()
        {
            System.out.println("This is circular shape");
        }
    }
    class square1 extends rectangle1
    {
        void squaremethod()
        {
            System.out.println("Square is a rectangle");
        }
    }
public class Shape1{
    public static void main(String[] args)
    {
        square1 Obj= new square1();
        Obj.shape();
        Obj.Rectanglemethod();
    } 
} 
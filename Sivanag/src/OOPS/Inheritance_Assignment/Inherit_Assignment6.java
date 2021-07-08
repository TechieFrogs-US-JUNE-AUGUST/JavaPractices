package Inheritance_Assignment;


public class Inherit_Assignment6 {
    public static void main(String[] args) {
        Square1 sr = new Square1();
        sr.shp_method();
        sr.rec_method();
    }

}
class Shape
{
    void shp_method()
    {
    System.out.println("This is a Shape");
    }
}
class Rectangle1 extends Shape
{
    void rec_method()
    {
        System.out.println("This is a Rectangle");
    }


}
class Circle extends Shape
{
    void cir_method()
    {
        System.out.println("This is a Circular Shape");
    }

}
class Square1 extends Rectangle1
{
    void Sqr_method()
    {
        System.out.println("Square is a Rectangle");

    }

}
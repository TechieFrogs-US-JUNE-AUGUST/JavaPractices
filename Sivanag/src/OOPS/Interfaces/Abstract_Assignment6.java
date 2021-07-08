abstract class Shape1
{
    abstract double RectangleArea(double l,double b);
    abstract double SquareArea(double side);
    abstract double CircleArea(double radius);
}
class Area extends Shape1
{
    double RectangleArea(double l,double b)
    {
        return l*b;
    }
    double SquareArea(double side)
    {
        return side*side;
    }
    double CircleArea(double radius)
    {
        return 3.14*(radius*radius);
    }

}


public class Abstract_Assignment6 {
    public static void main(String[] args) {
        Area objarea =new Area();
       System.out.println(objarea.RectangleArea(20, 30));
       System.out.println(objarea.SquareArea(20));
       System.out.println(objarea.CircleArea(10));
      
    }
  

    
}

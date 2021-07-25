package Abstract;

abstract class Shape
{
    abstract int RectangeleArea(int l,int b);
    abstract int squareArea(int s);
    abstract double circleArea(int r);
}
class Area extends Shape{
    int RectangeleArea(int l, int b)
    {
        System.out.println("area of reactangle is :"+l*b);
        return(l*b);
    }
    int squareArea(int s)
    {
        System.out.println("area of square is :" +(s*s));
        return(s*s);
    }
    double circleArea(int r)
    {
        System.out.println("area of circle is: " +(3.14*(r*r)));
        return(3.14*(r*r));   
    }
}
public class ShapeAbstract {
    public static void main(String [ ] args)
    {
        Area Obj= new Area();
        Obj.RectangeleArea(2,3);
        Obj.circleArea(5);
        Obj.squareArea(9);
    }
}
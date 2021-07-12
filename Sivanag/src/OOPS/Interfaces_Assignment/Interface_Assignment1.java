interface RegularPolygon{
    double getNumSides();
    double getSideLength();
    
}
//class1 implements Interface
class EquilateralTriangle implements RegularPolygon
{
    double sides;
    public double getNumSides()
    {
        return 3;
    }
    public double getSideLength()
    {
        return sides;
    }
    EquilateralTriangle(double sides)
    {
        this.sides=sides;
    }
}
//------end class1
//class2 implements Interface
 class Square5 implements RegularPolygon
{
    double sidelength;
    public double getNumSides()
    {
        return 4;
    }
    public double getSideLength()
    {
        return  sidelength;
    }
    Square5(double sidelength)
    {
        this.sidelength=sidelength;
    }

}
//----------------
public class Interface_Assignment1

{
    RegularPolygon objs5 = new Square5(10);
    RegularPolygon objs51 = new EquilateralTriangle(10);
    double totalSides()
    {
        return objs5.getNumSides()+objs51.getNumSides();
    }
    double getPerimeter(double length)
    {
        return objs5.getNumSides()* length;
    }
    double getInteriorAngle()
    {
        return (objs5.getNumSides()-2)*objs5.getNumSides();
    }
    public static void main(String[] args) {
        //EquilateralTriangle objer = new EquilateralTriangle(5);
       Interface_Assignment1 obj= new Interface_Assignment1();
       System.out.println("Total side of shapes :" +obj.totalSides());
       System.out.println("Total side of shapes :" +obj.getPerimeter(5));
       System.out.println("Total side of shapes :" +obj.getInteriorAngle());


    }


}

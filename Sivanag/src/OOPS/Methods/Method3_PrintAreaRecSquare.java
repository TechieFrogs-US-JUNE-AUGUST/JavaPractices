package Methods;
class AreaRecSquare
{
    void area(double length,double breadth)
    {
        System.out.println(("Area of Rectangle is : " + length*breadth));

    }
    void area(double side)
    {
        System.out.println("Area of Square is : " + (side*side));

    }


}


public class Method3_PrintAreaRecSquare {
    public static void main(String[] args) {
        AreaRecSquare objarea = new AreaRecSquare();
        objarea.area(20, 30);
        objarea.area(20);
        
    }
    
}

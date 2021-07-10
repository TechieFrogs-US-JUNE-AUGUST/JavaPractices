import java.util.Scanner;
public class AreaOfSquare3 
{
    public void Area(int length,int breadth)
    {
        int area=length*breadth;
        System.out.println("the area of rectangle is"+area);
    }
    public void Area(int side)
    {
        int area=side*side;
        System.out.println("the area of square is"+area);
    }
    public static void main(String[] args)
    {
        AreaOfSquare3 c=new AreaOfSquare3();
        c.Area(5,6);
        c.Area(6);
    }
    
}

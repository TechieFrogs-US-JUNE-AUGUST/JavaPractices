package Methods;

class Area{

    public void printArea(int l,int b)
    {
        System.out.println("Area of Rectangle :" +(l*b));
    
    }

     int printArea(int a)
    {
        //System.out.println("Area of Square :" +(a*a));
        return (a*a);
    }


}

public class AreaOFSquareAndRectangle3 {
    public static void main(String[] args)
     {
        
        Area a=new Area();
        a.printArea(6, 5);
        int c= a.printArea(5);
        System.out.println("Area of Square " +c);
    }
    
}

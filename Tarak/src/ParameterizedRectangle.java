import java.util.Scanner;
class Area1{
    void returnArea(int l, int b)
    {
        int Area=l*b;
        System.out.println("Area of Rectangle in Sq units " +Area) ;
    }
    Area1(int l, int b)
    {
        returnArea(l,b);
    }
   
}
public class ParameterizedRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length & breadth of the Rectangle ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Area1 obj= new Area1(l,b);
        sc.close();
    }
}

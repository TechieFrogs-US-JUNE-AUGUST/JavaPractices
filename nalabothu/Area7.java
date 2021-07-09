import java.util.Scanner;
class Area
{
void returnArea(int l, int b)
    {
        System.out.println("Area of Rectangle " +(l*b)) ;
    }
   void  Area7(int l, int b)
    {
        returnArea(l,b);
    }
}

public class Area7
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of the Rectangle ");
        int l = sc.nextInt();
        System.out.println("Enter Breath of the Rectangle");
        int b = sc.nextInt();
        Area ar= new Area();
        ar.returnArea(l,b);
        sc.close();
    }
}

package Inheritance;
import java.util.Scanner;
class Rectangle
 {
     int length,breath;
    void rectanglearea()
    {
        System.out.println("area of rectangle is :" +(length*breath));
    }
    void rectangleperimeter()
    {
        System.out.println("perimeter of rectangle is: " +2*(length+breath));
    }
    Rectangle(int a,int b)
    {
        this.length=a;
        this.breath=b;
    }
    Rectangle()
    {
    }
}  
    class square extends Rectangle
    {
        square(int s)
        {
            super(s,s);
          System.out.println("area of square is " +(s*s));
           System.out.println("perimeter of sqaure is: " +4*s);
        }
        square()
        {    
        }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("length is " );
        int a= sc.nextInt();
        System.out.print("breath is " );
        int b= sc.nextInt();
        Rectangle Obj= new Rectangle(a, b);
        Obj.rectanglearea();
        Obj.rectangleperimeter();
       System.out.print("side is ");
        int s=sc.nextInt();
        new square(s);
       sc.close();
    }
}
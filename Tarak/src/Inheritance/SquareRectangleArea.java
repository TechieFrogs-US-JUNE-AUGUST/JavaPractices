package Inheritance;

import java.util.Scanner;

class Rectangle{
    int length,breath;
    
    void area(){
        System.out.println("Area   : " +(length*breath));
    }
    void perimeter(){
        System.out.println("Perimeter  : "  + 2*(length+breath));
    }
    Rectangle(int l,int b)
    {
        this.length=l;
        this.breath=b;
        area();
        perimeter();
    }

}
class Square extends Rectangle
{
    Square(int s)
    {
        super(s,s);
    }
}
public class SquareRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle :");
        int len=sc.nextInt();
        System.out.println("Enter Breath Of Rectangle :");
        int bre=sc.nextInt();
        System.out.println("Enter Side of a Square :");
        int ss=sc.nextInt();
        System.out.println("Area and Perimeter of Rectangle :");
        Rectangle r = new Rectangle(len, bre);
        System.out.println("Area and Perimeter of Square :");
        Square s= new Square(ss);
        
    }
}

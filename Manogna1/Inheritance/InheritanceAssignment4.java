package inheritance;

import java.util.Scanner;

class Rectangle{
    int length,breath;
    
    void areaRectangle(){
        System.out.println("Area   : " +(length*breath));
    }
    void perimeterRectangle(){
        System.out.println("Perimeter  : "  + 2*(length+breath));
    }
    Rectangle(int l,int b)
    {
        this.length=l;
        this.breath=b;
        areaRectangle();
        perimeterRectangle();
    }
    Rectangle(){

    }

}
class Square extends Rectangle
{
    Square(int s)
    {
        super(s,s);
    }
    Square()
    {
        
    }
}

public class InheritanceAssignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle :");
        int len=sc.nextInt();
        System.out.println("Enter Breath Of Rectangle :");
        int bre=sc.nextInt();
        System.out.println("Enter Side of a Square :");
        int ss=sc.nextInt();
        System.out.println("Area and Perimeter of Rectangle :" );
        new Rectangle(len, bre);
        System.out.println("Area and Perimeter of Square :");
        new Square(ss);


        sc.close();



        
    }
    
}

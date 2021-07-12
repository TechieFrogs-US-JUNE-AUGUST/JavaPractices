package Interfaces_Assignment;
import java.util.Scanner;

interface RegularPolygon{                   //interface
    abstract int getNumSides();             //abstract methods
    abstract double getSideLength();
}
class EquilateralTriangle implements RegularPolygon{        //subclass with inheritance
    double length;
    EquilateralTriangle(double length){                   //constructor with instance variable
        this.length=length;
    }
   public int getNumSides(){                   //overridden method
        return 3;
    }
   public double getSideLength(){
        return length;
    }
    double getPerimeter(){
        return getNumSides()*length;
    }
    double getInteriorAngle(){
        return (getNumSides()-2)*180;
    }
}
class Square implements RegularPolygon{          //subclass with inheritance
    double side;
    Square(double side){                       //constructor with instance variable
        this.side=side; 
    }
   public int getNumSides(){                //overridden method
        return 4;
    }
   public double getSideLength(){
        return side;
    }
    double getPerimeter(){   
        return getNumSides()*side;
    }
    double getInteriorAngle(){
        return (getNumSides()-2)*180;
    }
}
public class Prog1AAss4{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter length of triangle: ");
        double l=scan.nextDouble();
        System.out.println("Enter side of Square: ");
        double s=scan.nextDouble();

        EquilateralTriangle T = new EquilateralTriangle(l);                 //subclass obj of triangle with parameter
        System.out.println("Number of sides of a triangle: "+T.getNumSides());
        System.out.println("Length of sides of a triangle: "+T.getSideLength());
        System.out.println("Perimeter of the triangle: "+T.getPerimeter());
        System.out.println("Internal angle of a triangle: "+T.getInteriorAngle());

        Square S=new Square(s);                                        //subclass obj of square with parameter
        System.out.println("Number of sides of a Square: "+S.getNumSides());
        System.out.println("Length of sides of a Square: "+S.getSideLength());
        System.out.println("Perimeter of the Square: "+S.getPerimeter());
        System.out.println("Internal angle of a Square: "+S.getInteriorAngle());
    }
}


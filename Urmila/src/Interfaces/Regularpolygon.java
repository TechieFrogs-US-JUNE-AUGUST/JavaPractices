package Interfaces;
import java.util.Scanner;
interface  Regularpolygon {
    abstract int getNumSides();             //abstract methods
    abstract double getSideLength();
}
class EquilateralTriangle implements Regularpolygon{        //inheritance from main class
    double length;
    EquilateralTriangle(double length){                   //constructor with instance variable
        this.length=length;
    }
   public int getNumSides(){                   //overridden 
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
class Square implements Regularpolygon{          //subclass with inheritance
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
 class AddRegularpolygon{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of triangle: ");
        double l=scanner.nextDouble();
        System.out.println("Enter side of Square: ");
        double s=scanner.nextDouble();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(l);                 
        System.out.println("Number of sides of a triangle: "+equilateralTriangle.getNumSides());
        System.out.println("Length of sides of a triangle: "+equilateralTriangle.getSideLength());
        System.out.println("Perimeter of the triangle: "+equilateralTriangle.getPerimeter());
        System.out.println("Internal angle of a triangle: "+equilateralTriangle.getInteriorAngle());

        Square square=new Square(s);                                        
        System.out.println("Number of sides of a Square: "+square.getNumSides());
        System.out.println("Length of sides of a Square: "+square.getSideLength());
        System.out.println("Perimeter of the Square: "+square.getPerimeter());
        System.out.println("Internal angle of a Square: "+square.getInteriorAngle());
    }
}   
package Interface;

import java.util.Scanner;

interface RegularPolygon{
    abstract int getNumSides();
    abstract double getSideLength();
}
class EquilateralTriangle implements RegularPolygon{
    double length;
    EquilateralTriangle(double length){
        this.length=length;
    }
   public int getNumSides(){
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
class Square1 implements RegularPolygon{
    double side;
    Square1(double side){
        this.side=side;
    }
   public int getNumSides(){
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
 class InterfacesAssignment1A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of triangle: ");
        double l=sc.nextDouble();
        System.out.println("enter side of Square: ");
        double s=sc.nextDouble();
        EquilateralTriangle T=new EquilateralTriangle(l);
        System.out.println("number of sides of a triangle: "+T.getNumSides());
        System.out.println("length of sides of a triangle: "+T.getSideLength());
        System.out.println("perimeter of the triangle: "+T.getPerimeter());
        System.out.println("Internal angle of a triangle: "+T.getInteriorAngle());
        Square1 S=new Square1(s);
        System.out.println("number of sides of a Square: "+S.getNumSides());
        System.out.println("length of sides of a Square: "+S.getSideLength());
        System.out.println("perimeter of the Square: "+S.getPerimeter());
        System.out.println("Internal angle of a Square: "+S.getInteriorAngle());
    }
}


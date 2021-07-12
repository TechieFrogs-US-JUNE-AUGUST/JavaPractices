package Interfaces;
interface RegularPolygon{
     int getNumSides(int sides);
     int getSideLength();
     static int  totalSides(int n){
         System.out.print("sum of sides of all the elements\t");
         return n;
     }
    default int  getPerimeter(int length,int n){
         System.out.print("perimeter of a regular polygon\t");
         int perimeter=n*length;
         return perimeter;
    }
    default int getInteriorAngle(int n){
         int interior_angle=(n-2)*n/n;
         System.out.println("interior angle of a regular polygon");
         return interior_angle;
    }
}
class EquilateralTriangle implements RegularPolygon{
    int length;
    EquilateralTriangle(int length){
      this. length=length;
    }
    public int getNumSides(int sides){
        System.out.print("sides of Equilateral triangle\t");
        return sides;
    }
    public int getSideLength(){
        System.out.print("side length of equilateral triangle\t");
        return length;
    }
}
class Square implements RegularPolygon{
    int length;
    Square(int length){
        this.length=length;
    }
    public int getNumSides(int sides){
        System.out.println("number of sides of a square\t");
        return sides;
    }
    public int getSideLength(){
        System.out.println("length of a square:\t");
        return length;
    }
}
public class Interface1 {
    public static void main(String[] args){
        EquilateralTriangle obj =new EquilateralTriangle(7);
        System.out.println("side length and sides of a equilateral triangle:");
       int s= obj.getSideLength();
        System.out.println(s);
        int n=obj.getNumSides(3);
        System.out.println(n);
        System.out.println("side length and sides of a square:");
        Square obj1=new Square(4);
        int l=obj1.getSideLength();
        System.out.println(l);
       int d= obj1.getNumSides(4);
        System.out.println(d);
        System.out.println("total sides of a regular polygon:");
        System.out.println( RegularPolygon.totalSides(6));
        System.out.println("interior angle of a regular polygon:");
        System.out.println(obj.getInteriorAngle(5));
        System.out.println("perimeter of a regular polygon:");
        System.out.println( obj.getPerimeter(4,10));
    }
}

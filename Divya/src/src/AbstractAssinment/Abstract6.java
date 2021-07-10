package AbstractAssinment;
abstract class Shape{
    abstract int  rectangleArea(int length,int breadth);
    abstract int squareArea(int side);
    abstract double circle(double radius);
}
class Area extends Shape{
    int rectangleArea(int length,int breadth){
        int area_of_rect=length*breadth;
        System.out.print("area of Rectangle\t");
        return area_of_rect;
    }
     int squareArea(int side){
        int area_of_square=side*side;
         System.out.print("area of Square\t");
          return area_of_square;
     }
    double circle(double radius){
        double area_of_circle=3.14*radius*radius;
        System.out.print("area of circle\t");
        return area_of_circle;
}
}
public class Abstract6 {
        public static void main(String[] args){
            Area obj=new Area();
         int rec= obj.rectangleArea(3,7);
            System.out.println(rec);
          int s=  obj.squareArea(7);
            System.out.println(s);
          double c=  obj.circle(5);
            System.out.println(c);
        }
}


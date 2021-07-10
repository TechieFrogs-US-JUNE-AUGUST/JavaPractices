import java.lang.Math;
public class TriangleArea {
   static double a=3,b=4,c=5;//sides of a triangle
    public TriangleArea(){       //default constructor

    }
    void getArea(){
        double perimeter=a+b+c;
        double s=(a+b+c)/2 ;    //semi perimeter
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));         //Area of triangle when sides given
        System.out.println("perimeter of a triangle:"+perimeter);
        System.out.println("Area of a triangle:"+area);
    }
    public static void main(String[] args){
        TriangleArea obj1=new TriangleArea();
        obj1.getArea();
    }
}

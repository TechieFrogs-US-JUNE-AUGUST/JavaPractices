import java.lang.Math;
public class TriangleArea1 {
    double a,b,c;
    TriangleArea1(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
        double perimeter=a+b+c;
        double s=(a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("perimeter of triangle="+perimeter);
        System.out.println("Area of a triangle="+area);}
        public static void main(String[] args)
        {
        TriangleArea1 obj1=new TriangleArea1(3,4,5);
    }
}

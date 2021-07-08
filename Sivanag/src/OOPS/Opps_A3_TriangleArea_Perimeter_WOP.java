class Triangle
{
    Triangle()
    {
        int a=3;int b=4;int c=5;
        private int m=20;
        int p=(a+b+c);
        int s =p/2;
        double ar;
        ar= Math.sqrt(s*(s-3)*(s-4)*(s-5));
        System.out.println("Perimeter of Triangle : " +p);
        System.out.println("Area of Triangle : " +ar);
    }
    Triangle(int a,int b ,int c)
    {
        int p=(a+b+c);
        int s =p/2;
        double ar;
        ar= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Perimeter of Triangle : " +p);
        System.out.println("Area of Triangle : " +ar);
    }

}

public class Opps_A3_TriangleArea_Perimeter_WOP
{
 public static void main(String[] args) {
     Triangle tr = new Triangle();


 }

}
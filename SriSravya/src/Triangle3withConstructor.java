public class Triangle3withConstructor{
    double a,b,c;
    double h=3;
    Triangle3withConstructor(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Perimeter of triangle is "  +(a+b+c));
        System.out.println("Area of triangle is "  +(0.5)*b*h);
    }
            public static void main(String[] args){
              Triangle3withConstructor obj=new Triangle3withConstructor(3,4,5);
            }
        }   

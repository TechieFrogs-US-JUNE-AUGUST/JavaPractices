class Triangle1{
   Triangle1(int a,int b,int c){
        int peri=a+b+c;
        int Area=(a*b)/2;
        System.out.println("Perimeter of triangle in units "+peri);
        System.out.println("Area of Triangle in SQ units "+Area);
        }
}
public class ParameterizedTriangle {
    public static void main(String[] args) {
        Triangle1 obj1=new Triangle1(3, 4, 5);
    }
    
}

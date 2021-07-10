package oops;

class Triangle1{
    
 Triangle1 (int a,int b,int c){
        int perimeter = a+b+c;
        int area=(a*b)/2;
        System.out.println("Perimeter of Triangle " +perimeter);
        System.out.println("Area of Triangle " +area);
    }

}

public class TriangleUsingConstructors4 {
    public static void main(String[] args) {
        Triangle1 obj = new Triangle1(3,4,5);
       
    }
    
}

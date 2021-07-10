package oops;

class Triangle{
    int a=3;
    int b=4;
    int c=5;
    Triangle(){
        int perimeter= a+b+c;
        int area= (a*b)/2;
        System.out.println("Perimeter of Triangle is : " +perimeter);
        System.out.println("Area of Triangle is " +area);

    }
 
}
public class AreaAndPerimeter3{
    public static void main(String[] args) {
        Triangle obj =new Triangle();
    } 
}

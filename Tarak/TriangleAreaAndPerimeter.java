class Triangle{
int a=8;
int b=6;
int c=10;
Triangle(){
    int peri=a+b+c;
    int Area=(a*b)/2;
    System.out.println("perimeter of triangle in units "+peri);
    System.out.println("Area of triangle in SQ units "+Area);
}
Triangle(int a,int b,int c){
int peri=a+b+c;
int Area=(a*b)/2;
System.out.println("Perimeter of triangle in units "+peri);
System.out.println("Area of Triangle in SQ units "+Area);
}
}


public class TriangleAreaAndPerimeter {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
    }
    
}

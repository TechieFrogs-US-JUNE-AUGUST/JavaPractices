package Inheritance;
class Rectangle{
    int length;
    int breadth;
    int s;
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    void area(){
        System.out.println("Area of Rectangle:"+(length*breadth));
    }
    void perimeter(){
        System.out.println("perimeter of rectangle:"+2*(length+breadth));
    }
}
class Square extends Rectangle{
    Square(int s){
        super(s,s);
    }
    void area1(){
        System.out.println("Area of square:"+(s*s));
    }
}
public class Areas {
    public static void main(String[] args) {
        Square obj1 = new Square(2);
        Rectangle obj2 = new Rectangle(2, 3);
        obj2.area();
        obj2.perimeter();
        obj1.area1();
        obj1.perimeter();
    }
}
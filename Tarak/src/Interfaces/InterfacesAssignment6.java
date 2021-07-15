package Interfaces;
interface Circle{
    void circleArea();
    void circlePerimeter();
}
interface Rectangle{
    void rectangleArea();
    void rectanglePerimeter();
}
interface Square{
    void squareArea();
    void squarePerimeter();
}
interface NewInterface extends Circle,Rectangle,Square{
}
public class InterfacesAssignment6 implements NewInterface {
    public void circleArea(){
        int radius=5;
        System.out.println("area of circle "+(3.14*radius*radius));
    }
    public void circlePerimeter(){
int radius=5;
System.out.println("perimetr of circle "+(2*3.14*radius));
    }
    public void rectangleArea(){
int length=4;
int breadth=3;
System.out.println("area of rectangle "+length*breadth);
    }
    public void rectanglePerimeter(){
        int length=4;
        int breadth=3;
        System.out.println("perimetr of rectangle "+2*(length+breadth));
    }
    public void squareArea(){
int side=7;
System.out.println("area of square "+side*side);
    }
    public void squarePerimeter(){
        int side=7;
        System.out.println("perimeter of square "+4*side);
    }
    public static void main(String[] args) {
        InterfacesAssignment6 inter=new InterfacesAssignment6();
        inter.circleArea();
        inter.circlePerimeter();
        inter.rectangleArea();
        inter.rectanglePerimeter();
        inter.squareArea();
        inter.squarePerimeter();
    }
}

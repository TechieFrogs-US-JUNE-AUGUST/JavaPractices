package Inheritance;

class Shape {
void shape(){
    System.out.println("This is Shape");
}    
}
class Rectangle extends Shape{
    void rectangleMethod()
    {
        System.out.println("This is Rectangular Shape");
    }
}
class Circle extends Shape{
    void circleMethod(){
        System.out.println("This is Circular Shape");
    }
}
class Square extends Shape{
    void squareMethod(){
        System.out.println("Square is a Rectangle");
    }
   }
class AddShape{
    public static void main(String[] args){
        Square square = new Square();
        square.shape();
        square.rectangleMethod();
    }

}
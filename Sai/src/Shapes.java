class Shape{
    public void printshape(){
        System.out.println("This is Shape");
    }
}
class Rectangle1 extends Shape{
    public void printrectangle(){
        System.out.println("This is Rectangle");
    }
}
class Circle extends Shape{
    public void printcircle(){
        System.out.println("This is Circle");
    }
}
class Square extends Rectangle1{
    public void printsquare(){
        System.out.println("This is Square");
    }
}
public class Shapes{
    public static void main(String[] args){
        Square s = new Square();
        s.printshape();
        s.printrectangle();
    }
}
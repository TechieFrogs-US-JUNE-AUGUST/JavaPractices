abstract class ShapeAbs{  // abstract class with "abstract" key word
    abstract void rectangleArea(int length , int breadth);// abstract methods
    abstract void squareArea(int side);
    abstract void circleArea( double radius);
}
class Areas{  //class to abstract the abstractclass
    int rectangleArea(int length, int breadth){ //getting the value by return type int
        return(length*breadth);  //returing the area 
    }
    int squareArea(int side){
        return(side*4);
    }
    double circleArea(int radius){
        return(3.14*radius*radius);
    }
}
public class Abstract6{   
    public static void main(String[] args){
        Areas a = new Areas();  // instance created
        System.out.println(a.rectangleArea(5,6));//assigining the values and calling the methods for each
        System.out.println(a.squareArea(5));
        System.out.println(a.circleArea(4));
    }
}

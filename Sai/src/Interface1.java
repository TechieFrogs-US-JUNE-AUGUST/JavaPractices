interface Polygon{    // interface
    int getNumSides();   // method with retuntypr int
    double getSideLength();  //method with returntype double
    //static void totalsides(){
    //    System.out.println("The number of sides : ");
    //}
    //default void getPerimeter(){
    //    int p;
    //    System.out.println("Perimeter : "+);
    //}
}
class EquilateralTriangle implements Polygon{ // class Equ..is implementing from interface Polygon
    public int getNumSides(){   //method for number od sides
        return 3;    // returning the number of sides value
    }
    double length;  
    public EquilateralTriangle(double l){  //constructor for length value
        length = l;
    }
    public double getSideLength(){     //returning the length value
        return length;
    }
}
class SquareInterface implements Polygon{  // class Squ..  is implementing from interface Polygon
    public int getNumSides(){  //method for number od sides
        return 4;        // returning the number of sides value
    }
    double length;
    public SquareInterface(double l){  //constructor for length value
        length = l;
    }
    public double getSideLength(){   //returning the length value
        return length;
    }
} 
public class Interface1{
    public static void main(String[] args){
        EquilateralTriangle Obj = new EquilateralTriangle(5);// creating an instances
        SquareInterface Obj1 = new SquareInterface(4);
        System.out.println("Number of sides in Triangle is :"+Obj.getNumSides());// getting the results
        System.out.println("Side length of triangle : "+Obj.getSideLength());
        System.out.println("Number of sides in Square : "+Obj1.getNumSides());
        System.out.println("Side length of Square : "+Obj1.getSideLength());
    }
}// need to finish, still some part to do in this program -- array 
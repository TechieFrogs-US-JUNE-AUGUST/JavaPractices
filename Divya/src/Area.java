import java.util.Scanner;
public class Area {                             // main class
    int length;                                 // declaration of variables
    int breadth;
    Scanner s = new Scanner(System.in);            //creation of a scanner object
    void setDim(int length, int breadth) {         //creation of setDim method
        this.length = length;
        this.breadth = breadth;
    }
    int getArea() {                             //creation of getArea method
        System.out.println("enter length of a rectangle");
        length=s.nextInt();
        System.out.println("enter breadth of a rectangle");
        breadth=s.nextInt();
        return length*breadth;                    //Area of rectangle
    }
    public static void main(String[] args) {
        Area obj1 = new Area();             //creation of an object to given class
        System.out.println("Area of a rectangle="+obj1.getArea());                  // calling getArea method
    }
}
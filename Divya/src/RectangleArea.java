public class RectangleArea {                      // main method
    int length;
    int breadth;                               // variables declaration
    RectangleArea(){}
     RectangleArea(int length,int breadth){       //parametrised constructor
    this.length=length;
    this.breadth=breadth;
}
 void displayArea(){
        System.out.println((length*breadth)) ;
    }
    public static void main(String[] args){
        RectangleArea obj3=new RectangleArea(4,5);
        System.out.println("Area of first rectangle is:");
        obj3.displayArea();
        System.out.println("Area of second rectangle is:");
        RectangleArea obj4=new RectangleArea(5,8);
        obj4.displayArea();
    }
}

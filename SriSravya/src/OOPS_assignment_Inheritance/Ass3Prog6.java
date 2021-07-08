package OOPS_assignment_Inheritance;
class Shape{
    void shape(){
       System.out.println("This is Shape");
    }
}
class Rectangle1 extends Shape{                         //subclass of shape class
    void rectangle(){
        System.out.println("This is Rectangle");
    }
}
class Circle extends Shape{                          //subclass of shape class
    void circle(){
        System.out.println("This is Circle");
    }
}
class Square1 extends Rectangle1{                     //subclass of rectangle class
    void square(){
        System.out.println("Square is rectangle");
    }
}
public class Ass3Prog6 {
    public static void main(String[] args){
     Square1 obj=new Square1();                  //created object of child class square
     obj.shape();                         //calling shape class by using object of square
     obj.rectangle();                     //calling rectangle class by using object of square
    }
}

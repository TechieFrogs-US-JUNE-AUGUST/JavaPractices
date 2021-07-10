package Inheritance;
class Shape{
    void method1(){

        System.out.println("This is shape");
    }
}
class Rectangle1 extends Shape {
    void method2(){
        System.out.println("This is rectangle");
    }
}
class Circle1 extends Shape {
    void method3() {
        System.out.println("this is circle shape");
    }
}
class Square1 extends Rectangle1 {
    void method4(){
        System.out.println("square is rectangle");
    }
}
public class Shapes {
    public static void main(String[] args){
        Square1 obj=new Square1();
        obj.method1();
        obj.method2();
    }
}

package Interfaces;
interface Example{
    int i=2;
    double j=5.6;
    static void method1(){
        System.out.println("static method in interface");
    }
}
class ClassC implements Example{
     void show(){
          //  Example.i=5;
System.out.println(Example.i);
        }
         void method1(){
            Example.method1();
            System.out.println("cannot override the static method ");
        }
        }
public class Interface3 {
    public static void main(String[] args) {
        ClassC obj = new ClassC();
        obj.method1();
        obj.show();
    }
}

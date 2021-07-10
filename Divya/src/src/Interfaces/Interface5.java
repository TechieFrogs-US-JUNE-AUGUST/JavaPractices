package Interfaces;
interface A{
    void method1();
    void method2();
}
interface B{
    void method1();
    void method2();
}
interface C{
    void method1();
    void method3();
}
interface D extends C{
    void show();
}
class E implements D ,B{
    public void method1(){
        System.out.println("method from third interface");
    }
    public void method3(){
        System.out.println("second method from third interface");
    }
    public void show(){
      System.out.println( "show method in new interface");
    }
   public void method2(){
    System.out.println("method from second interface");}
}
public class Interface5 {
    public static void main(String[] args){
        E obj=new E();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.show();
    }
}

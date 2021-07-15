package Interfaces;
interface Package1{
    void method1();
    void method2();
    void method3();
}
class ClassA implements Package1{
    public void method1(){
        System.out.println("first interface method");
    }
    public void method2(){
        System.out.println("second interface method");
    }
    public void method3(){
        System.out.println("Third interface method");
    }
}
public class Interface2 {
    public static void main(String[] args){
        ClassA obj=new ClassA();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}

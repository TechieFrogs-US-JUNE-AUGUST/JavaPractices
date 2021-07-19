package Interfaces;

interface  Packages {
    void method1();
    void method2();
    void method3();
}
class ClassA implements Packages{
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
 class AddPackages{
    public static void main(String[] args){
        ClassA classa = new ClassA();
        classa.method1();
        classa.method2();
        classa.method3();
    }
}
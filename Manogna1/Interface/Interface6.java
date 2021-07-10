package Interface;
interface A{
    void a1();
    void a2();
}
interface B{
    void b1();
    void b2();
}
interface C{
    void c1();
    void c2();
}
interface D extends A,B,C{
    void d1();
}
class Class {

}
class Class1 extends Class implements D{

    public void a1() {
        System.out.println("a1");
    }

    public void a2() {
    System.out.println("a2");
    }

    public void b1() {
        System.out.println("b1");
    }

    public void b2() {
        System.out.println("b2");
    }

    public void c1() {
        System.out.println("c1");
    }

    public void c2() {
        System.out.println("c2");
    }

    public void d1() {
        System.out.println("d1");
    }
    
}

public class Interface6 {
    public static void main(String[] args) {
        Class1 classObj=new Class1();
        classObj.a1();
        classObj.a2();
        classObj.b1();
        classObj.b2();
        classObj.c1();
        classObj.c2();
        classObj.d1();
    }
    
}

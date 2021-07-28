package Interface;
interface A
{
    void a();
    void b();
}
interface B
{
    void c();
    void d();
}
interface C
{
    void e();
    void f();
}
interface D extends A,B,C
{
    void g();
}
class Class {  }
class Class1 extends Class implements D
{
    public void a() 
    {
        System.out.println("in method a");
    }
    public void b()
    {
    System.out.println("in method b");
    }
    public void c () 
    {
        System.out.println("in method c");
    }
    public void d () {
        System.out.println("in method d");
    }
    public void e() 
    {
        System.out.println("in method e");
    }
    public void f () {
        System.out.println(" in method f");
    }
    public void g () {
        System.out.println("in method g");
    }
}
public class interface6 
{
    public static void main(String[] args) 
    {
        Class1 classObj=new Class1();
        classObj.a();
        classObj.b();
        classObj.c();
        classObj.d();
        classObj.e();
        classObj.f();
        classObj.g();
    }
}

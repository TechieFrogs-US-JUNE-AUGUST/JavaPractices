package Interfaces;

/**
 * package1I
 */
public interface package1I {

    
} ClassA1
{
void method1();
}
class ClassB implements ClassA1{
public void method1()
{
    System.out.println("first interface method");
}
}
class Addinterfaceprotected
{
public static void main(String[] args)
{
    ClassA1 classa1 = new ClassA1();
    classa1.method1();
}
}
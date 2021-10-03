package src.OOPS.Abstract_Assignment;

//package Interfaces;
abstract class Abstractclass
{
    abstract void a_method();
    void b_method()
    {
        System.out.println("This is a Normal method of Abstract class");
    }

    Abstractclass()
    {
        System.out.println("This is a Constructor of Abstract class");
    }
}
class subclassab extends Abstractclass
{
   
    void a_method()
    {
        super.b_method();
        System.out.println("This is a Abstract method");
    }

}

public class Abstract_Assignment4 {
    public static void main(String[] args) {
        subclassab objsub =new subclassab();
        objsub.a_method();
    }
    
}

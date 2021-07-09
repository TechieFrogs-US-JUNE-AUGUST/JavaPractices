package Abstractclass;

abstract class Parent{
    void message(){

    }
}
class SubClass1 {
    void message(){
        System.out.println("This is First Subclass");

    }
}
class Subclass2 {
    void message(){
        System.out.println("This is Second Subclass");
    }
}

public class AbstractAssignment1 {
    public static void main(String[] args) {
        SubClass1 subclassobj=new SubClass1();
        Subclass2 subclassobj2=new Subclass2();
        subclassobj.message();
        subclassobj2.message();
    }
    
}

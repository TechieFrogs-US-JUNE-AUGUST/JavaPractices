package Abstractclass;

abstract class Class{
    Class(){
        System.out.println("This is Constructor of Abstract Class");

    }
    abstract void a_method();
    void myMethod()
    {
        System.out.println("This is Normal method of Abstract class");
    }

}
class SubClass extends Class{
    /*SubClass(){
        System.out.println("Constructor of SubClass");
    }*/

  
    void a_method() {
        
        System.out.println("This is Abstract Method");
        
    }
    
    
}

public class AbstractAssignment4 {
    public static void main(String[] args) {
        SubClass subclass=new SubClass();
        subclass.a_method();
        subclass.myMethod();
    }
    

}

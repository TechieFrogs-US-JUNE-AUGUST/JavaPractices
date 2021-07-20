package Abstractclasses;

abstract class abstractclass { 
    abstractclass(){
        System.out.println("This is constructor of abstract class");
    }  abstract void a_method();
    void method(){
        System.out.println("This is normal method of abstract class");
    }
}
class SubClass extends abstractclass{// creating subclass
    void a_method() {
        System.out.println("This is abstract method");
    }
}
 class Addabstractclass {
    public static void main(String[] args) {
        SubClass subclass=new SubClass();
        subclass.a_method();
        subclass.method();
    }
}
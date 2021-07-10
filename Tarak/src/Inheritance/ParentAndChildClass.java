package Inheritance;
class Parent{
    void parent(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{
    void child(){
        System.out.println("This is child class");
    }
}
public class ParentAndChildClass {
    public static void main(String[] args) {
        Parent obj1=new Parent();
        Child obj2=new Child();
        obj1.parent();
        obj2.child();
        obj2.parent();
    }
}

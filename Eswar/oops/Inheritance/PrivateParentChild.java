package oops.Inheritance;
  class Parent1{
    private void parent(){
        System.out.println("This is parent class");
    }
}
class Child1 extends Parent1{
    void child(){
        System.out.println("This is child class");
    }
}
public class PrivateParentChild {
    public static void main(String[] args) {
        Parent obj1=new Parent();
        Child obj2=new Child();
        obj1.parent();
        obj2.child();
    }
}

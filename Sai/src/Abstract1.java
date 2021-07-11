abstract class Parent1{ // abstarct class
    void message(){}    // abstract method does not have body
}
class Child1 extends Parent1{//subclass is inherted from superclass
    void message(){
        System.out.println("This is from Child1 Class");
    }
}
class Child2 extends Parent1{
    void message(){
        System.out.println("This is from Child2 class");
    }
}
public class Abstract1{
    public static void main(String[] args){
        Child1 c1 = new Child1(); // creating instances for both subclasses
        Child2 c2 = new Child2();
        c1.message(); //calling particular method by the object name
        c2.message();
    }
}
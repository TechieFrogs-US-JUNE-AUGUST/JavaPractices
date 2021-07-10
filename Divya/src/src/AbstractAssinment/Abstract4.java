package AbstractAssinment;
abstract class SuperClass{
    SuperClass(){
        System.out.println("this is abstract constructor");
    }
    abstract void a_method();
    void nonAbsMet(){
        System.out.println("this is normal method in abstract class");
    }
}
class ClassA extends SuperClass{
    void a_method(){
        System.out.println("this is abstract method");
    }
}
public class Abstract4 {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.a_method();
        obj.nonAbsMet();
    }
}

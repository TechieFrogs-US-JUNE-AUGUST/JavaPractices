package AbstractClass;
abstract class Class1{
    Class1(){
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void method(){
        System.out.println("This is normal method of abstract class");
    }
}
class SubClass extends Class1{
    void a_method() {
        System.out.println("This is abstract method");
    }
}
public class Assignment4 {
    public static void main(String[] args) {
        SubClass s=new SubClass();
        s.a_method();
        s.method();
    }
}

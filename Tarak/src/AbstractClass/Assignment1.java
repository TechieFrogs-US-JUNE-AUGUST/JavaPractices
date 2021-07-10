package AbstractClass;
abstract class Parent{
   abstract void message();
}
class SubClass1 extends Parent{
    void message(){
        System.out.println("This is first subclass");
    }
}
class SubClass2 extends Parent{
    void message(){
        System.out.println("This is second subclass");
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        SubClass1 s1=new SubClass1();
        SubClass2 s2=new SubClass2();
        s1.message();
        s2.message();
    }
}

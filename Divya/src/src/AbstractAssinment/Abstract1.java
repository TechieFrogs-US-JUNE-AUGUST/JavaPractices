package AbstractAssinment;
abstract class Parent{
    abstract void message();
}
class A extends Parent{
     void message(){
          System.out.println("this is first sub class");
     }
}
class B extends Parent{
     void message(){
          System.out.println("This is second sub class");
     }
}
public class Abstract1 {
     public static void main(String[] args){
          A obj1=new A();
          obj1.message();
          B obj2=new B();
          obj2.message();
     }
}

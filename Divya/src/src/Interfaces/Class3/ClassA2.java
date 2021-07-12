package Class3;
import Class2.ClassA;
public class ClassA2 extends ClassA {
    public void method1(){
        System.out.println("method from interface");
    }
    public static void main(String[] args){
        ClassA2 obj=new ClassA2();
        obj.method1();
    }
}

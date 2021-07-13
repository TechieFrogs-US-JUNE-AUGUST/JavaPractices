package Class2;
import Interfaces.InterfaceNew;
public class ClassA {
    protected class InnerClass implements InterfaceNew{
        public void method1(){
            System.out.println("method from interface of package 1");
        }
    }
}


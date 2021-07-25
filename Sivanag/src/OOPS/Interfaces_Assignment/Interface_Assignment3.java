

public class Interface_Assignment3 implements pack2.Interface_Assignment3

{
    public void method1()
    {
        System.out.println("Interface_Method1");
    }
    public void method2()
    {
        System.out.println("Interface_Method2");
    }
    public void method3()
    {
        System.out.println("Interface_Method3");
    }
    public static void main(String[] args) {
        Interface_Assignment3 obji3 = new Interface_Assignment3();
        obji3.method1();
        obji3.method2();
        obji3.method3();
        System.out.println("Print Static final variable " +Interface_Assignment3.h);
        
    }

}

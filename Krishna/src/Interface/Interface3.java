package Interface;

interface Interface{
    void Method1();
    void Method2();
    void method3();
}
public class Interface3 implements Interface
{
    public void Method1()
    {
     System.out.println("hi ");   
    }
    public void Method2() 
    {
        System.out.println("hi hi ");          
    }
    public void method3() 
    {
        System.out.println("hi  hi hi");  
    }
    public static void main(String [ ] args)
    {
        Interface Obj=new Interface3();
        Obj.Method1();
        Obj.Method2();
        Obj.method3();
    }
}
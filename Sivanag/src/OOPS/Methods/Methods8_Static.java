package Methods;

class ClassA
{
    static void method()
    {
        System.out.println("Parent");
    }

}
class ClassB extends ClassA
{
    static void method()
    {
        System.out.println("Child"); 
    }
}


public class Methods8_Static {
    public static void main(String[] args)
    {
        ClassA.method();
        ClassB.method();
        ClassA obja = new ClassA();
        ClassB objb = new ClassB();
        obja.method();
        objb.method();
        ClassA objab =new ClassB();
        objab.method();


    }
    
}

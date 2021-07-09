public class AbstractAssignment4 
{
    public static void main(String[] args)
    {
        Data d=new Data();
        d.a_Method();
        d.a_Method();

    }
    
}

 abstract class Data1
{
    Data1()
    {
        System.out.println("this is constructor of abstract class");
    }
    abstract void a_Method();
public void a_Method()
    {
        System.out.println("this is normal method of abstract class");
    }
}


 class Data extends Data1
{
    public void a_method()
    {
        System.out.println("this is abstract method");

    }
}



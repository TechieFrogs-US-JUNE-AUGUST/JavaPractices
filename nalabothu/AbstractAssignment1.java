import java.util.Scanner;
abstract class parent
{
    abstract void message();
    }
class Subclass1 extends parent
{
    public void message()
    {
        System.out.println("thid id first subclass");
    }
}

class Subclass2 extends parent
{
    public void message()
    {
        System.out.println("this is second subclass");
    }
}
public class AbstractAssignment1
 {
     public static void main(String[] args)
     {
         Subclass1 obj1=new Subclass1();
         Subclass2 obj2=new Subclass2();
         obj1.message();
         obj2.message();
         }
}


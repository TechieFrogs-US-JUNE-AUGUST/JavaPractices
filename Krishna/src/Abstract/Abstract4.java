package Abstract;
abstract class Class
{
    Class()
    {
        System.out.println("This is constructor of abstract class");
    }
 abstract void a_method();
 void method( )
 {
    System.out.println("This is normal method of abstract class");   
 }
}
class SubClass extends Class
{
    void a_method()
    {
        System.out.println("This is abstract method");
    }
}
public class Abstract4 
{
    public static void main(String[ ] args) 
    {
        SubClass Obj = new SubClass();
        Obj.a_method();
        Obj.method();
    }  
}
package Abstract;

abstract class Parent
{
    void message()
    { }
}
class child1 extends Parent{
    void message()
    {
        System.out.println("This is first subclass: ");
    }
}
class child2 extends Parent{
    void message()
    {
        System.out.println("This is first subclass: ");   
    }
}
public class ParentAbstract1 {
    public static void main(String[ ] args)
    {
        child1 Obj1= new child1();
        child2 Obj2 = new child2();
        Obj1.message();
        Obj2.message();
    }
}
package oops.Interfaces;
abstract class Parent
{
   void message()
   {
    System.out.println("abstract class");
   }
//    abstract void message();
}
class child1 extends Parent
{
    void message()
    {
        super.message();
        System.out.println("This is first subclass");
       
    }

}
class child2 extends Parent
{
    void message()
    {
        System.out.println("This is Second subclass");
    }

}

public class Abstract_Assignment1
{
    public static void main(String[] args) {
        child1 objchild1 = new child1();
        child2 objchiild2 = new child2();
       
        objchild1.message();
        objchiild2.message();
    }
    

    
}
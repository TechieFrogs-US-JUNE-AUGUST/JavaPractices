package Methods;

    class A
    {
      static  void display()
        {
            System.out.println("Parent");
        }
    }
    class B extends A
    {
      static  void display()
        {
            System.out.println("Child");
        }
    }    
public class Parent{
    public static void main(String[ ] args)
        {
            A.display();
            //A Obj = new B();
            B.display();
        }
}

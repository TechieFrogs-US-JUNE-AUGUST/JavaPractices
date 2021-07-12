interface Interface8
{
    void methodInterface();
}
public class Interface_Assignment8
{
    
      public void method1()
    {
        innerclass15 obb= new innerclass15();
        obb.methodInterface();
   
}
class innerclass15 implements Interface8
{
    public void methodInterface()
    {
        System.out.println("Method inside Innerclass");
    }

}
public static void main(String[] args)
{
    Interface_Assignment8 obj8 = new Interface_Assignment8();
    //Interface_Assignment8.innerclass15 ob = obj8.new innerclass15();

    
    obj8.method1();
}

}

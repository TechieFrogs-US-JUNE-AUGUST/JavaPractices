public class InterfaceAssignment5 {
    public static void main(String[] args)
    {
        Sandwich s=new Sandwich();
        s.noodles();
        s.burgers();
    }
    
}
interface Fastfood
{
    abstract void noodles();
    abstract void burgers();
}
 class Sandwich implements Fastfood
{
    public void noodles()
    {
System.out.println("we have noodles");
    }
    public void burgers()
    {
        System.out.println("we have burgers too");
    }

}


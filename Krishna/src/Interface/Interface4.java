package Interface;
interface Prove
{
    int x=10;                                 // by default it takes as public static final(public Static final int x=10)
    // final int y;                         // blank final fileds maynot be  be initialized 
    public int z=100;                     //(public Static final int z=100)
    static void method()
    {
        System.out.println("hi ");
    }
}
public class Interface4 implements Prove        // implementing the interface
{
    public static void main(String[] args) 
    {
        System.out.println(x);
        Prove.method();                      // accesing the method from the interface itself.
        System.out.println(Prove.z); 
        int z=200;
         System.out.println(z);  
    }
}
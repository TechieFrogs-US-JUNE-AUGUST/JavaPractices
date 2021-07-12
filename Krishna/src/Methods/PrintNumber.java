package Methods;
public class PrintNumber 
{
    static int printn(int a)                                              // method overloading.
    {
    System.out.println("a is of int data type ");
    return a;
    }
    static float printn(float b)
    {
        System.out.println("b is of float data type " );
        return b;
    }
    static double printn(double c){
        System.out.println("c is double data type ");
    return c;
    }    
    public static void main (String[] args)
    {
      System.out.println(printn(2)); 
      System.out.println(printn(2.35f));
      System.out.println(printn(5.02255d));
    }
}

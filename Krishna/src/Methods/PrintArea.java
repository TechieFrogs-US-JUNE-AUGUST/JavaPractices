package Methods;
public class PrintArea 
{
   void printn(int l, int b)
   {
       System.out.println("area of rectangle is " +(l*b));
   }
   void printn(int s)
   {
    System.out.println(" area of square is " +(s*s));
   }
public static void main (String[] args)
    {
        PrintArea Obj = new PrintArea();
        Obj.printn(2, 3);
        Obj.printn(2);
    }
}
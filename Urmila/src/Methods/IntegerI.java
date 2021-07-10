package Methods;
public class IntegerI{
   int i;
   public void PrintNUm()
   {
       System.out.println(i);
   } 
}
 class IntegerJ extends IntegerI
    {
    int j;
    public void PrintNum(){
        System.out.println(j);
    }
 }
 class AddIntegerI{

public static void main(String[] args)
{
    IntegerJ integerj = new IntegerJ();
    integerj.i =12;
    integerj.j = 14;
    integerj.j=integerj.i;
    integerj.PrintNum();
}
 }
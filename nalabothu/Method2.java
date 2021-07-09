
import java.util.Scanner;
public class Method2
{
    public static void printn(int a,char b)
    {System.out.println("given values are"  +a  +b);
}
public static void printn(char a,int b)
{
    System.out.println("given values are" +a +b);
    }
    public static void main(String[] args)
    {
        Method2 obj=new Method2();
        obj.printn(5,'n');
        obj.printn('n',6);

    }
}
    
    


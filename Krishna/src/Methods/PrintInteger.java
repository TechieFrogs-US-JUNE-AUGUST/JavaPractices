package Methods;
public class PrintInteger 
{
      void printn(int a, char c)
      { 
       System.out.println(a+ " " +c);
      }
      void printn(char c,int a)
      {
        System.out.println(c+ " " +a);
      }
    
    public static void main (String[] args)
    {
        PrintInteger Obj = new PrintInteger();
        Obj.printn(2, 'n');
        Obj.printn('n',2);
    }
  }
public class Inheritence7
{
    int i;
   public static void main(String[] args)
   {
       Inheritence7 obj=new Inheritence7();
       obj.Increment(1);
       Counter obj2=new Counter();
       obj2.Increment(1);
      }
      
    
    public void Increment(int i)
        {
            System.out.println(i);
        }
    }
    class Counter extends Inheritence7
    {
        
        public void Increment(int i)
            {
                i=i+2;
                System.out.println(i);
            }
           
        


    }

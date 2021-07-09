abstract class Animals
{
    abstract void cat();


    abstract void dog();
}

class Cats extends Animals 
{
    public void cat()
    {
        System.out.println("cats meow");
    }
}
class Dogs extends Animals{
    public void dog()
    {
        system.out.println("dogs bark");
    }
}
public class AbstractAssignment5
 {
     public static void main(String[] args)
     {
         Animals c=new Cats();
         c.cat();
         Animals d=new Dogs();
         d.dog();
     }
    
}

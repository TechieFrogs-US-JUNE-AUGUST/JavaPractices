package Interface;

interface one                                                          //interface
{
    void onemethod();
}
class two implements one
{
    class innerclass                                                  //inner class of interface one 
    {
        void innermethod()                                            // method of innerclass
        {
            System.out.println("this is inner class inner method");
        }
    }
    public void onemethod() 
    {
      System.out.println("onemethod is method of interface one ");       
    }
}
public class Interface8 
{
    public static void main(String[] args) 
    {
        two Obj = new two();
        Obj.onemethod();
        two.innerclass Obj1= Obj.new innerclass();                     //creating instance for innerclass.
        Obj1.innermethod();
    }
}
package Interface;

interface FastFood
{
    void hotdogs();
    void pizza();
}
 class Sandwich implements FastFood
{
    public void hotdogs()
    {
        System.out.println(" method hotdogs");
        System.out.println("hi");
    }
    public void pizza()
    {
        System.out.println("pizza");
    }
public static void main(String [] args) 
    {
        Sandwich Obj=new Sandwich();
        Obj.hotdogs();
        Obj.pizza();
    }
}
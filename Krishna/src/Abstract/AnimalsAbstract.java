package Abstract;
abstract class Animals
{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals
{
    void cats()
    {
        System.out.println("Cats meow");
    }
    void dogs()
    {}
} 
class Dogs extends Animals
{
    void cats()
    { }
     void dogs() 
     {
        System.out.println("Dogs bark");
     }
}
public class AnimalsAbstract 
{
    public static void main(String [] args)
    {
        Cats Obj= new Cats();
            Obj.cats();
        Dogs Obj1= new Dogs();
            Obj1.dogs();
    }    
}
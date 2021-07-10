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
}
class Dogs extends Animals
{
    void dogs()
    {
        System.out.println("Dogs bark");
    }

}
public class Abstract_Assignment5
{
    public static void main(String[] args) {
        Cats objcats = new Cats();
        Dogs objdogs = new Dogs();
        objcats.cats();
       // objcats.dogs();
        objdogs.dogs();
        //objdogs.cats();
    }

}
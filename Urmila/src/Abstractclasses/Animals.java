package Abstractclasses;

abstract class Animals {
    abstract void cats();
    abstract void dogs();


}
class Cats extends Animals// (inherits from main class Animals)
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
 class AddAnimals
{
    public static void main(String[] args) {
        Cats cats = new Cats();
        Dogs dogs = new Dogs();
        cats.cats();
        dogs.dogs();
    } 
}

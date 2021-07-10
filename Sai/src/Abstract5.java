abstract class Animals{   // abstract class
    abstract void cats(); // abstract method
    abstract void dogs();  //abstract method
}
class Cats extends Animals{  //Cats class is inherited from Class Animals
    void cats(){
        System.out.println("Cats Meow");
    }
    void dogs(){}; // in subclass we need to define all the abstract methods from abstract class
}
class Dogs extends Animals{  //Dogs class is inherited Class Animals
    void dogs(){
        System.out.println("Dogs Bark");
    }
    void cats(){}; // in subclass we need to define all the abstract methods from abstract class
}
public class Abstract5{
    public static void main(String[] args){
        Cats c= new Cats();   // creating an object for cats subclass
        Dogs d = new Dogs();  // creating an object for dogs subclass
        c.cats(); // calling the cats method
        d.dogs();  // calling the dogs method
    }
}
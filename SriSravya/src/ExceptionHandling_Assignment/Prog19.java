//CLASSCAST EXCEPTION
//String "1" can be casted to an int, but String "abc" cannot be casted to an int
package ExceptionHandling_Assignment;

class Animal{
    public void eat(String s){
        System.out.println("Eats Grass");
    }
}

class Goat extends Animal{                               //using inheritance
   public void eat(String s){
       System.out.println("Goat eats Grass");
   }     
}

class Dog extends Goat{                                     //here we get ClassCastException because Dog cannot extend Goat but Dog can extend Animal
    public void eat(String s){
        System.out.println("Dog doesn't eat grass");
    }
}
public class Prog19 {
    public static void main(String[] args) {
        Animal obj= new Animal();                       //creating an instance
        obj.eat("Using obj");
        Dog obj2= (Dog) new Goat();                     //we cannot create an instance of Dog class using Goat

    }
}

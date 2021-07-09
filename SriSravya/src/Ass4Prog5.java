abstract class Animals{               //abstract class
    abstract void Cats();             //abstract method
    abstract void Dogs();
}
 class Cats extends Animals{            //inheritance
    public void Cats(){
       System.out.println("Cats Meow");
    }
                             //need to override both the abstract methods
   public void Dogs() {
        
    }
}
 class Dogs extends Animals{
     public void Dogs(){
         System.out.println("Dogs Bark");
     }
                                 //need to override both abstract methods
    public void Cats() {

    }
 }
public class Ass4Prog5 {
    public static void main(String[] args){
        Cats obj1=new Cats();               //instance created for subclass cats
        Dogs obj2=new Dogs();
        obj1.Cats();                       //calling the method using obj
        obj2.Dogs();
    }
}

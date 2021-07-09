package Abstractclass;
abstract class Animals{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals{

   
    void cats() {
        System.out.println("Cats Meow");
        }
     void dogs() { 

    }
    
}
class Dogs extends Animals{
    void cats(){

    }
    void dogs(){
        System.out.println("Dogs Bark");
    }
}

public class AbstractAssignment5 {
    public static void main(String[] args) {
        Cats cat=new Cats();
        Dogs dog=new Dogs();
        cat.cats();
        dog.dogs();
        
    }
    
}

package AbstractAssinment;
abstract class Animals{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals{
    void cats(){
        System.out.println("cats meow");
    }
    void dogs(){
        System.out.println("Dogs bark");
    }
}
class Dogs extends Animals{

    void cats(){
        System.out.println("cats meow");
    }
    void dogs(){
        System.out.println("Dogs bark");
    }
}
public class Abstract5 {
    public static void main(String[] args){
        Cats obj=new Cats();
        obj.cats();
        Dogs obj1=new Dogs();
        obj1.dogs();
    }
}

package AbstractClass;
abstract class Animals{
abstract void cats();
abstract void dogs();
}
class Cats extends Animals{
    void cats(){
        System.out.println("cats meow");
    }
    void dogs(){}
}
class Dogs extends Animals{
    void cats(){}
    void dogs(){
        System.out.println("dogs bark");
    }
}
public class Assignment5 {
    public static void main(String[] args) {
        Cats c=new Cats();
        Dogs d=new Dogs();
        c.cats();
        d.dogs();
    }
}

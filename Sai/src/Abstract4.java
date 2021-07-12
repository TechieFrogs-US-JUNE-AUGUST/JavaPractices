abstract class AbstractAll{ // abstract class
    AbstractAll(){   //constructor
        System.out.println("This is Constructor of Abstract Class");
    }
    abstract void a_method(); // abstract method doesnt have a body
    void nonAbstract(){ // normal method, so it can have body
        System.out.println("This is a normal method of Abstract Class");
    }
}

class SubAbstractAll extends AbstractAll{//inheriting the abstract class
    void a_method(){
        System.out.println("This is Abstract Method");
    }
}
public class Abstract4{
    public static void main(String[] args){
        SubAbstractAll s = new SubAbstractAll();
        s.a_method();
        s.nonAbstract();
    }
}
abstract class AbstractClass{
    AbstractClass(){                        //constructor
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();                          //abstract method
    void non_abstract(){                               //normal method
        System.out.println("This is normal method of abstract class");
    }
}
class SubClass extends AbstractClass{             //normal class
    void a_method(){                              //abstract method of abstract class
        System.out.println("This is abstract method");
    }
}
public class Ass4Prog4 {
    public static void main(String[] args){
        SubClass obj=new SubClass();             //instance of subclass
        obj.a_method();                          //calling method
        obj.non_abstract();
    }
}

package Interfaces_Assignment;

interface Interface{                                         //interface
    void method();                                           //abstract method
}
class parentClass implements Interface{                             //subclass with inheirtance
    class Innerclass{                                               //innerclass of subclass  
        void innermethod(){                                         //innermethod of subclass
            System.out.println("This is inner method of innerclass");
        }
    }
    public void method() {                                            //overridden method
        System.out.println("This is overridden method of interface");   
    }
  }
public class Prog8Ass4 {
    public static void main(String[] args) {
        parentClass obj=new parentClass();
        obj.method();
        parentClass.Innerclass innerobj=obj.new Innerclass();        //creating instance for the innerclass
        innerobj.innermethod();                                     //calling innerclass method with an innerobj
    }
}

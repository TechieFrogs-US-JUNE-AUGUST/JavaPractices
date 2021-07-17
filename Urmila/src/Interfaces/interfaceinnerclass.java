package Interfaces;

public interface interfaceinnerclass{                                         
    void method();                                           //abstract method
}
class ParentClass implements interfaceinnerclass{                             //subclass with inheirtance
    class Innerclass{                                               //innerclass of subclass  
        void innermethod(){                                         //subclass innermethod
            System.out.println("This is inner method of innerclass");
        }
    }
    public void method() {                                            //overridden 
        System.out.println("This is overridden method of interface");   
    }
  }
 class Addinterfaceinnerclass {
    public static void main(String[] args) {
        ParentClass parentclass =new ParentClass();
        parentclass.method(); //creating innerclass instance
        ParentClass.Innerclass innerclass = parentclass.new Innerclass();  // calling innerclass      
        innerclass.innermethod();                                     
    }
}
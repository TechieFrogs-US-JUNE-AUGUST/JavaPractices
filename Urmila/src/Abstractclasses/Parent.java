package Abstractclasses;

abstract class Parent{  // Abstract method(does not have a body)
     abstract void message();// declaring fiels and methos
}
    class Subclass1 extends Parent{// subclass (inherit from Parent)
        void message(){  // The body of message() is provided here
            System.out.println("This is first subclass");
        }
    }
    class Subclass2 extends Parent{ //subclass (inherit from Parent)
        void message(){ 
            System.out.println("This is second subclass");
        }
    }
class AddParent{
    public static void main(String[] args){
        Subclass1 subclass1 = new Subclass1();//creating a subclass object 
        Subclass2 subclass2 = new Subclass2();//access the method of abstract class using object of main class
        subclass1.message();
        subclass2.message();
    }
}
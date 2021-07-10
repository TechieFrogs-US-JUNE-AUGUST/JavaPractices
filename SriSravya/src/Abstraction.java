class newClass extends Abstraction{                   //to use instance we need inheritance
    void demo(){
        System.out.println("Mydemo");
    }
    void message(){                                     
        System.out.println("In message with inheritance");       //overridden message method from abstract class
    }  

    void example() {                     //we need to implement all the abstract methods defined in abstract class
        System.out.println("Example");     
    }
  //  void staticMethod(){             //we cannot override static method in abstract class
   // }
    void finalMethod(){                     //we can override final method
        System.out.println("overriding final method");
    }
}



//class myDemo extends newClass{         //provides pure inheritance
    class myDemo extends NewAbstractClass{   //we need to now implement the abstract methods of newAbstractClass here
    myDemo(){
        System.out.println("myDemo constructor");
    }
  
    void newAbsMethod() {     
    }

    void example() {     
    }
}



abstract class NewAbstractClass extends Abstraction{     //we can use another abstract class with inheritance
                            // to instantise this newabsractclass we need to create new superclass and use that class obj
abstract void newAbsMethod();
void show(){
    System.out.println("In show method");
  }
}

public abstract class Abstraction{                //must have abstract class if we define 'abstract'
    abstract void example();                 //abstract method doesn't have body and all abstract methods should be overridden
    //private abstract void example();  // we cannot give private to abstract methods..we can give public,default,protected
    int i=5;

    void message(){                          //abstract class can also have normal methods
        System.out.println("Message");
    }
    private final void finalMethod(){        //we can give private to normal methods in abstract class
        System.out.println("Final");
    }
    static void staticMethod(){
        System.out.println("static method");
    }
    public static void main(String[] args) {
        System.out.println("Hi");
     //   Abstraction obj=new Abstraction();           //we cannot instantise the abstract class
     // newClass obj1=new newClass();            //need to use another subclass with inheritance and instantise the subclass obj
       myDemo obj2=new myDemo();
      // obj2.demo();
      // obj2.message();
     //obj1.demo();
     // obj1.message();
      //obj1.example();
      //obj1.finalMethod();
     // obj2.finalMethod();
      Abstraction.staticMethod();           //we need to call static method with using 'classname.methodname'
     // obj1.i;
    }
}
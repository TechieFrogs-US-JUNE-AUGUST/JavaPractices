//public interface Interfaces {         //we can create directly interfaces without class
 //   void display();              //all methods are abstracts but from java 8 we have default implementation
    //abstract void display        //all methods in interfaces are by default abstract, so no need to give abstract keyword again
    //public void display         //all methods are public by default 
    //public abstract void display();       //compiler will take like this even if we dont give public,abstract
  //  public static final int i=5;
  //  int i=5;
// }

/*  public class Interfaces implements newAbsMethod,newPractice{
public void display(){                           //display method should be implemented here otherwise it throws error
    System.out.println("Display method");
 }
 public void example(){
     System.out.println("example method from newpractice interface");
 }
 public static void main(String[] args) {
    Interfaces obj=new Interfaces();
    obj.display();
   System.out.println(newAbsMethod.i+" " +newPractice.i); //i type is static so we need to access it by giving 'class name.i'
 }
}     */




//MULTIPLE INHERITANCE
/* abstract class Interfaces2 implements newAbsMethod,newPractice{      //  if we dont want any implementation we can give abstract because abstract doesn't have method body
abstract void message();
}

interface newInterface{                          //we can write interface inside the class same like subclass 
    void newMethod();
}

//public class Interfaces extends Interfaces2{         //main class extends abstract class and then implements multiple interface methods
    public class Interfaces extends Interfaces2 implements newInterface{      //we can extend and implement at the sametime
    void message(){
     System.out.println("Message from abstract");
    }
    public void display(){               //we need to give public as we are overriding it from interface from the file newpractice
     System.out.println("Display from interface");
    }
    public void example(){
     System.out.println("Example from interface");
    }
    public void newMethod(){
        System.out.println(("newmethod from new interface"));
    }
    public static void main(String[] args) {
        Interfaces obj=new Interfaces();             //we can create obj for the main class interfaces
        obj.display();
        obj.example();
        obj.message();  
        obj.newMethod();     
   }
}    */



/*abstract class Interfaces2 implements newAbsMethod,newPractice{     
abstract void message();
}

interface newInterface{            
    void newMethod();
}

interface newInterface2 extends newInterface,newPractice{       //A interface can extend multiple interfaces
    void Hello();                               //A interface need not implement interfaces..Implements is b/w Class and Interface
}

//public class Interfaces extends Interfaces2{        //A class can extend only one class while A class can implement multiple interfaces
    public class Interfaces extends Interfaces2 implements newInterface2{       
    void message(){
     System.out.println("Message from abstract");
    }
    public void display(){               //we need to give public as we are overriding it from interface from the file newpractice
     System.out.println("Display from interface");
    }
    public void example(){
     System.out.println("Example from interface");
    }
    public void newMethod(){
        System.out.println("newmethod from new interface");
    }
    public void Hello() {
       System.out.println("Hello from newInterface2"); 
    }   
    public static void main(String[] args) {
        Interfaces obj=new Interfaces();             //we can create obj for the main class interfaces
        obj.display();
        obj.example();
        obj.message();  
        obj.newMethod();     
    }
}    */




//DEFAULT INTERFACES
//default methods can be overridden
/*  abstract class Interfaces2 implements newAbsMethod,newPractice{      
abstract void message();
}

interface newInterface2{
    default void greetings(){      //if we have two same methods with default type we need to override method in the class we are implementiong
     System.out.println("HI");
    }
}
interface newInterface{                          
    void newMethod();                                //abstract method of interface

    default void greetings(){                              //default methods should have body
        System.out.println("using default method with interface");
    }
}

 public class Interfaces extends Interfaces2 implements newInterface,newInterface2{
    void message(){
     System.out.println("Message from abstract");
     newInterface.super.greetings();                          //to access default methods in other methods we use 'interfaceName.super.methodName'
    }                                              //we can use this syntax only to call default methods and it is not applicable for all
    public void display(){             
     System.out.println("Display from interface");
    }
    public void example(){
     System.out.println("Example from interface");
    }
    public void newMethod(){
        System.out.println(("newmethod from new interface"));
    }
    public void greetings(){                        //overriding and in interfaces the type is public so we have to give public
        System.out.println("Overridden greetings methods of default");
        newInterface.super.greetings();                 //if we want to call the newinterface method and print those without overriding
        newInterface2.super.greetings();
    }
    public static void main(String[] args) {
        Interfaces obj=new Interfaces();            
        obj.display();
        obj.example();
        obj.message();  
        obj.newMethod();     
        obj.greetings();                           
   }
}   */ 



//STATIC INTERFACE

//static methods cannot be overridden
abstract class Interfaces2 implements newAbsMethod,newPractice{      
    abstract void message();
    }
    
    interface newInterface2{
        default void greetings(){      
         System.out.println("HI");
        }
    }
    interface newInterface{                          
        void newMethod();                              
    
        default void greetings(){                              
            System.out.println("using default method with interface");
        }
        static void myStatic(){                  //static need to be provided with a body and can't overwrite in any other interfaces/classes.
            System.out.println("Using static type in interface");
        }
    }
    
     public class Interfaces extends Interfaces2 implements newInterface,newInterface2{
        void message(){
         System.out.println("Message from abstract");
         newInterface.super.greetings();                
        } 
        public void display(){             
         System.out.println("Display from interface");
        }
        public void example(){
         System.out.println("Example from interface");
        }
        public void newMethod(){
            System.out.println(("newmethod from new interface"));
        }
        public void greetings(){                        
            System.out.println("Overridden greetings methods of default");
            newInterface.super.greetings();               
            newInterface2.super.greetings();
        }
        public static void main(String[] args) {
            Interfaces obj=new Interfaces();            
            obj.display();
            obj.example();
            obj.message();  
            obj.newMethod();     
            obj.greetings(); 
            newInterface.myStatic();     //we can access static by giving 'interfaceName.MethodName'                         
       }
    }   
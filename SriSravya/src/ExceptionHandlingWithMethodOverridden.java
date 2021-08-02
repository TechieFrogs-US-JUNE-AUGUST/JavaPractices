import java.io.IOException;

//IF SUPERCLASS METHOD DOES'T DECLARE AN EXCEPTION
/*  class Parent{                                       //parent class
    void msg(){
        System.out.println("This is parent class");
    }
}
public class ExceptionHandlingWithMethodOverridden  extends Parent{    //inheritance
   // void msg()throws IOException{                //since superclass doesn't declare exception,subclass overridden method cannot declare checked exception
    void msg()throws ArithmeticException{         //it can declare unchecked exceptions
        System.out.println("This is child class and throwing exception");
    }
    public static void main(String[] args) {
        Parent obj= new ExceptionHandlingWithMethodOverridden();            //creating instance for parent class
        obj.msg();
    }
}             */


//IF SUPERCLASS METHOD DECLARE AN EXCEPTION 
//if we declare superclass with exception, subclass oerridden method can declare same exception or subclass exception(hierarchy should be followed) or no exception BUT not parent class exception which is EXCEPTION.
class Parent{                                       //parent class
    //  void msg()throws ArithmeticException{
      void msg()throws Exception{
        System.out.println("This is parent class");
    }
}
public class ExceptionHandlingWithMethodOverridden extends Parent{    //inheritance
     void msg(){                                         //parent class has exception but subclass overridden doesn't have exception, so executes
    // void msg() throws ArithmeticException{                        //parent and subclass exceptions are same, executes
    // void msg() throws ArithmeticException{               //subclass overridden method declares subclass exception which is low as per hierarchy, executes
    // void msg()throws Exception{                                 //parent and subclass exceptions are not same(subclass has parentclass exception, hierarchy not followed), gives compile error
        System.out.println("This is child class and throwing exception");
    }
    public static void main(String[] args) {
        Parent obj= new ExceptionHandlingWithMethodOverridden();            
        try{
        obj.msg();
    } catch(Exception e){
        System.out.println("exception caused");
    }
  }   
}          
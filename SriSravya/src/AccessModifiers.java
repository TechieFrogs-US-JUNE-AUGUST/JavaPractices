//public access modifier

public class AccessModifiers {           //public can be used anywhere
       public static void main(String[] args){
           System.out.println("This is Public");
       }

    public void practice() {
        System.out.println("hello");
    }  
}     


//Private access modifier
/* class Sravya{
    private int a=10;
   //int a=10;
     private void practice(){
     //  public void practice(){
        System.out.println("a value is:" +a);
    }
}

public class AccessModifiers{                     //Main class or top level class should be always public
    public static void main(String[] args){
        Sravya obj=new Sravya();
        obj.practice();                        //it is throwing compile time error as we have given private for variable and method
    }                                           //private can be accessible only within the class
}           */


//Default access modifier;
                 
 /* class AccessModifiers{
    public static void main(String[] args){
   // A obj=new A();                                   // default is used only within the package
   // obj.practice();
    int a=2;
    System.out.println("Print a:"+a);
    }
}    */  



//Protected access modifier

/*public class AccessModifiers {     
   // public class AccessModifiers{                 //protected can be accesssed outside the package only using inheritance.
    public static void main(){                        //protected can be used inside the package and outside the package with child class
      //  AccessModifiers obj=new AccessModifiers();   //it can be used only for variables, methods, constructors
      //  obj.practice();
            System.out.println("Hello");   
        }
         }    */


      /*   public class AccessModifiers{
             protected void practice(){
                 System.out.println("Hi");
             }
         }    */
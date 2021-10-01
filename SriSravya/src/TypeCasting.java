//PRIMITIVE TYPECASTING

//WIDENING

/* public class TypeCasting {
    public static void main(String[] args) {
        char ch= 'A';
        int i= ch;
        System.out.println(i);
    }
}         */


 /* public class TypeCasting{
    public static void main(String[] args) {
        int i=20;
        long l=i;                //long is greater than int--> implicitly typecasting happens
        float f=l;               //float is greater than long--> implicitly typecasting happens
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
    }
}            */


//NARROWING 

/* public class TypeCasting{
    public static void main(String[] args) {
        long l= 20;
        int i= (int)l;               //as int is higher we need to use typecasting explitly by providing "(datatype)variable"
        System.out.println(l);
        System.out.println(i);
    }
}           */

/* public class TypeCasting{
    public static void main(String[] args) {
        double d= 20.5;
        long l= (long)d;             //explicit typecasting because double is higher, so double is converted to long which is lower
        int i=(int)l;                //explicit typecasting because long is higher, so long is converted to int which is lower
        System.out.println(d);
        System.out.println(l);
        System.out.println(i);
    }
}              */


//TYPE PROMOTION IN EXPRESSIONS

/* public class TypeCasting{
    public static void main(String[] args) {
        byte b= 75;
        char ch= 'V';
        short s= 1024;
        int i= 10000;
        float f= 5.67f;
        double d= .0121;

       double result= (f*b) + (i/ch) - (d*s);                         //expression
       //float result= (float)((float)(f*b) + (i/ch) - (d*s));         //expression
      //float result= (float)((f*b) + (i/ch) - (d*s));                 //expression
      //float result= (float) (float)(f*b) + (i/ch) - (d*s);    //This cant give the output as braces need to be taken care in explicit typecasting

        System.out.println(result);                 //prints a double value because double is higher datatype among all

    }
}                 */


//EXPLICIT TYPECASTING IN EXPRESSIONS

 public class TypeCasting{
    public static void main(String[] args) {
        byte b= 60;
        b= (byte)(b*2);           //only (b*2) gives 75*2=150 which is int , so explicit typecasting is done here..converting int to byte
        System.out.println(b);
    }
}             

  
//REFERENCE TYPECASTING

//UPCASTING
 /* class Animal{
     void eat(){
      System.out.println("Animal");
    }
}
class Cat extends Animal{
       void meow(){
           System.out.println("Cat Method");
       }
       void eat(){                                  //this is overrided the sysout will be diplayed here, if we dont have this oerridden method then it will print the subclass eat()
           System.out.println("Cat overriding");
       }
}
public class TypeCasting {
    public static void main(String[] args) {
        Cat catobj = new Cat();            //creating obj ref for subclass
        Animal animalobj= catobj;        //this is implicitly, assigning parentclass obj to subclass obj to access all methods of subclass using parentclass obj ref
        animalobj= (Animal)catobj;       //if we want to do it explicitly then this syntax works
        animalobj.eat();                   //it can access this
        animalobj.meow();            //it cannot access this
    
    }
}          */


//DOWNCASTING

/* class Animal{
    void eat(){
     System.out.println("Animal");
   }
}
class Cat extends Animal{
      void meow(){
          System.out.println("Cat Method");
      }
      void eat(){                                  
          System.out.println("Cat overriding");
      }
}
public class TypeCasting {
   public static void main(String[] args) {
       Cat catobj = new Cat();            //creating obj ref for subclass
       Animal animalobj= catobj;        //this is implicitly, assigning parentclass obj to subclass obj to access all methods of subclass using parentclass obj ref
       animalobj= (Animal)catobj;       //if we want to do it explicitly then this syntax works
       animalobj.eat();                   //it can access this
     //  animalobj.meow();            //it cannot access this
       ((Cat)(animalobj)).meow();       //we downcasted this and it works
   
   }
}            */


/* class Animal{
    void eat(){
     System.out.println("Animal");
   }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat Method");
    }
    void eat(){                                  
        System.out.println("Cat overriding");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog Method");
    }
    void eat(){
        System.out.println("Dog eat");
    }
}
public class TypeCasting {
   public static void main(String[] args) {
       Cat catobj = new Cat();            
       Animal animalobj= catobj;        
       animalobj= (Animal)catobj;       
       animalobj.eat(); 
       //animalobj.meow();                              
       ((Cat)(animalobj)).meow(); 
       
       Animal animalobj1 = new Dog();
       animalobj1.eat();
      // animalobj1.bark();             //we cannot directly access bark(), we need to do explicitly
       ((Dog)(animalobj1)).bark();

     // ((Cat)(animalobj1)).meow();    //throws runtime error as animalobj1 is of type class Dog and it cannot convert into class Cat
   
   }
}           */


//PRIMITIVE VS REFERENCE

//in primitive we can't restore the older value once downcasted, but in reference we can.
/* public class TypeCasting{
    public static void main(String[] args) {
        double d= 1.1;
        int i= (int)d;        //explicitly converting upper one double to int

        System.out.println(d);
        System.out.println(i);

    }
}       */

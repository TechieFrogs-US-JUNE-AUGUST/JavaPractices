//SINGLE LEVEL

class Person1{
    void Name1(){
        System.out.println("Name is Sam");
    }
}
//class Person2 extends Inheritance{
    class Person2 extends Person1{
    void Name2(){
        System.out.println("Name is John");
    }
}

public class InheritanceTypes {
    public static void main(String[] args){
      Person2 obj=new Person2();
    // obj.main();
      obj.Name2();
      obj.Name1();
    }
}  


//MULTI LEVEL
  //class Person1 extends Person4{
  /*  class Person1{                                        //from grandparent class--->parent class--->child class                                
    void Name1(){                                         //base class-->Intermediator class-->Derived class
        System.out.println("Name is Sam");
    }
}
    class Person2 extends Person1{
    void Name2(){
        System.out.println("Name is John");
    }
}
    class Person3 extends Person2{
     void Name3(){
         System.out.println("Name is Miller");
     }
 }

public class InheritanceTypes {
    public static void main(String[] args){
      Person3 obj=new Person3();
      obj.Name3();
      obj.Name2();
      obj.Name1();
     // obj.Name4();
    }
}       */



//HIERARCHIAL LEVEL
/* class Person1{                                                                        
    void Name1(){                                                           ------- A ------
        System.out.println("Name is Sam");                                   |      |      |
    }                                                                        B      C      D  
   // void Name2(){
      //  System.out.println("Name is John");
   // }
}
    class Person2 extends Person1{
    void Name2(){
        System.out.println("Name is John");
    }
}
    class Person3 extends Person1{
     void Name3(){
         System.out.println("Name is Miller");
     }
    // void Name2(){
       // System.out.println("Name is John");
   // }
 }

public class InheritanceTypes {
    public static void main(String[] args){
      Person3 obj=new Person3();
      obj.Name3();
      obj.Name2();              //giving compile error as we cannot execute the same class person1 using 2 different methods per3,per2          
      obj.Name1();
    }
}     */
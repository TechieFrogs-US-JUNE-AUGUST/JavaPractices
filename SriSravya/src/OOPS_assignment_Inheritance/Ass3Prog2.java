package OOPS_assignment_Inheritance;
class Parent1{ 
   private void parentmethod(){                          //if we give private we can't access it outside the class
        System.out.println("This is Parent method");
    }
}
class Child1 extends Parent1 {                      //inheritance
    void childmethod(){
        System.out.println("This is child class");
    }
}

public class Ass3Prog2 {
    public static void main(String[] args){
     //  Parent1 obj=new Parent1();
      // obj.parentmethod();                //calling parent class method by obj of parent class
        Child1 obj1=new Child1();
        obj1.childmethod();                //calling  child class method by obj of child clas
    }
}

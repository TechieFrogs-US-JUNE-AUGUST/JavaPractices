package OOPS_assignment_Inheritance;

class Parent{
    void parentmethod(){
        System.out.println("This is parent class");
    }
}
class Child extends Parent{                      //inheritance
    void childmethod(){
        System.out.println("This is child class");
    }
}

public class Ass3Prog1 {
    public static void main(String[] args){
        Parent obj=new Parent();
        obj.parentmethod();                //calling parent class method by obj of parent class
        Child obj1=new Child();
        obj1.childmethod();                //calling  child class method by obj of child clas
        obj1.parentmethod();               //calling  parent class method by obj of child class
    }
}

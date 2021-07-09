package Inheritance;
class Parentclass1{
    private void parentMethod1(){
        System.out.println("This is Parent Class");
    }
}
class Childclass1 extends Parentclass1{
    void childMethod1(){
        System.out.println("This is Child Class");
    }
}

public class InheritanceAssignment2 {
    public static void main(String[] args) {
        Parentclass1 p = new Parentclass1();
        Childclass1 c = new Childclass1();
       // p.parentMethod1();
        c.childMethod1();
      // c.parentMethod1();

    }
    
}

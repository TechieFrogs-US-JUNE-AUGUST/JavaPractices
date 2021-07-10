package Inheritance;

class Parentclass{
    void parentMethod(){
        System.out.println("This is Parent Class");
    }
}
class Childclass extends Parentclass{
    void childMethod(){
        System.out.println("This is Child Class");
    }
}

public class InheritanceAssignment1 {
    public static void main(String[] args) {
        Parentclass p = new Parentclass();
        Childclass c = new Childclass();
        p.parentMethod();
        c.childMethod();
        c.parentMethod();

    }
    
}

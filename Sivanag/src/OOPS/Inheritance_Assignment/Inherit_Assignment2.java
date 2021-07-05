package Inheritance_Assignment;

public class Inherit_Assignment2 {

    
    public static void main(String[] args) {
        parent pobj = new parent();
        child cobj =new child();
        System.out.println("Object of Parent class");
        pobj.setmethod_parent("This is Parent class");
        System.out.println(pobj.getmethod_parent());
        System.out.println("Object of Child class");
        cobj.method_child();
        System.out.println("Object of Child class");
        cobj.setmethod_parent("This is a Parent class");
        System.out.println(cobj.getmethod_parent());
        //cobj.method_parent();
    
}
}





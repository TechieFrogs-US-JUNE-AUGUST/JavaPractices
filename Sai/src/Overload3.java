class Parent{       // parent class Parent
    static void call(){   // method is a static
        System.out.println("Parent Class");
    }
}
class Child extends Parent{   // subclass Child 
    static void call(){         // method is static
        System.out.println("Child Class");
    }
}
class Overload3{
    public static void main(String[] args){
        Parent.call();   // If the method is static, we need to call them by Classname.
        Child.call();    // syntax   Classname.methodname();
    }
}
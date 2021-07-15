package Interfaces;

import Inheritance.ParentAndChildClass;

public class InterfacesAssignment7 extends ParentAndChildClass {
    public static void main(String[] args) {
       // ParentAndChildClass obj=new ParentAndChildClass();
       InterfacesAssignment7 obj = new InterfacesAssignment7();
        InterfacesAssignment7.InterfaceDemo1 obj1=obj.new InterfaceDemo1();

        obj1.fruits();
        obj1.vegetables();
    }
}

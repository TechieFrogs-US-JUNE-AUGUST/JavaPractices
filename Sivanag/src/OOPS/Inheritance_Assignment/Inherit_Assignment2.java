package Inheritance_Assignment;

class parent1
{
     String s = "This is Parent Class";
     private void method_parent()
    {
        System.out.println(s);
    }
    parent1()
    {
      
    }
}
class child1 extends parent1
{
    void method_child()
    {

        System.out.println("This is Child class");
    }
}

// parent1()
// {
//     //method_parent();
// }
// public String getmethod_parent()
// {
//     return s;
// }
// public String setmethod_parent(String s)
// {
//   return s;
// }
//}


public class Inherit_Assignment2 {


      public static void main(String[] args) {
        System.out.println("Object of Parent class");
        parent1 pobj1 = new parent1();
        
        //pobj1.method_parent();
        child1 cobj =new child1();

        //System.out.println("Object of Parent class");
        
        System.out.println("Object of Child class");
        cobj.method_child();
        System.out.println("Object of Child class");
        //System.out.println(cobj.method_parent());

        // System.out.println("Object of Parent class");
        // pobj.setmethod_parent("This is Parent class");
        // System.out.println(pobj.getmethod_parent());
        // System.out.println("Object of Child class");
        // cobj.method_child();
        // System.out.println("Object of Child class");
        // cobj.setmethod_parent("This is a Parent class");
        // System.out.println(cobj.getmethod_parent());
        //cobj.method_parent();
      }
    
}
//}





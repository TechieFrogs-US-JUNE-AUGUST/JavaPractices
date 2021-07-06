package Inheritance_Assignment;
class parent
{
    String s = "This is Parent Class";
      String method_parent()
    {
        return s;

    }
    

public String getmethod_parent()
{
    return s;
}
public String setmethod_parent(String s)
{
  return s;
}
}
class child extends parent
{
    void method_child()
    {

        System.out.println("This is Child class");
    }
}



public class Inherit_Assignment1
{
    public static void main(String[] args) {
        parent pobj = new parent();
        child cobj =new child();
        System.out.println("Object of Parent class");
        System.out.println(pobj.method_parent());
        System.out.println("Object of Child class");
        cobj.method_child();
        System.out.println("Object of Child class");
        System.out.println(cobj.method_parent());
        //cobj.method_parent();



    }



}
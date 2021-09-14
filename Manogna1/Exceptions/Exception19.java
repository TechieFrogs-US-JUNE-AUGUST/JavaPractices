package Exceptions;

class ParentClass {
    String parentName;
    ParentClass(String n1){
       parentName = n1;
    }
    public void display() {
       System.out.println(parentName);
    }
 }
 class ChildClass extends ParentClass {
    String childName;
    ChildClass(String n2) {
       super(n2);
       childName = n2;
    }
    public void display() {
       System.out.println(childName);
    }
 }

public class Exception19 {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass("Manogna");
      ParentClass parentClass = new ParentClass("Mandadapu");
      parentClass= childClass;
      parentClass.display();

      ParentClass parentClass1 = new ParentClass("Sai");
      ChildClass childClass1 = new ChildClass("Mandadapu");
      childClass1=(ChildClass) parentClass1;
      parentClass1.display();
        
    }
    
}

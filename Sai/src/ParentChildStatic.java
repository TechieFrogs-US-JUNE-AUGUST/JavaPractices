class ParentClas{   // parent class
    private void parent(){  // method of parent class
        System.out.println("This is Parent Class");
    }
}
class ChildClas extends ParentClass{  // child class extend parent class for access of parent class
    public void child(){   // method of child class
        System.out.println("This is Child Class");
    }
}
class ParentChildStatic{
    public static void main(String[] args, ParentClas Parentclas){
    ParentClas p = new ParentClas(); // for parent class
    ChildClas c = new ChildClas();   // for chold class
    p.parent(); // calling directly parent class but its private
    c.child();  // calling child class directly
    c.parent();  
   }
}
class ParentClass{   // parent class
    public void parent(){  // method of parent class
        System.out.println("This is Parent Class");
    }
}
class ChildClass extends ParentClass{  // child class extend parent class for access of parent class
    public void child(){   // method of child class
        System.out.println("This is Child Class");
    }
}
class ParentChild{
    public static void main(String[] args){
    ParentClass p = new ParentClass(); // for parent class
    ChildClass c = new ChildClass();   // for chold class
    p.parent(); // calling directly parent class
    c.child();  // calling child class directly
    c.parent();  // calling parent class through child class.used parent class method to call but child object
    }
}
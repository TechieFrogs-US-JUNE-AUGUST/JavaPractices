package Inheritance;

class Parentclass {
    private void parentMethod(){ // private method
        System.out.println("This is Parent Class ");
    }
}
 class Childclass extends Parentclass // inheritance
    {
        void childMethod(){
        System.out.println("This is Child Class");
    }
}
class AddParentprivte{
    public static void main(String[] args){ 
Childclass childclass = new  Childclass();// calling child class
childclass.childMethod();
    }
}

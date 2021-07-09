package Inheritance;
 class Parentclass {
     void parentMethod(){
        System.out.println("This is Parent Class ");
    }
}
 class Childclass extends Parentclass
    {
        void childMethod(){
        System.out.println("This is Child Class");
    }
}
class AddParentclass{
    public static void main(String[] args){
        Parentclass parentclass = new Parentclass(); //callling parent and child class
Childclass childclass = new  Childclass();
parentclass.parentMethod();
childclass.childMethod();
childclass.parentMethod();
    }
}
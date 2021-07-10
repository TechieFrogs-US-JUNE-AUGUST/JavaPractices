package Inheritance;
class A{
    int i=20,j=30;
A(){
    System.out.println("The Value of i and j is " +i + " " + +j);
}
public void show(){
    System.out.println("The Value of i and j is " +i + " " + +j);
}
}
class B extends A{
    int k=50;
    B(){

    }
    public void show(){
        System.out.println("The Value of k " +k);
    }
}

public class InheritanceAssignment8 {
    public static void main(String[] args) {
        B b= new B();
        b.show();
    }
    
}

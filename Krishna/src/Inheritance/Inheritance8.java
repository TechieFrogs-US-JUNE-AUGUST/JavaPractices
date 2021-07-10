package Inheritance;
class A{
    int i=10,j=20;
    A(){

    }
    void show()
    {
        System.out.println("the value of i and j is "+i+"  "+j);
    }
}
class B extends A{
    int k=25;
    B(){}
    void show()
    {
        System.out.println("the value of K is " +k);
    }
}
public class Inheritance8{
public static void main(String[] args)
{
    B Obj=new B();
    Obj.show();
} 
}
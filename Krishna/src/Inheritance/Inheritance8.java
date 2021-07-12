package Inheritance;
class A1{
    int i=10,j=20;
    A1(){
    }
    void show()
    {
        System.out.println("the value of i and j is "+i+"  "+j);
    }
}
class B1 extends A1{
    int k=25;
    B1(){}
    void show()
    {
        System.out.println("the value of K is " +k);
    }
}
public class Inheritance8{
public static void main(String[] args)
{
    B1 Obj=new B1();
    Obj.show();
} 
}
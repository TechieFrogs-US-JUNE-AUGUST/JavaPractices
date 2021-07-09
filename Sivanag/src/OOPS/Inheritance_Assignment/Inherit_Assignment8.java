package Inheritance_Assignment;

public class Inherit_Assignment8 {
    public static void main(String[] args) {
        B ob= new B();
        ob.show();

    }
    
}
class A
{
int i=10;
int j=20;
A()
{
    
}
void show()
{
    System.out.println("Value of i and j  is " + i+ " " +j);
}
}
class B extends A
{
int k=30;
B()
{

}
void show()
{
System.out.println("Value of k is " + k);
}
}

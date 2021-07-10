package Inheritance;

class Apple
{
    int number_of_items=15;
}
class Banana extends Apple
{
    int number_of_items=25;
    Banana()                                          //constructor is connected.
    { }
    void show()                                      //method
    {
        System.out.println("value of apple is " +super.number_of_items);            //accessing super class(apple) 
        System.out.println("value of banana is " +number_of_items);                 // accessing  Banana class.
    }
}
public class AppleBanana {
    public static void main(String[ ] args)
    {
        Banana Obj=new Banana();                                // creating an object to call show method.
        Obj.show();
    }
}
package Inheritance;

class Counter7
{
    int i;
    void increment()
    {    }
}
class Subclass1 extends Counter7
{
    void increment1()
    {
       System.out.println("i=3"); 
        increment();
    }
}
public class CounterValue{
public static void main(String[] args) 
{
    Subclass1 Obj= new Subclass1();
 Obj.increment1();
}
}
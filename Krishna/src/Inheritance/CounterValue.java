package Inheritance;

class Counter
{
    int i;
    void increment()
    {

    }
}
class subclass extends Counter
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
 subclass Obj= new subclass();
 Obj.increment1();
}
}
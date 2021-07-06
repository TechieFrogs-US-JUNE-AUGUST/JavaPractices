package Inheritance_Assignment;

class Counter1
{
    int i;
    void increment()
    {
        System.out.println("i =" + ++i);
    }
}
class subcls extends Counter1
{
    void inc()
    {
       i=2;
       increment();
    
    }
    
}

public class Inherit_Assignment7 {
    public static void main(String[] args) {
        subcls sb =new subcls();
       sb.inc();
    }

    
}






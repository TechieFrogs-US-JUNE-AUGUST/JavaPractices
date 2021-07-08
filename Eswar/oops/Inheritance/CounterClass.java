package oops.Inheritance;
class Counter{
    int i;
    void increment(){
        System.out.println("i="+i);
    }
}
class Abc extends Counter{
    void increment(){
        i=3;
       super.increment();
    }
}
public class CounterClass {
    public static void main(String[] args) {
        Abc obj=new Abc();
        obj.increment();
    }
}

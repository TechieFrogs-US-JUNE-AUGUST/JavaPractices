package src.OOPS.Abstract_Assignment;

public class Abstract_sample  {
    
public static void main(String[] args)
{
    c objc = new c();
    objc.sample();
    objc.sample1();
    objc.sample2();
    objc.sample3();

}


}
abstract class absample
{

    abstract void sample();
    abstract void sample1();
    abstract void sample2();
    abstract void sample3();


}
class b extends absample
{
    void sample()
{
    System.out.println("Sample");

}
void sample1()
{
    System.out.println("Sample1");

}
}
class c extends b
{
    void sample2()
{
    System.out.println("Sample2");

}
void sample3()
{
    System.out.println("Sample3");

}
}
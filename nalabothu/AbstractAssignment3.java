import java.util.Scanner;
abstract class Marks
{
    abstract void getPercentage();
}
class A extends Marks
{ 
    int marks=300;
    int total=300;
    int percentage;
    A()
    {
        
        }
    public void getPercentage()
    {
        percentage=(marks/total)*100;
System.out.println("percentage of studentA is: "+percentage);
    }

}
class B extends Marks
{
    int marks=400;
    int total=400;
    int percentage;
    B()
    {
    }
        public void getPercentage()
    {
        percentage=(marks/total)*100;
        
System.out.println("percentage of studentB is: "+percentage);
    }

}

public class AbstractAssignment3
 {
     public static void main(String[] args)
     {
         A obj=new A();
         obj.getPercentage();
         B obj1=new B();
         obj1.getPercentage();
}
    
}

public class Interface_Assignment6 extends classconcrete implements newinterface {
    public static void main(String[] args) {
        Interface_Assignment6 obji6 = new Interface_Assignment6();
        obji6.I6method1();
        obji6.I6method2();
        obji6.I6method3();
        obji6.I6newmethod();
    }

}

interface Interface_Assignment6_1
{
    void I6method1();
    void I6method2();

}
interface Interface_Assignment6_2
{
    void I6method1();
    void I6method2();

}
interface Interface_Assignment6_3
{
    void I6method1();
    void I6method2();

}
interface newinterface extends Interface_Assignment6_1,Interface_Assignment6_2,Interface_Assignment6_3
{

    void I6newmethod();
}
class classconcrete
{
    public void I6method1()
    {
        System.out.println("Interface method1");
    }
    public void I6method2()
    {
        System.out.println("Interface method2");
    }
    public void I6method3()
    {
        System.out.println("Interface method3");
    }
     public void I6newmethod()
     {
        System.out.println("New Interface method "); 
     }

}
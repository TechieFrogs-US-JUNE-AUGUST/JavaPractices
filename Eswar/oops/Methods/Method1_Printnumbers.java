package oops.Methods;
class PrintNumber
{
    void printn(int n)
    {
        System.out.println("Integer value :" +n);
    }
    void printn(String n)
    {
        System.out.println("String Value : " +n);

    }
    void printn(double n)
    {
        System.out.println("String Value : " +n);

    }
    void printn(float n)
    {
        System.out.println("String Value : " +n);

    }
    void printn(char n)
    {
        System.out.println("String Value : " +n);

    }

}
public class Method1_Printnumbers {
    public static void main(String[] args) 
    {
        PrintNumber objp=new PrintNumber();
        objp.printn(20);
        objp.printn("Dev");
        objp.printn(30.6);
        objp.printn(20.3);
        objp.printn('b');


        
    }
    
}

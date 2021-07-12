package Abstract;
abstract class Bank
{
    abstract void getBalance();
}
class BankA extends Bank   
    {
        void getBalance() 
        {
        System.out.println("$100 are deposited in BankA");
        }   
    }
class BankB extends Bank
{
    void getBalance()
    {
        System.out.println("$150 are deposited in BankB");
    }
}
class BankC extends Bank
{
    void getBalance()
    {
        System.out.println("$200 are deposited in BankC");
    }
}
 public class BankAbstract2 
 {
    public static void main(String [ ]args)
    {
        BankA obj1=new BankA();
        BankB obj2=new BankB();
        BankC obj3=new BankC();
        obj1.getBalance();
        obj2.getBalance();
        obj3.getBalance();
    }   
 }
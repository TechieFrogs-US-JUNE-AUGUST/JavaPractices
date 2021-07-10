abstract class Bank
{
    abstract void getBalance();
}
class BankA extends Bank
{
    int amount=100;
    public void getBalance()
    {
        System.out.println("deposited amount from bank A is" +amount);

    }
}
class BankB extends Bank
{
    int amount=150;
    public void getBalance()
    {
        System.out.println("deposited amount from bank B is" +amount);

        
    }
}
class BankC extends Bank
{
    int amount=200;
    public void getBalance()
    {
        System.out.println("deposited amount from bank c is" +amount);

        
    }
}
public class AbstractAssignment2 
{
    public static void main(String[] args)
    {
        BankA obj2=new BankA();
         BankB obj=new BankB();
        BankC obj1=new BankC();
        obj2.getBalance();
        obj.getBalance();
        obj1.getBalance();

    }
    
}

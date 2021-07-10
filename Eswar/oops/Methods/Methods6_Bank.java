package oops.Methods;

class Bank
{
    int getBalance()
    {
        return 0;
    }

}
class BankA
{
    int getBalance()
    {
        return 1000;
    }
}
class BankB
{
    int getBalance()
    {
        return 1500;
    }
}
class BankC
{
    int getBalance()
    {
        return 2000;
    }
}

public class Methods6_Bank {
    public static void main(String[] args)
    {
        BankA objA = new BankA();
        BankB objB =new BankB();
        BankC objC =new BankC();
        System.out.println("A boy deposited Amount in Bank A is : " +objA.getBalance()); 
        System.out.println("A boy deposited Amount in Bank B is : " +objB.getBalance()); 
        System.out.println("A boy deposited Amount in Bank C is : " +objC.getBalance()); 
     



    }
    
}

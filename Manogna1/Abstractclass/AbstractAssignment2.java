package Abstractclass;
abstract class Bank{
    abstract void getBalance();

}
    class BankA extends Bank{
    void getBalance()
    {
        System.out.println("Money Deposited in BankA: 100$");
    }
        
    }
    class BankB extends Bank{

       
        void getBalance() {
            
            System.out.println("Money Deposited in BankB : 150$");
            
        }
        
    }
    class BankC extends Bank{

        void getBalance()
        {
            System.out.println("Money Deposited in BankC : 200$");
        }
    }

    

public class AbstractAssignment2 {
    public static void main(String[] args) {
        BankA banka=new BankA();
        banka.getBalance();
        BankB bankb=new BankB();
        bankb.getBalance();
        BankC bankc=new BankC();
        bankc.getBalance();


    }
    
}

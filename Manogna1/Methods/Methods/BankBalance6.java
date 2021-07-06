package Methods;

class Bank{

      int getBalance(){
        return 0;
    
    }
}
    class BankA extends Bank
    {
        int getBalance()
        {
            System.out.println("Money Deposited in Bank A is $1000");
            return 1000;
        }
    }
    class BankB extends Bank
    {
        int getBalance(){
            System.out.println("Money Deposited in Bank B is $1500");
            return 1500;

        }
    }
    class BankC extends Bank{
        int getBalance()
        {
            System.out.println("Money Deposited in Bank C is $2000");
            return 2000;
        }
    }


public class BankBalance6 {
    public static void main(String[] args) {
        Bank b= new Bank();
        BankA A =new BankA();
        BankB B= new BankB();
        BankC C=new BankC();
        A.getBalance();
        B.getBalance();
        C.getBalance();

    }
}

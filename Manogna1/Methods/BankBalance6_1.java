package Methods;
class Bank1{

    void getBalance(){
    
    }
}
    class BankA1
    {
        void getBalance()
        {
            System.out.println("Money Deposited in Bank A is $1000");
        }
    }
    class BankB1 
    {
        void getBalance(){
            System.out.println("Money Deposited in Bank B is $1500");

        }
    }
    class BankC1
    {
        void getBalance()
        {
            System.out.println("Money Deposited in Bank C is $2000");
        }
    }


public class BankBalance6_1 {
    public static void main(String[] args) {
        new Bank1();
        BankA1 A1 =new BankA1();
        BankB1 B1= new BankB1();
        BankC1 C1=new BankC1();
        A1.getBalance();
        B1.getBalance();
        C1.getBalance();

    }
}

class Bank{
   int getBalance(){
        return 0;
    }
}
class BankA extends BankDeposit{
    void getBalance(){
        System.out.println("Amount in BankA is 1000$"); 
    }
}
class BankB extends BankDeposit{
    void getBalance(){
        System.out.println("Amount in BankB is 1500$"); 
    }
}
class BankC extends BankDeposit{
    void getBalance(){
        System.out.println("Amount in BankC is 2000$"); 
    }
}
public class BankDeposit {
    public static void main(String[] args) {
        Bank obj1=new Bank();
        BankA obj2=new BankA();
        BankB obj3=new BankB();
        BankC obj4=new BankC();
        obj1.getBalance();
        obj2.getBalance();
        obj3.getBalance();;
        obj4.getBalance();
    
    
    }
    
}

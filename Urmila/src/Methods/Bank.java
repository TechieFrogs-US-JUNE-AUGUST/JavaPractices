package Methods;

 class Bank {
    int getBalance(){
        return 0;
    }
}
    class BankA extends Bank{
        int getBalance(int balance){
            return balance;
        }
    }
    class BankB extends Bank{
         int getBalance(int balance){
            return balance;
        }
    }
    class BankC extends Bank{
         int getBalance(int  balance){
            return balance;
        }
    }
class AddBank{

    public static void main(String[] args){
        BankA banka = new BankA();
        BankB bankb = new BankB();
        BankC bankc = new BankC();
        System.out.println("$"+1000);
        System.out.println("$" +1500);
        System.out.println("$"+2000);
    }   
 }

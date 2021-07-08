package AbstractClass;
abstract class Bank{
    abstract void getBalance();
}
class BankA extends Bank{
    void getBalance(){
        System.out.println("balance in bank A is 100$");
    }
}
class BankB extends Bank{
    void getBalance(){
        System.out.println("balance in bank B is 150$");
    }
}
class BankC extends Bank{
    void getBalance(){
        System.out.println("balance in bank C is 200$");
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        BankA obj1=new BankA();
        BankB obj2=new BankB();
        BankC obj3=new BankC();
        obj1.getBalance();
        obj2.getBalance();
        obj3.getBalance();
    }
}

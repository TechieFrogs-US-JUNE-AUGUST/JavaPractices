//package Interfaces;
abstract class Bank
{
    abstract void getBalance();


}
class BankA extends Bank
{
        void getBalance() {
        System.out.println("Deposited Amount in Bank A: $" + 100);

    }
}
class BankB extends Bank
{
    void getBalance() {
        System.out.println("Deposited Amount in Bank B: $" + 150);

    }
}
class BankC extends Bank
{
    void getBalance() {
        System.out.println("Deposited Amount in Bank C: $" + 200);

    }

}
public class Abstract_Assignment2 {
    public static void main(String[] args) {
        BankA objA = new BankA();
        BankB objB =new BankB();
        BankC objC =new BankC();
        objA.getBalance();
        objB.getBalance();
        objC.getBalance();

    }
    
}

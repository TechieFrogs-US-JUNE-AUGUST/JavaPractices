package Abstractclasses;

abstract class Bank {// abstract class
    abstract void getBalance();
}
class BankA extends Bank{ //creating subclass BankA for Bank.(inherits from main class Bank)
    void getBalance() { // body of getBalance is created here
        System.out.println("Amount deposited in bankA : $ 100");
    }
} // provide implementation of abstract method
class BankB extends Bank{// creating subclass BankB for Bank
    void getBalance() {
        System.out.println("Amount deposited in bankB : $ 150");
    }
}
class BankC extends Bank{// creating subclass BankC for Bank
    void getBalance(){
        System.out.println("Amount deposited in bankC : $ 200");
    }
}
class AddBank{// class with main abstract method
    public static void  main(String[] args){ // accessing method of abstract class using objects
        BankA banka = new BankA(); //creating object for subclass BankA
        banka.getBalance();
        BankB bankb = new BankB();// creating object for subclass BankB
        bankb.getBalance();
        BankC bankc = new BankC();// creating object for subclass BankC
        bankc.getBalance();
    }
}

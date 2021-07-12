class AbstractBankA extends Abstract2{   //subclass inherited from super class
    void getBalance(){
        System.out.println("100 deposited in BankA");
    }
}
class AbstractBankB extends Abstract2{ //subclass inherited from super class
    void getBalance(){
        System.out.println("200 deposited in BankB");
    }
}
class AbstractBankC extends Abstract2{ //subclass inherited from super class
    void getBalance(){
        System.out.println("300 deposited in BankC");
    }
}
public abstract class Abstract2{
    abstract void getBalance();  // no body in abstract method
    public static void main(String[] args){
        AbstractBankA bA = new AbstractBankA(); // instances for subclasses
        AbstractBankB bB = new AbstractBankB();
        AbstractBankC bC = new AbstractBankC();
        bA.getBalance();
        bB.getBalance();
        bC.getBalance();
    }
}
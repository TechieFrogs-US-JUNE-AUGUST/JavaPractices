package Methods_assignment;
class Bank{                        //parent class
    int getBalance(){              //method
        return 0;
    }
}
    class BankA extends Bank {           //subclass with inheritance
        int getBalance(int balance){
            return balance;
        }
    }
    class BankB extends Bank{
        int getBalance(int balance){
            return balance;
        }
    }
    class BankC extends Bank {
        int getBalance(int balance){
            return balance;
        }
    }

public class Prog6Ass3 {
    public static void main(String[] args){
        BankA obj1=new BankA();                    //creating objects
        BankB obj2=new BankB();
        BankC obj3=new BankC();
        System.out.println(+obj1.getBalance(1000));          //calling method with passing values
        System.out.println(+obj2.getBalance(1500));
        System.out.println(+obj3.getBalance(2000));
    }
}

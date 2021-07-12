package AbstractClass_Assignment;
abstract class Bank{                  //abstract class
    abstract void getBalance();       //abstract method
}
class BankA extends Bank{           //subclass with inheritance

    public void getBalance(){        //overridden method
        System.out.println("Deposited: $100");
    }
}
class BankB extends Bank{          //subclass with inheritance
 
    public void getBalance(){        //overridden method
        System.out.println("Deposited: $150");
    }
}
class BankC extends Bank{          //subclass with inheritance
  
    public void getBalance(){       //overridden method
        System.out.println("Deposited: $200");
    }
}
public class Ass4Prog2 {
    public static void main(String[] args){
      BankA obj1=new BankA();             //creating obj for subclass
      obj1.getBalance();                  //calling the method
      BankB obj2=new BankB();
      obj2.getBalance();
      BankC obj3=new BankC();
      obj3.getBalance();
    }
}

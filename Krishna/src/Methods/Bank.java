package Methods;
public class Bank
 {
    public static void main(String[] args)
    {
        Bank Obj=new Bank();
        Obj.getBalnce();
        BankA ObjA= new BankA();
        ObjA.getBalance();
        BankB ObjB= new BankB();
        ObjB.getBalance();
        BankC ObjC= new BankC();
        ObjC.getBalance();
    }
             int getBalnce()
             {
                return 0;
             }  
           
 } 
             class BankA
             {
                 int getBalance()
                 {
                     System.out.println("amount deposited in Bank A is " +1000);
                     return 1000;
                 }
             }
             class BankB
             {
                 int getBalance()
                 {
                     System.out.println("amount deposited in BankB is "+1500);
                     return 1500;
                 }
             }
             class BankC
             {
                 int getBalance()
                 {
                     System.out.println("amount deposited in Bankc is "+2000);
                     return 2000;
                 }
            }
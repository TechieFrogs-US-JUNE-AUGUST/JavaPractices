package Methods;

class Customer
{
    String name="Manogna";
    int age=29;
    String add="Vja";

}
class Account
{
    String Account="12345689";
    String branch="NTRCircle";
}
class RBI
{
    Customer m;
    Account a;
    public double GetInterestRate()
    {
        return 2.0;

    }
    public double GetWithDrawalLimit()
    {
        return  600000;

    }
    public double GetminBalance()
    {
        return 100;
    }
}
class SBI extends RBI
{
  
    public double GetInterestRate()
    {
        return 2.0;

    }
    public double GetWithDrawalLimit()
    {
        return  600000;

    }
    public double GetminBalance()
    {
        return 100;
    }

}
class ICICI extends RBI
{
    
    public double GetInterestRate()
    {
        return 3.0;

    }
    public double GetWithDrawalLimit()
    {
        return  900000;

    }
    public double GetminBalance()
    {
        return 1000;
    }

}
class PNB extends RBI
{
    
    public double GetInterestRate()
    {
        return 3;

    }
    public double GetWithDrawalLimit()
    {
        return  50000;

    }
    public double GetminBalance()
    {
        return 2000;
    }
}


public class Rbi1 {
    public static void main(String[] args)
    {
        RBI objr = new RBI();
        SBI objs = new SBI();
        ICICI obji = new ICICI();
        PNB objp = new PNB();
        System.out.println("RBI Bank saving Accounts instructions ");
        System.out.println("Interest Rate per Annum : " +objr.GetInterestRate()); 
        System.out.println("Minimum Balance per Month : "+objr.GetminBalance());
        System.out.println("Maximum Withdrawal Limit per Day : "+objr.GetWithDrawalLimit());
        System.out.println("SBI Bank saving Accounts instructions ");
        System.out.println("Interest Rate per Annum : " +objs.GetInterestRate()); 
        System.out.println("Minimum Balance per Month : "+objs.GetminBalance());
        System.out.println("Maximum Withdrawal Limit per Day : "+objs.GetWithDrawalLimit());
        System.out.println("ICICI Bank saving Accounts instructions ");
        System.out.println("Interest Rate per Annum : " +obji.GetInterestRate()); 
        System.out.println("Minimum Balance per Month : "+obji.GetminBalance());
        System.out.println("Maximum Withdrawal Limit per Day : "+obji.GetWithDrawalLimit());
        System.out.println("PNB Bank saving Accounts instructions ");
        System.out.println("Interest Rate per Annum : " +objp.GetInterestRate()); 
        System.out.println("Minimum Balance per Month : "+objp.GetminBalance());
        System.out.println("Maximum Withdrawal Limit per Day : "+objp.GetWithDrawalLimit());
        System.out.println(objr.m);

    }
    
}


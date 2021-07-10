package oops.Methods;

class Customer
{
    String name="siva";
    int age=37;
    String add="hyderabad";

}
class Account
{
    String Accn="123456789012";
    String branch="Khairatabad";
}
class RBI
{
    Customer m;
    Account a;
    public double GetInterestRate()
    {
        return 4.0;

    }
    public double GetWithDrawalLimit()
    {
        return  40000;

    }
    public double GetminBalance()
    {
        return 5000;
    }
}
class SBI extends RBI
{
    public double GetminBalance()
    {
        return 3000;
    }
    public double GetInterestRate()
    {
        return 4.0;

    }
    public double GetWithDrawalLimit()
    {
        return  40000;

    }

}
class ICICI extends RBI
{
    public double GetminBalance()
    {
        return 10000;
    }
    public double GetInterestRate()
    {
        return 5.0;

    }
    public double GetWithDrawalLimit()
    {
        return  60000;

    }

}
class PNB extends RBI
{
    public double GetminBalance()
    {
        return 5000;
    }
    public double GetInterestRate()
    {
        return 4.5;

    }
    public double GetWithDrawalLimit()
    {
        return  50000;

    }
}


public class Methods9_RBI {
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

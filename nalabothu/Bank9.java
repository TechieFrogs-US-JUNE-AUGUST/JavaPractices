
 class Bank9 
    {  
        public static void main(String[] args)
        {
            RBI obj=new RBI();
            SBI obj1=new SBI();
            ICICI obj2=new ICICI();
            System.out.println("RBI bank saving accounts details:");
            System.out.println("interest rate per annum is:"+obj.GetInterestRate());
            System.out.println("withdrawal rate per day  is:"+obj.GetWithDrawalLimit());
            System.out.println("minimum balance per month is "+obj.GetMinBalance());
            System.out.println("SBI bank saving accounts details:");
            System.out.println("interest rate per annum is:"+obj1.GetInterestRate());
            System.out.println("withdrawal rate per day  is:"+obj1.GetWithDrawalLimit());
            System.out.println("minimum balance per month is "+obj1.GetMinBalance());
            System.out.println("ICICI bank saving accounts details:");
            System.out.println("interest rate per annum is:"+obj2.GetInterestRate());
            System.out.println("withdrawal rate per day  is:"+obj2.GetWithDrawalLimit());
            System.out.println("minimum balance per month is "+obj2.GetMinBalance());
        }
            
            }  
  
  
    class Customer
    {
        String name="siva";
        int age=29;
        String address="california";
    }
    class Account
    {
        String Accnum="1234557656";
        String Branch="sunnyvale";
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
            return 40000;
        }
        public double GetMinBalance()
        {
            return 5000;
        }
}
class SBI extends RBI
{
    Customer m;
        Account a;
        public double GetInterestRate()
        {
            return 3.0;
        }
        public double GetWithDrawalLimit()
        {
            return 30000;
        }
        public double GetMinBalance()
        {
            return 50000;
        }
}
  class ICICI extends RBI
  {
    Customer m;
    Account a;
    public double GetInterestRate()
    {
        return 2.0;
    }
    public double GetWithDrawalLimit()
    {
        return 80000;
    }
    public double GetMinBalance()
    {
        return 20000;
    }
  }
  
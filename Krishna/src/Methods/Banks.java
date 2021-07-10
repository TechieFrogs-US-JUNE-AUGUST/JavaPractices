package Methods;

    class Customer
        {
            String name;
            int age;
            char gender;
        }
    class Account
        {       
            double AccNo;
            double Balance;
            float interest_rate;
        }
    class Rbi
        {
            public void getCustomer()
            {
                System.out.println("customer name: Krishna");
                System.out.println("25");
                System.out.println("M");
            }
             public double getAccountNumber()
            {
                  return 12345;
            }
            public double getBalance()
            {
                return 50000;
            }
             public float getInterest()
             {
                return 4.0f;
             }
        }
    class Sbi extends Rbi
    {
        public void getCustomer()
        {
            super.getCustomer();
            System.out.println("Dedeepya");
            System.out.println("27");
            System.out.println("F");
        }
        public double getAccountNumber()
        {
            super.getAccountNumber();
            return 56789;
        }
        public double getBalance()
        {
            super.getBalance();
            return 50000;
        }
        public float getInterest()
        {
            super.getInterest();
            return 4.3f;
        }
    }
    class Icici extends Rbi
    {
        public void getCustomer()
        {
            System.out.println("padma");
            System.out.println("45");
            System.out.println("F");
        }
        public double getAccountNumber()
        {
            return 10101;
        }
        public double getBalance()
        {
            return 50000;
        }
        public float getInterest()
        {
            return 5.0f;
        }
    }
    class Pnb extends Rbi
    {
        public void getCustomer()
        {
            System.out.println("Srinivasu");
            System.out.println("50");
            System.out.println("M");
        }
        public double getAccountNumber()
        {
            return 123456;
        }
        public double getBalance()
        {
            return 100000;
        }
        public float getInterest()
        {
            return 4.5f;
        }
    }
        public class Banks
        {
            public static void main(String[] args) 
            {
                Rbi obj1=new Rbi();
                Sbi obj2=new Sbi();
                Icici obj3=new Icici();
                Pnb obj4 =new Pnb();
                obj1.getCustomer(); 
                System.out.println(obj1.getAccountNumber());
                System.out.println(obj1.getBalance());
                System.out.println(obj1.getInterest());
                obj2.getCustomer(); 
                System.out.println(obj2.getAccountNumber());
                System.out.println(obj2.getBalance());
                System.out.println(obj2.getInterest());obj1.getCustomer();
                obj3.getCustomer();  
                System.out.println(obj3.getAccountNumber());
                System.out.println(obj3.getBalance());
                System.out.println(obj3.getInterest());
                obj4.getCustomer(); 
                System.out.println(obj4.getAccountNumber());
                System.out.println(obj4.getBalance());
                System.out.println(obj4.getInterest());
            }
        }
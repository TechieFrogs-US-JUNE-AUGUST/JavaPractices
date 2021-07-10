package Methods;
class Customer{
    String name;
    int age;
    char gender;
}
class Account{
    double AccNo;
    double Balance;
    float interest_rate;

}
class Rbi{
public void getCustomer(){
System.out.println("Tarak");
System.out.println("23");
System.out.println("M");
}
public double getAccountNumber(){
    return 93847648;
}
public double getBalance(){
    return 34344;
}
public float getInterest(){
    return 4.0f;
}
}
class Sbi extends Rbi{
    public void getCustomer(){
        super.getCustomer();
        System.out.println("Ram");
        System.out.println("20");
        System.out.println("M");
        }
        public double getAccountNumber(){
            super.getAccountNumber();
            return 93847643;
        }
        public double getBalance(){
            super.getBalance();
            return 67344;
        }
        public float getInterest(){
            super.getInterest();
            return 4.3f;
        }
}
class Icici extends Rbi{
    public void getCustomer(){
        System.out.println("Sandhya");
        System.out.println("42");
        System.out.println("F");
        }
        public double getAccountNumber(){
            return 93347648;
        }
        public double getBalance(){
            return 123344;
        }
        public float getInterest(){
            return 4.5f;
        }
}
class Pnb extends Rbi{
    public void getCustomer(){
        System.out.println("Sai");
        System.out.println("50");
        System.out.println("M");
        }
        public double getAccountNumber(){
            return 93842838;
        }
        public double getBalance(){
            return 349473;
        }
        public float getInterest(){
            return 5.0f;
        }
}
public class Bank {
    public static void main(String[] args) {
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

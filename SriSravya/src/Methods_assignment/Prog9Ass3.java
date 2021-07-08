package Methods_assignment;
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
class RBI{                              //parent class
public void getCustomer(){
System.out.println("Sravya");
System.out.println("23");
System.out.println("F");
}
public double getAccountNumber(){
    return 1234567;
}
public double getBalance(){
    return 25000;
}
public float getInterest(){
    return 2.0f;
}
}
class SBI extends RBI{
    public void getCustomer(){
        System.out.println("Ramya");
        System.out.println("20");
        System.out.println("F");
        }
        public double getAccountNumber(){
            return 7456123;
        }
        public double getBalance(){
            return 30000;
        }
        public float getInterest(){
            return 3.0f;
        }
}
class ICICI extends RBI{                  //inheritance
    public void getCustomer(){
        System.out.println("Venkat");
        System.out.println("29");
        System.out.println("M");
        }
        public double getAccountNumber(){
            return 1563247;
        }
        public double getBalance(){
            return 40000;
        }
        public float getInterest(){
            return 4.0f;
        }
}
class PNB extends RBI{                 //inheritance
    public void getCustomer(){
        System.out.println("Vivek");
        System.out.println("21");
        System.out.println("M");
        }
        public double getAccountNumber(){
            return 1689423;
        }
        public double getBalance(){
            return 15000;
        }
        public float getInterest(){
            return 5.0f;
        }
}
public class Prog9Ass3 {
    public static void main(String[] args) {
        RBI obj1=new RBI();
        SBI obj2=new SBI();
        ICICI obj3=new ICICI();
        PNB obj4=new PNB();
        obj1.getCustomer();
        obj1.getAccountNumber();
        obj1.getBalance();
        obj1.getInterest();
        obj2.getCustomer();
        obj2.getAccountNumber();
        obj2.getBalance();
        obj2.getInterest();
        obj3.getCustomer();
        obj3.getAccountNumber();
        obj3.getBalance();
        obj3.getInterest();
        obj4.getAccountNumber();
        obj4.getBalance();
        obj4.getInterest();
    }  
}

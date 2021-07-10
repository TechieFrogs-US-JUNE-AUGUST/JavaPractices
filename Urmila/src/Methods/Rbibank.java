package Methods;

class Customer {
    int age;
    String name;
    char gender;
}
class Account{
    double AccountNumber;
    double Balance;
    float Interest_rate;
}
class RBI{
 void getCustomer(){
     System.out.println("Adwaita");
     System.out.println(35);
     System.out.println("Female");
 }
 double getAccountNumber(){
     return 271118;
 }
 double getBalance(){
     return 20184;
 }
 float getInterest(){
     return 7.5f;
 }
}
class SBI extends RBI{
    void getCustomer(){
        System.out.println("Dvr");
        System.out.println(50);
        System.out.println("male");
    }
double getAccountNumber(){
    return 199109;
}
double getBalance(){
    return 70904;
}
float getInterest(){
    return 4.0f;
}
}
class ICICI extends RBI{
    void getCustomer(){
        System.out.println("Lakshmi");
        System.out.println(45);
        System.out.println("female");
    }
double getAccountNumber(){
    return 250000;
}
double getBalance(){
    return 50000;
}
float getInterest(){
    return 6.6f;
}
}class PNB extends RBI{
    void getCustomer(){
        System.out.println("mohan");
        System.out.println(30);
        System.out.println("male");
    }
double getAccountNumber(){
    return 40000;
}
double getBalance(){
    return 7000;
}
float getInterest(){
    return 9.2f;
}
}
class AddRbibank{
    public static void main(String[] args){
        RBI rbi = new RBI();
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        PNB pnb = new PNB();
        rbi.getCustomer();
        rbi.getAccountNumber();
        rbi.getBalance();
        rbi.getInterest();
        sbi.getCustomer();
        sbi.getAccountNumber();
        sbi.getBalance();
        sbi.getInterest();
        icici.getCustomer();
        icici.getAccountNumber();
        icici.getBalance();
        icici.getInterest();
        pnb.getCustomer();
        pnb.getAccountNumber();
        pnb.getBalance();
        pnb.getInterest();
    }
}
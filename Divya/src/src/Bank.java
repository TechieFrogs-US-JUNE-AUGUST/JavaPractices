public class Bank {
    int getBalance( int b){
        return b;
    }
}
    class BankA extends Bank{
    int getBalance(int a){
    return a;}
}
class BankB extends Bank{
    int getBalance(int c){
        return c;
    }
}
class BankC extends Bank{
    int getBalance(int d){
        return d;
    }
    public static void main(String[] args){
        Bank obj1=new Bank();
       int b= obj1.getBalance(0);
       System.out.println("Bank balance="+b);
        BankA obj2=new BankA();
        BankB obj3=new BankB();
        BankC obj4=new BankC();
        int a=obj2.getBalance(1000);
        System.out.println("The amount of money deposited to BankA:"+"$"+a);
        int c=obj2.getBalance(1500);
        System.out.println("The amount of money deposited to BankB:"+"$"+c);
        int d=obj2.getBalance(2000);
        System.out.println("The amount of money deposited to BankC:"+"$"+d);
    }
}

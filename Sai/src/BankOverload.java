class Bank{  // parent class
    int getBalance(){   // returning the interger value 0
        System.out.print("Balance : ");
        return 0;
    }
}
class BankA extends Bank{    //child class a
        int getBalance(int a){  //returning the int datatype
        System.out.print("Balance A : ");
        return a;  // returns the value
    }
}
class BankB extends Bank{   //child class b
       int getBalance(int b){
       System.out.print("Balance B : ");
       return b;
    }
 }
 class BankC extends Bank{  // child class c
       int getBalance(int c){
       System.out.print("Balance C : ");
       return c;
    }
 }
class BankOverload{
    public static void main(String[] args){
        Bank o = new Bank(); 
        System.out.println(o.getBalance());  // returned value printing
        BankA a = new BankA();
        System.out.println(a.getBalance(1000)); //returned value to be print here
        BankB b = new BankB();
        System.out.println(b.getBalance(2000));
        BankC c = new BankC();
        System.out.println(c.getBalance(3000));
    }
}
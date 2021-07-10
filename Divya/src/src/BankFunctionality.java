class customer{
    String name="divya";
    int age=25;
    String address="visakhapatnam";
}
class Account{
int  account_no=123456789;
String branch="Kazutaka";
}
class RBI{
    int getInterestRate(){
        return 4;
    }
    int getWithDrawLimit(){
     return 50000;
 }
    int getMinBalance(){
    return 5000;
    }
}
class SBI extends RBI{
    int getInterestRate(){
        return 4;
    }
    int getWithDrawLimit(){
        return 40000;
    }
    int getMinBalance(){
        return 6000;
    }
}
class IC extends RBI{
    int getInterestRate(){
        return 4;
    }
    int getWithDrawLimit(){
        return 60000;
    }
    int getMinBalance(){
        return 6000;
    }
}
class PNB extends RBI{
    int getInterestRate(){
        return 4;
    }
    int getWithDrawLimit(){
        return 60000;
    }
    int getMinBalance(){
        return 8000;
    }
}
public class BankFunctionality {
    public static void main(String[] args) {
        RBI obj = new RBI();
        SBI obj1 = new SBI();
        IC obj2 = new IC();
        PNB obj3 = new PNB();
        System.out.println("Instructions for RBI");
        System.out.println("minimum interest rate="+obj.getInterestRate());
        System.out.println("maximum withdraw limit="+obj.getWithDrawLimit());
        System.out.println("minimum balance allowed="+obj.getInterestRate());
        System.out.println("instructions for SBI");
        System.out.println("minimum interest rate="+obj1.getInterestRate());
        System.out.println("maximum withdraw limit="+obj1.getWithDrawLimit());
        System.out.println("minimum balance allowed="+obj1.getInterestRate());
        System.out.println("instructions for PNB");
        System.out.println("minimum interest rate="+obj3.getInterestRate());
        System.out.println("maximum withdraw limit="+obj3.getWithDrawLimit());
        System.out.println("minimum balance allowed="+obj3.getInterestRate());
    }
}
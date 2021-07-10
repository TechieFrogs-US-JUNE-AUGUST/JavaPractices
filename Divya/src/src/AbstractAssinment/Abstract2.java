package AbstractAssinment;
abstract class Bank {
    abstract void getBalance();
}
class A1 extends Bank{
      void getBalance(){
          System.out.println("$100");
      }
}
class B1 extends Bank{
    void getBalance(){
        System.out.println("$150");
    }
}
class C1 extends Bank {
    void getBalance() {
        System.out.println("$200");
    }
}
class Abstract{
    public static void main(String[] args){
        A1 obj=new A1();
        System.out.print("The amount of money deposited to bankA\t");
        obj.getBalance();
        B1 obj1=new B1();
        System.out.print("The amount money of deposited to bankB\t");
        obj1.getBalance();
        System.out.print("The amount money of deposited to bankC\t");
        C1 obj2=new C1();
        obj2.getBalance();


    }
}

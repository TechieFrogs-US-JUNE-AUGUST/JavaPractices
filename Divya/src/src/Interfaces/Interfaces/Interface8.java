package Interfaces;
interface NewA{
    void method();
}
class A1 implements NewA{
    class Inside{
        void Inside(){
            System.out.println("inside class method");
        }
    }
  public  void method(){
       System.out.println("interface method ");
   }
}
public class Interface8 {
    public static void main(String[] args) {
        A1 obj = new A1();
         obj.method();
         A1.Inside obj1=obj.new Inside();
         obj1.Inside();
    }
}

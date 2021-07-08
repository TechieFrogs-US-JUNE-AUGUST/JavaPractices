abstract class Parent{
    void message(){}
}
class firstSubClass extends Parent{
    void message(){
        System.out.println("This is first SubClass");
    }
}
class secondSubClass extends Parent{
    void message(){
        System.out.println("This is second SubClass");
    }
  } 
public class Ass4Prog1 {
   public static void main(String[] args){
       firstSubClass obj=new firstSubClass();
       obj.message();
       secondSubClass obj1=new secondSubClass();
       obj1.message();
   } 
}

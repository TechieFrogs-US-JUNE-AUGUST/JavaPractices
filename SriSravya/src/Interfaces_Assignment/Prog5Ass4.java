

interface FastFood{                //interface
    void fries();
    void burger();                //abstract methods
    void tortilla();
}
class Sandwich implements FastFood{           //class implementing interface
   public void fries(){
        System.out.println("Peri-Peri Fries");
    }
   public void burger(){                      //overriding method
       System.out.println("Cheese Burger");
   }
   public void tortilla(){
       System.out.println("Tortilla");
   }
}
public class Prog5Ass4 {
    public static void main(String[] args) {
        Sandwich obj=new Sandwich();                //creating obj for subclass
        obj.fries();                               //calling overridden method with the subclass object
        obj.burger();
        obj.tortilla();
    }
}

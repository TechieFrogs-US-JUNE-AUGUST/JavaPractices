package Interface;

interface FastFood{
    void burger();
    void fries();
    void softDrink();
}

public class Sandwich5 implements FastFood {

    
    public void burger() {
        System.out.println("Burger");
        
    }

    public void fries() {
        System.out.println("French Fries");
    }

    public void softDrink() {
        System.out.println("Sprite");
    }

    public static void main(String[] args) {
        Sandwich5 sandwichobj=new Sandwich5();
        sandwichobj.burger();
        sandwichobj.fries();
        sandwichobj.softDrink();
    }
    
    
}

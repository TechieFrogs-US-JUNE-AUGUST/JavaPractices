package Interfaces;
interface FastFood{
    void noodles();
    void burger();
    void samosa();
}
class Sandwich implements FastFood{
    void sandwich(){
        System.out.println("sandwich is a fast food item");
    }
    public void noodles(){
        System.out.println("Noodles is a fast food item");
    }
    public void burger(){
        System.out.println("burger is a fast food item");
    }
    public void samosa(){
        System.out.println("samosa is a fastfood item");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        Sandwich obj = new Sandwich();
        obj.noodles();
        obj.burger();
        obj.samosa();
        obj.sandwich();
    }
}
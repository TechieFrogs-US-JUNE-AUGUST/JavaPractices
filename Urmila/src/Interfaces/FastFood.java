package Interfaces;

 interface FastFood{
    void pizza();
    void burger();
}
class Sandwich implements FastFood{
    void sandwich(){
        System.out.println("sandwich is a fast food item");
    }
    public void pizza(){
        System.out.println("Pizza is a fast food item");
    }
    public void burger(){
        System.out.println("burger is a fast food item");
    }
}
 class AddFastFood {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.pizza();
        sandwich.burger();
        sandwich.sandwich();
    }
}
interface FastFood{
    void pancake();  // interfaces have method which are abstract, so no body.
    void waffle();   // "public abstract" for every method()
}
class Sandwich implements FastFood{
    public void pancake(){ //have to implement all the methods from FastFood
        System.out.println("Pancake from the sandwich");
    }
    public void waffle(){
        System.out.println("Waffle from the sandwich");
    }
}
interface Interface5{
    public static void main(String[] args){
    Sandwich sandwich = new Sandwich();
    sandwich.pancake();
}
}
package Interfaces;
interface FastFood{
    abstract void noodles();
    abstract void burger();
}
public class Sandwich implements FastFood {
   public void noodles (){
    System.out.println("cost of noodles is 150");
    }
    public void burger(){
        System.out.println("cost of burger is 200");
    }
    public static void main(String[] args) {
        
        Sandwich sc=new Sandwich();
        sc.burger();
        sc.noodles();
    }
}

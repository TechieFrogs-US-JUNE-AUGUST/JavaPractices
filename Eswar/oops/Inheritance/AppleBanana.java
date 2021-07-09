package oops.Inheritance;
class Apple{
int number_of_items=10;
}
class Banana extends Apple{
    int number_of_items=20;
    Banana(){

    }
    void show(){
        System.out.println("value of apple class "+super.number_of_items);
        System.out.println("value of banana class "+number_of_items);
    }
}
public class AppleBanana {
    public static void main(String[] args) {
        Banana b=new Banana();
        b.show();
    }
}

class Apple {
    Apple(){}
        int number_of_items;
        Apple(int number_of_items){
        }
}
class Banana extends Apple{
    int number_of_items;
    Banana(int number_of_items){
        this.number_of_items=number_of_items;
    }
    void show(){
        System.out.println(number_of_items);
    }
}
public class Fruits {
    public static void main(String[] args) {
        System.out.print("number of items of Banana:");
        Banana obj = new Banana(7);
        obj.show();
        System.out.print("number of items of Apple:");
        obj.show();
    }
}
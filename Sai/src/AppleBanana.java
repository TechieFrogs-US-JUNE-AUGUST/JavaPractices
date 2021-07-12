class Apple{
    int number_of_items = 100;
    public void show(){
        System.out.println("Number of items from Class Apple = "+ number_of_items);
    }
}
class Banana extends Apple{
    int number_of_items = 500;
    Banana(){}
    public void show(){
        super.show(); // calling super class Apple method to sub class Banana by "super.superclassmethod"
        System.out.println("Number of items from Class Banana = "+ number_of_items);
    }
}
class AppleBanana{
    public static void main(String[] args){
        Banana b = new Banana();//in 11th line, i called super class Apple method.
        b.show();       // So no need to create instance and call again,it will call in subclass method
    }
}
package Methods;

class A{
    static void display(){
        System.out.println("Parent");
    }
}
class B extends  A{
    static void display(){
System.out.println("child");
    }
} 
class AddParent{
    public static void main(String[] args){
    
        A.display();
        B.display();

    }
}
package Methods;
class ClassA{
    static void printOutput(){
System.out.println("parent");
    }
}
class ClassB extends ClassA{
    static void printOutput(){
        System.out.println("child");
    }
}

public class ParentChild {
    public static void main(String[] args) {
        ClassA.printOutput();
        ClassB.printOutput();
        ClassA obj=new ClassB();
        obj.printOutput();
    }
    
}

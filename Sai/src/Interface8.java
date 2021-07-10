interface Show{
    void show();
}
class Outer implements Show{
    class Inner{
        void inner(){
            System.out.println("Inside the inner class");
        }
    }
    public void show(){
        System.out.println("From the interface");
    }
}
public class Interface8{
    public static void main(String[] args){
        Outer outerObj = new Outer();
        // to access the inner class method, we need to create an object for an outer class
        //outerObj.show();  
        //creat an object for inner class using an outer class name and outer object
        Outer.Inner innerObj = outerObj.new Inner();// instance for an inner class
        innerObj.inner();
    }
}

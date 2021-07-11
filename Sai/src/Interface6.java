interface OneInterface{ // 1st interface
    void one1();     // 2 methods
    void one2();
}
interface TwoInterface{ //2nd interface
    void two1();    // 2 methods
    void two2();
}
interface ThreeInterface{ // 3rd interface
    void three1();     //2 methods
    void three2();
}
// new interface is inheriting from all the above interfaces, for that we used "extends" keyword
interface NewInterface extends OneInterface,TwoInterface,ThreeInterface{ 
    void newMethod();  // creating a new method for the NewInterface
}
class ConcreteClass{}  //creating the new concrete class
class NewClass extends ConcreteClass implements NewInterface{
    //this NewClass is inherited from "ConcreteClass" and implements the "NewInterface" interface
    public void one1(){//can not reduce the visibility for the inherited method,so giving public here
        System.out.println("From 1nd interface 1st method");
    }
    public void one2(){
        System.out.println("From 1nd interface 2nd method");
    }
    public void two1(){
        System.out.println("From 2st interface 1st method");
    }
    public void two2(){
        System.out.println("From 2nd interface 2nd method");
    }
    public void three1(){
        System.out.println("From 3rd interface 1st method");
    }
    public void three2(){
        System.out.println("From 3rd interface 2nd method");
    }
    public void newMethod(){
        System.out.println("From the Newinterface");
    }
}
public class Interface6{
    public static void main(String[] args){
        NewClass Obj = new NewClass(); // creating an instance
        Obj.one1(); // accessing the methods
        Obj.one2();
        Obj.two1();
        Obj.two2();
        Obj.three1();
        Obj.three2();
        Obj.newMethod();
    }

}
class A{    
    int i=5,j=10;
    A(){}   // constructors without parameters
    public void show(){
        System.out.println("i = "+i+" & j = "+j);
    }
}class B extends A{
    int k=15;
    B(){}
    public void show(){
        //super.show();
        System.out.println("k = "+k);
    }
}
class OverrideExample{
    public static void main(String[] args){
        A obj = new B(); //for override,use class A(parent class) reference but class B(subclass) object
        obj.show();  //runs the method in B class
    }
}
/* for ovverride reference with an example
  class Animal {
    public void move() {
        System.out.println("Animals can move");
     }
  }
    class Dog extends Animal {
     public void move() {
        super.move();   // invokes the super class method
        System.out.println("Dogs can walk and run");
     }
  }
    public class TestDog {
       public static void main(String args[]) {
        Animal b = new Dog();   // Animal reference but Dog object
        b.move();   // runs the method in Dog class
     }
  }*/
package Inheritance;

 class Parent2 {
     private void display1(){
            System.out.println("this is parent class");
        }
    }
    class C extends Parent2 {
       public void display() {
           System.out.println("this is child class");
        }
 }
    public class Parent3{
        public static void main(String[] args) {
            Parent2 obj1 = new Parent2();
          //  obj1.display1();
            C obj2=new C();
            obj2.display();
            //obj2.display1();
        }
    }

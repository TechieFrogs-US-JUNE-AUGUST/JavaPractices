
 class ClassB {
     static void display() {
         System.out.println("parent");
     }
 }
  public class ClassA extends ClassB{
         static void display(){
             System.out.println("child");
        }
        public static void main(String[] args){
    ClassB obj2=new ClassB();
    obj2.display();
    ClassA obj3=new ClassA();
    obj3.display();
    ClassB obj1=new ClassA();
    obj1.display();
        }
}

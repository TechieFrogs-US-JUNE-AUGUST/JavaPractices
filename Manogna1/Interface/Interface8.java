package Interface;
interface A1{
   public void a1();
}
class Classc1 implements A1{
        class InnerClass{
            void innerClass(){
                System.out.println("Inner class Method");
            }
            
        }

        public void a1() {
            System.out.println("a1");
           
        }    

}

public class Interface8 {
    public static void main(String[] args) {
        Classc1 classObj=new Classc1();
        classObj.a1();
        Classc1.InnerClass innerObj=classObj.new InnerClass();
        innerObj.innerClass();

    }
    
}

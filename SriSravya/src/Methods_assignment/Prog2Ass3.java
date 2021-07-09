package Methods_assignment;

class Methods{                          //parent class
    void Method1(int a, char c){              //method overloading
        System.out.println("int is:" +a + " char is:" +c);
    }
    void Method1(char c, int a){
        System.out.println("char is:" +c + " int is:" +a);
    }
}
public class Prog2Ass3 {
   public static void main(String[] args){
     Methods m=new Methods();                     //creating obj
     m.Method1('A', 10);                         //calling method
    // m.Method1(20,'B');
   } 
}

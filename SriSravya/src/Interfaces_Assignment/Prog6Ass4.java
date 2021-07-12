

interface A{                            //interface1
    void a1();                          //abstract method
    void a2();
}
interface B{                           //interface2
    void b1();
    void b2();
}
interface C{                          //interface3
    void c1();
    void c2();
}
interface D extends A,B,C{             //inheritance
    void d();
}
class newClass{                         //concrete class
    public void example(){

    }
}
class newClass1 extends newClass implements D{   //inheritance with extend and implement
   public void a1(){                         
       System.out.println("a1");
   }
   public void a2(){                            //overriding methods
       System.out.println("a2");
   }
   public void b1(){
       System.out.println("b1");
   }
   public void b2(){
       System.out.println("b2");
   }
   public void c1(){
       System.out.println("c1");
   }
   public void c2(){
       System.out.println("c2");
   }
   public void d(){
       System.out.println("d");
   }
 }
public class Prog6Ass4{
    public static void m1(A A){               //method with passing interfaces in arguments..here A is ref variable of class A,compiler will call m1()method of A
        A.a1();                               //calling one of the method with 'interfacename.methodname'
    }
    public static void m2(B B){
        B.b1();
    }
    public static void m3(C C){
        C.c1();
    }
    public static void m4(D D){
        D.d();
    }
    public static void main(String[] args){
        newClass1 obj=new newClass1();         //creating obj for subclass
        m1(obj);                              //passing the obj to each of the methods
        m2(obj);
        m3(obj);
        m4(obj);  
    }
}

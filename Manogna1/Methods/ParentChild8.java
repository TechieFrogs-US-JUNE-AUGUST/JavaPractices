package Methods;



class A{
    void display()
   {
    System.out.println("Parent");
    }
}
class B extends A{
     void display()
    {
        System.out.println("Child");
    }
}

public class ParentChild8 {
    public static void main(String[] args) {
        A a = new A(); 
       
       // B.display();
        A b=new B();
        b.display();

    }
    
}

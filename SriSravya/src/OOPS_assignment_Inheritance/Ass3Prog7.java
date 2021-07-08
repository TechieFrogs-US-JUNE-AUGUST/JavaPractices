package OOPS_assignment_Inheritance;
class Counter{                   //subclass
    int i=3;
    void increment(){                 //method
        System.out.println("i=" +i);
    }
}

public class Ass3Prog7 extends Counter{           //inheritance
    public static void main(String[] args){
        Counter s=new Counter();     
        s.increment();               //calling the method
    }
}

package Methods;

class IntegerI1{
    int i;
    void printNum(){
    System.out.println(i);
    }
}

class IntegerJ1{ 
    int j;
    void printNum(){
        System.out.println(j);
    }
}

public class Integers7_1 {
    public static void main(String[] args) 
    {
        IntegerI1 i1=new IntegerI1();
        IntegerJ1 j1=new IntegerJ1();
        i1.i=10;
        j1.j=15;
        i1.printNum();
        j1.printNum();
        
}
}

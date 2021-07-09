package Methods;



class IntegerI{
    int i;
    void printNum(){
    System.out.println(i);
    }
}

class IntegerJ extends IntegerI{ //IntegerJ is the Subclass
    int j;
    void printNum(){
      System.out.println(j);
      super.printNum();
    }
}
public class Integers7 {
    public static void main(String[] args) {
        IntegerJ j=new IntegerJ();
        j.i=10;
        j.j=15;
        //j.j=j.i;
        j.printNum();
        
    }
    
}

package Methods;

class PrintNumber{

  public void printn(int a){   //method overloading
    System.out.println(a);

    }
    public void printn(double a){
      System.out.println(a);

    }
    public void printn(boolean a){
      System.out.println(a);
    }

    public void printn(long a){
      System.out.println(a);
    }  

}

public class PrintNumber1{
  public static void main(String[] args) {
    PrintNumber pn= new PrintNumber();
    pn.printn(2);
    pn.printn(2.5);
    pn.printn(true);
    pn.printn(55555.777);
    
  }
}

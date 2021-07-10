package Methods;// methods overloading

 public class PrintNumber { // creating methods for int, double,float,long ,boolean.(overloading)
     public void printnumber( int x){
         System.out.println(x);
     }
     public void printnumber(boolean x){
         System.out.println(x);
     }
     public void printnumber(float x){
        System.out.println(x);
     }
     public void printnumber(double x){
         System.out.println(x);
     }
     public void printnumber(long x){
         System.out.println(x);
     }
}
class AddPrintNumber{
    public static void main(String[] args){
        PrintNumber printnumber = new PrintNumber();
        printnumber.printnumber(5); //integer version will be called 
        printnumber.printnumber(true);//boolean version will be called
        printnumber.printnumber(5.7);//float version will be called
        printnumber.printnumber(25.2568);// double version will be called
        printnumber.printnumber(156478992);//long version will be called
    }
}


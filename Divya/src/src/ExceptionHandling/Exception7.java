package ExceptionHandling;

public class Exception7 {
    public static void main(String[] args)throws Exception{
        int n=10,n1=0,n2;
        try{
            n2=n/n1;
            System.out.println("the result is:"+n2);
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception occured:"+ae);
            try{
                throw new NumberFormatException();
            }catch(NumberFormatException ne){
                System.out.println("chained exception thrown "+ne);
            }
        }
    }
}

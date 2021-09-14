package ExceptionHandling;

public class Exception23 {
    public static void main(String[] args){
        int n1=10,n2=0,n3;
        try{
            n3=n1/n2;
            System.out.println(n3);
        }catch(ArithmeticException ae){
            System.out.println("something went wrong");
        }finally{
            System.out.println("out of try and catch blocks");
        }
    }
}
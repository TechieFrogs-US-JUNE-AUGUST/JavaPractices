package Exceptions;

public class Exception8 {
    static double method(double i){
        return i+3;
    }
    static int method(int i,int j) 
    {
        return i+j;
    }
    static int method(int i) //throws Exception
    {
        return i/0;
    }
    static double method(int x,double y,double z)
    {
        return x*y+z;
    }

       
    public static void main(String[] args) {
        try{
            System.out.println(method(3.0));  //calling methods
            System.out.println(method(5,7));
            System.out.println(method(7));  //throws exception
            System.out.println(method(5,7.0,2.0));
        }catch(Exception e){       //exception handled in catch block
            System.out.println("Exception Occurs " +e);
        }
        
    }
    
}

package Exceptions;

public class Exception18 {
    int m;
    public void setAge(int age){
        if(age<10|| age>20)
            throw new IllegalArgumentException(Integer.toString(age));      
        else
        m= age;
    }
    public static void main(String[] args) {
        Exception18 e1= new Exception18();        //creating instance
        e1.setAge(15);                    //calling method by passing i/p value using instance obj
        System.out.println(e1.m);
        Exception18 e2= new  Exception18();
        e2.setAge(45);
        System.out.println(e2.m);
        
    }
}    
    


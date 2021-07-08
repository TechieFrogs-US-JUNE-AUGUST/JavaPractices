package Methods_assignment;

class PrintNumber{              //parent class
    void printn(int a){          //method
        System.out.println(a);
    }
    void printn(double a){           //method overloading
        System.out.println(a);
    }
    void printn(float a){
        System.out.println(a);
    }
}
public class Prog1Ass3 {
    public static void main(String[] args){
        PrintNumber obj=new PrintNumber();         //creating obj of parent class
        obj.printn(2);                            //calling method with only one parameter and the control goes to the method having one parameter
        obj.printn(2.12345);
        obj.printn(2.5);
    } 
}

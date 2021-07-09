package Methods_assignment;
class Area{                       //parent class
    void Rectangle(int l,int b){               //method with 2 parameters
      System.out.println("Area of Rectangle is: " +(l*b));
    }
    void Square(int a){                       //method with one parameter
        System.out.println("Area of Square is: " +(a*a));
    }
}
public class Prog3Ass3 {
    public static void main(String[] args){
        Area obj=new Area();                
        obj.Rectangle(4,5);
        obj.Square(4);
    }
}

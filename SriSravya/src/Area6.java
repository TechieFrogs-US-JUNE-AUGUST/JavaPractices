import java.util.Scanner;
public class Area6 {
    int length; 
    int breadth;
    
     void setDim(int l, int b){            //method with arguments
       this.length=l;
       this.breadth=b;
        
    }
     int getArea(){                   //method to calculate the area of rectange
         return length*breadth;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length");
        int l,b;
        l=s.nextInt();
        System.out.println("Enter breadth");
        b=s.nextInt();     
        Area6 a=new Area6();                  //object 
        a.setDim(l,b);             //calling method with parameters
       System.out.println("Area is " +a.getArea());
    }
}

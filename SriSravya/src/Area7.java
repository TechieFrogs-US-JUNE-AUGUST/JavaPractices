import java.util.Scanner;
class Assignment2Prog7{
//public class Area7{
    int length;
    int breadth;
    
     Assignment2Prog7(int l, int b){      //paranthesized constructor
     length=l;
     breadth=b;
    }
    public int returnArea(){         //method to calculate the area of rectangle
        return length*breadth;
    }  
}
//class Assignment2Prog7{
    public class Area7{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int l,b;
        System.out.println("Enter length");
        l=s.nextInt();
        System.out.println("Enter breadth");
        b=s.nextInt();
        Assignment2Prog7 a=new Assignment2Prog7(l,b);       //created object 'a' and passing values
        System.out.println("Area is "+a.returnArea());
    }
}

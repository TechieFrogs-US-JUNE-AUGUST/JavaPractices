import java.util.Scanner;
public class Average {
    int a,b,c;                   // initialisation of 3 variables
    double average;
    Scanner s=new Scanner(System.in);             //creation of scanner object
    void calculate(){
        System.out.println("enter a value");
        a=s.nextInt();
        System.out.println("enter b value");
        b=s.nextInt();
        System.out.println("enter c value");
        c=s.nextInt();
        average=(a+b+c)/3;                            // formulae to find average of three  numbers
        System.out.println("Average of three numbers="+average);
    }
    public static void main(String[] args){
        Average obj1=new Average();                     //creation of object for a given class
        obj1.calculate();                                // method to print values
    }
}


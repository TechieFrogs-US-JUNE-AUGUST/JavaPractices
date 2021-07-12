import java.util.Scanner;
class Distance{
    double feet , inches;  // double for .00 value
    void getdistance() { 
        Scanner in = new Scanner(System.in);  //scanner for taking the values from user
        System.out.print("Enter feet : "); 
        feet = in.nextDouble();               //giving how feet
        System.out.print("Enter inches : ");
        inches = in.nextDouble();             // giving how many inches 
        in.close();        //closing the scanner
    }
    void addDistance(Distance d1, Distance d2){   //method for adding the feet and inches
        double sumofFeet = d1.feet + d2.feet;
        double sumofInch = d1.inches + d2.inches;
        System.out.println(sumofFeet + " " + sumofInch);
    }
}
public class AddTwoDistance{    //main class
	public static void main(String[] args){
            Distance d1 = new Distance(); // creating an instance
            Distance d2 = new Distance();  // creating an instance
            System.out.println("Enter first distance ");
            d1.getdistance(); 
            System.out.println("Enter second distance ");
            d2.getdistance(); 
            d1.addDistance(d1,d2); //d3.addDistance(d1,d2);
	}
}
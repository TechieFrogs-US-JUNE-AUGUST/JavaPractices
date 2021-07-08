import java.util.Scanner;

class Distance{
 
    int feet, inches;
    void getDistance(){                //created a method for reading the feet and inches
        Scanner s=new Scanner(System.in);
        System.out.println("Enter feet" );
        feet=s.nextInt();
        System.out.println("Enter inches" );
        inches=s.nextInt();
    }
    void showDistance(){                      // created a method for showing the output
        System.out.println("Feet: " +feet + "Inches: " +inches);
   }
    void AddDistance(Distance d1,Distance d2){      //created method to add distances
        feet=d1.feet+d2.feet+(inches/12);
        inches=d1.inches+d2.inches;
        inches=inches%12; 
    }
}

public class AddDistance11{
    public static void main(String[] args){
      Distance d1=new Distance();               //creating object 
      Distance d2=new Distance();
      Distance d3=new Distance();
     System.out.println("Enter d1 distance");
     d1.getDistance();                       //calling method
     System.out.println("Enter d2 distance");
     d2.getDistance();
     d3.AddDistance(d1, d2);
     System.out.println("Total distance is");
     d3.showDistance();                  //calling method for displaying output
    }  
}

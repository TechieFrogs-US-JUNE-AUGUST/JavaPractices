import java.util.Scanner;
 public class AddDistance {               //main  class
    int feet;                                         //variable declaration
    int inches;
    public void getDistance() {
        Scanner s = new Scanner(System.in);     //creation of object for Scanner class
        System.out.println("enter feet");
        feet = s.nextInt();
        System.out.println("enter inches");
        inches = s.nextInt();
    }
    void showDistance() {                              //method to show distances
        System.out.println("feet:" + feet + "\tinches:" + inches);
    }   //method tp print values
    void addDistances(AddDistance d1,AddDistance d2){         //add method to add two distances
inches=d1.inches+d2.inches;
feet=d1.feet+d2.feet+(inches/12);                     // calculation part
inches=inches%12;
    }
    public static void main(String[] args){
        AddDistance d1=new AddDistance();
        AddDistance d2=new AddDistance();
        AddDistance d3=new AddDistance();
        System.out.println("enter first distance");
        d1.getDistance();
        System.out.println("enter second distance");
        d2.getDistance();
        d3.addDistances(d1,d2);
        System.out.println("total distance=");
        d3.showDistance();
    }
}

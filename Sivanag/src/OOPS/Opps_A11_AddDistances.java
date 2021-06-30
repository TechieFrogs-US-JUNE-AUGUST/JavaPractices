import java.util.Scanner;

class AddDistance
{
    int feet;
    int inch;
    AddDistance()
    {

    }
    AddDistance(int feet,int inch)
    {
        this.feet=feet;
        this.inch=inch;

    }
    void Distanceadd(AddDistance dd,AddDistance dd1)
    {
        AddDistance temp =new AddDistance();
        temp.feet=dd.feet+dd1.feet;
        temp.inch =dd.inch+dd1.inch;
        if (temp.inch >= 12)    //12 inches is 1 Feet
        {
            int extra =  (temp.inch)/12;
            temp.feet += extra;
            temp.inch -= (extra*12);

        }
        System.out.println("Sum of Distance \n" + "Feets : " +temp.feet+ "\nInches : " + +temp.inch);
    }

}
public class Opps_A11_AddDistances {
   public static void main(String[] args)
    {       
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Distance ");
    System.out.print("Enter Feet : ");
    int f1 =sc.nextInt();
    System.out.print("Enter Inches ");
    int i1 =sc.nextInt();
    System.out.println("Enter Second Distance ");
    System.out.print("Enter Feet : ");
    int f2 =sc.nextInt();
    System.out.print("Enter Inches ");
    int i2 =sc.nextInt();
    AddDistance ad1 =new AddDistance(f1,i1);
    AddDistance ad2 =new AddDistance(f2,i2);
    ad2.Distanceadd(ad1, ad2);



    sc.close();
}
}

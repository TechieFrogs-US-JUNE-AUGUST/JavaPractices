
import java.util.Scanner;

class AddDistance{

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
    void Distanceadd(AddDistance d1,AddDistance d2)
    {
        AddDistance ad = new AddDistance();
        ad.feet=d1.feet+d2.feet;
        ad.inch=d1.inch+d2.inch;
        if(ad.inch>=12)
        {
            int x= (ad.inch)/12;
            ad.feet=ad.feet+x;
            ad.inch=ad.inch-(x*12);

            System.out.println("Sum of Distance " + "Feets : " +ad.feet+ "Inches : " + +ad.inch);
        
        }
        else{
        
        System.out.println("Sum of Distance " + "Feets : " +ad.feet+ "Inches : " + +ad.inch);
        }
        
    }

    }
public class Distance
 {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter First Distance");
    System.out.println("Enter Feet :");
    int f1=sc.nextInt();
    System.out.println("Enter Inches");
    int i1=sc.nextInt();
    System.out.println("Enter Second Distance");
    System.out.println("Enter Feet :");
    int f2=sc.nextInt();
    System.out.println("Enter Inches :");
    int i2=sc.nextInt();
    AddDistance ad1= new AddDistance(f1,i1);
    AddDistance ad2=new AddDistance(f2, i2);
    ad2.Distanceadd(ad1, ad2);
    sc.close();
   } 
}

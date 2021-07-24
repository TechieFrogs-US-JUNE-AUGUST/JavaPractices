package Abstract;
import java.util.Scanner;
 abstract class Marks
{
    abstract double getPercentage();
}
 class studentA extends Marks
{
    int english,telugu,hindi;
    studentA(int english,int telugu,int hindi)
    {
        this.english=english;
        this.telugu=telugu;
        this.hindi= hindi;
    }
    double getPercentage() 
    {
        return ((english+telugu+hindi)/3);
    }
}
 class studentB extends Marks
 {
    int maths,science,social,english;
     studentB(int maths,int science,int social,int english)
     {
        this.maths=maths;
        this.science=science;
        this.social=social;
        this.english=english;
    }
    double getPercentage() 
    {
    return ((maths+science+social+english)/4);
    }
}
public class PercentageAbstract 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks for maths ");
        int maths=sc.nextInt();
        System.out.println("enter marks for science ");
        int science=sc.nextInt();
        System.out.println("enter marks for social ");
        int social=sc.nextInt();
        System.out.println("enter marks for english ");
        int english=sc.nextInt();
        System.out.println("enter marks for telugu ");
        int telugu=sc.nextInt();
        System.out.println("enter marks for hindi ");
        int hindi=sc.nextInt();
        studentA s1=new studentA(english, telugu, hindi);
        System.out.println("percentage of student A is: "+s1.getPercentage());
        studentB s2=new studentB(maths, science, social, english);
        System.out.println("percentage of student B is: "+s2.getPercentage());
    }
}
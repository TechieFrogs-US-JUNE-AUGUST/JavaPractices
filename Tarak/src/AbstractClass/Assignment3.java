package AbstractClass;

import java.util.Scanner;

abstract class Marks{
    abstract double getPercentage();
}
class StudentA extends Marks{
    int maths,science,social;
    StudentA(int maths,int science,int social){
        this.maths=maths;
        this.science=science;
        this.social=social;
    }
    double getPercentage() {
    return ((maths+science+social)/300)*100;
    }
}
class StudentB extends Marks{
    int maths,science,social,english;
    StudentB(int maths,int science,int social,int english){
        this.maths=maths;
        this.science=science;
        this.social=social;
        this.english=english;
    }
    double getPercentage() {
    return ((maths+science+social+english)/400)*100;
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks for maths");
        int maths=sc.nextInt();
        System.out.println("enter marks for science");
        int science=sc.nextInt();
        System.out.println("enter marks for social");
        int social=sc.nextInt();
        System.out.println("enter marks for english");
        int english=sc.nextInt();
        StudentA s1=new StudentA(maths, science, social);
        System.out.println("percentage of student A is: "+s1.getPercentage());
        StudentB s2=new StudentB(maths, science, social, english);
        System.out.println("percentage of student B is: "+s2.getPercentage());
    }
}

package Interfaces;
abstract class Marks
{
    abstract void getPercentage();
}
class StudentA extends Marks
{
    int sub1,sub2,sub3;
        void getPercentage() {
                int per;
                per =((sub1+sub2+sub3)/3);
                System.out.println("Percentage of Student A is " + per + "%");
        
    }
    StudentA(int sub1,int sub2,int sub3)
    {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }
}
class StudentB extends Marks
{
    int sub1,sub2,sub3,sub4;
    void getPercentage() {
            int per;
            per =((sub1+sub2+sub3+sub4)/4);
            System.out.println("Percentage of Student B is " + per + "%");
    
}
     
    StudentB(int sub1,int sub2,int sub3,int sub4)
    {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
}
public class Abstract_Assignment3 {
    public static void main(String[] args) {
        StudentA objstudentA = new StudentA(70, 90, 61);
        StudentB objstudentB = new StudentB(60,70, 90, 80);
        objstudentA.getPercentage();
        objstudentB.getPercentage();
    }
    
}

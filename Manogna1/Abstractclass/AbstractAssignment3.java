package Abstractclass;

abstract class Marks{
    public abstract float getPercentage();
}

class A extends Marks{
    int marks1,marks2,marks3;
    A(int m1,int m2,int m3)
    {
        this.marks1=m1;
        this.marks2=m2;
        this.marks3=m3;
    }
    
    public float getPercentage() {
        float total;
        total=((marks1+marks2+marks3)/(float)300)*100;
        System.out.println("Percentage of Marks for StudentA : " +total);
        return total;
    }
}
    class B extends Marks{
        int marks1,marks2,marks3,marks4;
        B(int m1,int m2,int m3,int m4)
        {
            this.marks1=m1;
            this.marks2=m2;
            this.marks3=m3;
            this.marks4=m4;
        }

       
        public float getPercentage() {
           float total;

        total=((marks1+marks2+marks3+marks4)/(float)400)*100;
        System.out.println("Percentage of Marks for StudentA : " +total);
            
            return total;
        }

        
    }
  
public class AbstractAssignment3 {
    public static void main(String[] args) {
        A aobj=new A(50,60,70);
       aobj.getPercentage();
       B bobj = new B(50,60,70,80);
       bobj.getPercentage();

    }
    
}

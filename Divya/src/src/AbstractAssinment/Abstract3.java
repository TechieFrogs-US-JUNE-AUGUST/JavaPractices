package AbstractAssinment;
abstract class Marks{
    double Sci,Soc,Mat,Eng;
    abstract double getPercentage();
}
class StudentA extends Marks{
    StudentA(double Sci,  double Mat, double Eng){
        this.Sci=Sci;
        this.Mat=Mat;
        this.Eng=Eng;
    }
    double  getPercentage(){
        double percentage=((Sci+Mat+Eng)/300)*100;
        System.out.print("the percentage of studentA\t");
        return percentage;
    }
}
class StudentB extends Marks{
    StudentB(double Sci,double Mat,double Eng,double Soc){
        this.Sci=Sci;
        this.Mat=Mat;
        this.Eng=Eng;
        this.Soc=Soc;
    }
    double  getPercentage(){
        double Add=(Sci+Mat+Eng+Soc);
        Double C=Add/400;
        Double percentage=C*100;
        System.out.print("the percentage of studentB\t");
        return percentage;
    }
}
public class Abstract3 {
    public static void main(String[] args){
        StudentA obj1=new StudentA(50,60,70);
        StudentB obj2=new StudentB(50,70,80,60);
       System.out.println(obj1.getPercentage());
      System.out.println(obj2.getPercentage());
    }
}
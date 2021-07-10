import java.util.Scanner;
public class Average {
    double avg ;
    Average(double a, double b, double c){
avg = (a+b+c)/3;
}
}
class AverageNumber
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");   
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b ");  
        double b = scanner.nextDouble();    
        System.out.println("Enter the value of c");
        double c = scanner.nextDouble();
Average objt = new Average (a,b,c);
System.out.println("Average of three numbers is:" + objt.avg);
    }
}
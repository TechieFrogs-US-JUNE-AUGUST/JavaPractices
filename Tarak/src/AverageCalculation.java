import java.util.Scanner;

class Average{
int Average(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 3 values");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    return (a+b+c)/3;
}
}
public class AverageCalculation {
    public static void main(String[] args) {
        Average obj= new Average();
        System.out.println("Average is "+obj.Average());
    }
}

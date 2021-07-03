import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter i value");
       // System.out.println("enter j value");
      int i=sc.nextInt();
      //int j=sc.nextInt();
      int fact=1;
      for(int n=1;n<=i;n++)
              {
          fact= fact*n;
              }
              System.out.println("Factorial of " +i+ " is:" +fact);
      sc.close();
      /*for(int m=1;m<=j;m++)
      {
          FACT=FACT*m;
      }
        System.out.println("Factorial of " +j+ " is:" +FACT);*/
      }
    }
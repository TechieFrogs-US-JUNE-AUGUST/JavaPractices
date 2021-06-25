import java.util.Scanner;
public class Factorial8
{  
 public static void main(String args[])
 {  
  int i,fact=1;    // defining fact=1 since least value is 1
  int n;
  Scanner sr=new Scanner(System.in);
  System.out.println("enter number");
  n=sr.nextInt();   // given input to calculate factorial
  for(i=1;i<=n;i++)
  {    
      fact=fact*i;
 }

  System.out.println("Factorial of "+n+" = "+fact);    
 }  
}
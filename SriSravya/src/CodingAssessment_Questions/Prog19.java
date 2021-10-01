// Write a program to find the sum of odd numbers between 100 and 1000

package CodingAssessment_Questions;

public class Prog19 {
  public static void main(String[] args) {
      int sumO= 0;
      for(int i= 100; i<=1000; i++){
          if(i%2 != 0)
          sumO= sumO + i;
      }
      System.out.println("Sum of Odd numbers between 100 and 1000 is: " +sumO);
  }  
}

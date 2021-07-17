public class Largestamong3Numbers
{

    public static void main(String[] args)
    {
     int num1 = 7;     // initializing numbers
     int num2 = 4;
     int num3 = 9;
    if(num1 >= num2)   // comparing numbers num1 with num2
      {
    if (num1 >= num3)  //comparing numbers num1 with num3
    System.out.println(num1 + "is the largest number"); 
    else
    System.out.println(num3 +" is the largest number");
      }
    else
      {
    if(num2 >= num3)
    System.out.println(num2 +"is the largest number");
    else
    System.out.println(num3 + "is the largest number");
      }
    }

}
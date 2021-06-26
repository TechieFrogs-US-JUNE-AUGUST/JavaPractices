/* public class ControlStatements {
  public static void main(String[] args){
    int age=20;
    if(age>18)
  {
     System.out.println("Age is greater than 18");
  }
}
}
*/

/*EVen number program using if-else
int num=13;
if(num%2==0){
   System.out.println("even number");
   }else{
   System.out.println("odd number");
   }
  }
 } */

/*
//Even number program using if-else using ternary//
public class ControlStatements {
    public static void main(String[] args){
int num=12;
String output=(num%2==0)?"even":"odd";
System.out.println(output);
    }
} 
*/

/* PositiveNegative
public class ControlStatements {
  public static void main(String[] args){
  int n=-4;
  if(n>0){
  System.out.println("Positive");
  }else if(n<0){
  System.out.println("Negative");
  } else{
  System.out.println("Zero");
  }
 }
}
*/

/*nested if
public class ControlStatements{
  public static void main(String[] args){
    int age=50;
    int weight=40;
    if(age>30){
      if(weight>50){
        System.out.println("Go to hospital");
         }
      else{
        System.out.println("No need");
        }
      }
      else{
        System.out.println("Age should be greater than 30");
        }
      }
    } */

/*switch case
    public class ControlStatements{
      public static void main(String[] args) {
        int num=20;
        switch(num){
          case 10: System.out.println("10");
          break;
          case 20: System.out.println("20");
          case 30: System.out.println("30");
          break;
          case 40: System.out.println("40");
          break;
          default:System.out.println("Not there");
        }
      }
    } */

    public class ControlStatements{
      public static void main(String[] args) {
        int num=2;
       //String s="B";
      char ch='b';
        switch(ch)
        {
          case 'a': System.out.println("Consonant");
          case 'b': System.out.println("Consonant");
                    System.out.println("Small letter");
          break;
          default:System.out.println("Wrong case");
        }
      }
    }

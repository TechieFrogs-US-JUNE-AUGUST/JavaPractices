import java.util.Scanner;
public class Patern0{
 public static void main(String[] args){
     char i,j,c;                              // variables declaration by using char data type
    System.out.println("enter c value");        //to enter user input value
    Scanner s=new Scanner(System.in);             // craetion of scanner object
   c=s.next().charAt(0);                      
  for( i='A';i<=c;i++){                           //initialisation of i with character A
     for( j='A';j<=i;j++){                         // initialisation of j with character A
     System.out.print(j) ;
     }                                            
System.out.println();
}
s.close();
}
}
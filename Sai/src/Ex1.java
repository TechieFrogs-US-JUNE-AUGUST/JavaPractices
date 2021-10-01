import java.util.Scanner;
public class Ex1 {
  public static void main (String[] args){
    Scanner scannerObj = new Scanner(System.in);
    System.out.print("Give the String: ");
    String str = scannerObj.nextLine();
    str = str.toLowerCase();
    char ch = scannerObj.next().charAt(0);
    int firstIndex = str.indexOf(ch); // gives the index value of 1st time occured 
    System.out.println("First occurrence of char 's'" +" is found at : " + firstIndex);
    int lastIndex = str.lastIndexOf(ch); // gives the last occured index value
    System.out.println("Last occurrence of char 's' is" +" found at : " + lastIndex);   
    int length = lastIndex - firstIndex ;
    System.out.print("The length in between the first and last occured s character is : " + length); 
    scannerObj.close();
  }
}

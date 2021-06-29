import java.util.Scanner;
public class SwappingTwoNumbers {
    public static void main(String[] args){
    int x,y;                //initialising variables
    System.out.println("enter x and y values");          //Taking user input values
   Scanner s=new Scanner(System.in);               //creating Scanner object
     x=s.nextInt();
     y=s.nextInt();
    x=x+y;
    y=x-y;                 //swapping of two variables without using temp 
    x=x-y;
    System.out.println("After swapping:"+"x= "+x+", y ="+y);
s.close();
}
}
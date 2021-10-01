import java.util.Scanner;

public class Exception20NumberFormat {
    public static void main(String[] args) {  
        Scanner scannerObj = new Scanner(System.in);
        System.out.print("Give input string : ");
        try {  
            String string = scannerObj.nextLine();
            int a = Integer.parseInt(string); //wrong input instead of a number, then we get NumberFormat 
            System.out.println(a);
        }catch(NumberFormatException ne){  
            System.out.println("From catch block");
            System.err.println("Invalid string in argumment");  
            ne.printStackTrace();
        }finally{
            scannerObj.close();
        }
    }
}
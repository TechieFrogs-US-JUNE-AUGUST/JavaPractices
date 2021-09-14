package Exceptions;

public class Exception20 {
    public static void main(String[] args) {
        try {
            int number=Integer.parseInt("Manogna");   //string canot be parsed into int    
            System.out.println(number);
        } 
        catch (NumberFormatException nfe) {            //it is handled here
            System.out.println("NumberFormat Exception occured" +nfe);
        }
    }
    
}

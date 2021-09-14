package Exceptions;

public class Exception12 {
    public static void main(String[] args) {
        try {
            Class.forName("Manogna"); //class not found Exception
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

            
        }
    }
    
}

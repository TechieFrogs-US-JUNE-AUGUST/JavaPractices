//NUMBERFORMAT EXCEPTION
//parsing means reading the value of one object to convert it into another type
//Here parseInt takes the string value and return a real number
package ExceptionHandling_Assignment;

public class Prog20 {
    public static void main(String[] args) {
        try {
            int n= Integer.parseInt("Sri");          //Here string "Sri" cannot be parsed to int so it throws NumberFormat Exception
            System.out.println(n);
        } 
        catch (NumberFormatException nfe) {            //it is handled here
            System.out.println("NumberFormat Exception occured" +nfe);
        }
    }
}

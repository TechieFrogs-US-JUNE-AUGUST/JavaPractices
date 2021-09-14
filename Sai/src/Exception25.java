import java.util.Scanner;
public class Exception25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give input");
        String s  = sc.nextLine();
        //String s = null;// if we intialize the string as null value then we get NullPinterException
        try {
            System.out.println("Inside try block");
            //System.out.println(34 / 0);
            
            if(s.equals("123"))
                System.out.println("Yes");
            else
                System.out.println("no");
            System.out.println(s);
        } catch (NullPointerException e) {
            System.out.println("from catch block");
            e.printStackTrace();
        } finally { 
            System.out.println("from finally block");
            sc.close();
        }
        System.out.println("i want to run");
    }
}

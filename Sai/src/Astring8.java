import java.util.Scanner;
public class Astring8{
    public static void main(String[] args){
        Scanner numericString = new Scanner(System.in);
        System.out.println("Give the input String : ");
        String name = numericString.nextLine();
        //String str = "0";
        //boolean numeric = true;
        boolean numeric = name.matches("-?\\d+(\\.\\d+)?"); // it gives true or false
        //stringname.matches("-?\\d+(\\.\\d+)?"); checks all negative , 0 , positice, float,decimal values.
        if(numeric)
            System.out.println(name+ " is a number");
        else
            System.out.println(name+ " is not a number");
        numericString.close();
    }
}
public class Astring6{
    public static void main(String[] args){
        String sEq = "Equals";
        String sEq1 = new String("Equals");
        System.out.println(sEq.equals(sEq1));// checks the string value only
        String sEq2 = "equals";
        System.out.println(sEq.equals(sEq2));//checks the lower and upper case also, case sensitive
        String sEq3 = " Equals";
        System.out.println(sEq.equals(sEq3));// string starts with space, which is not equal strings
        // it checks only string value. i wont check the references
    }
}
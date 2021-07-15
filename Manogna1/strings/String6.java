package strings;

public class String6 {
    public static void main(String[] args) {
        String str1="Manogna";
        String str2="MANOGNA";
        String str3=new String("Manogna");
        System.out.println(str1.equals(str2));//False (Both the strings are same but it checks for upper and lower cases aswell)
        System.out.println(str1.equalsIgnoreCase(str2));//true(As both the strings are same and for str2 it ignores the case)
        System.out.println(str1.equals(str3));//If both the strings are same it returns true
    }
    
}

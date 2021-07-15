package strings;

public class String7 {
    public static void main(String[] args) {
         String str1="Program";//   P

         String str2="Strings"; //  p q r s 
         String str3="Qrogram";
         String str4 ="Program";
        
         System.out.println(str1.compareTo(str2)); // so it will be -3 (p is 3times lower than s)
         System.out.println(str1.compareTo(str3)); // it will be -1  (p is 1 time lower than q)
         System.out.println(str2.compareTo(str1)); // it will be +3   (p is 3 times greater than s)
         System.out.println(str1.compareTo(str4)); // Both are Same so it will print 0 as output
    }
    
}

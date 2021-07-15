package strings;

public class String5 {
    public static void main(String[] args) {
        String str1="Manogna";
        String str2="MANOGNA";
        String str3="Manogna";
        String str4= new String("Manogna");
        System.out.println(str1==str2);//false (Both refers to same instance but its Casesensitive)
        System.out.println(str1==str3);// True(Both refers to same instance)
        System.out.println(str1==str4);// False (str1 refers to constant pool and str4 refers to non pool)
        
    }


    
}

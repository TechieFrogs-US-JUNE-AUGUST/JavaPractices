public class StringsPractice{
    public static void main(String[] args){
        String s = "Oneway";  // string literal, s saves in String Constant Pool
        String s1 = new String();  // in this s1 saves in Heap Area
        s1 = "Assigning the value"; // one more memory location is created here for s1
        String s2 = new String("Hi");
        char ch[] = {'s','a','i'};
        String s3 = new String(ch);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        // string Conactination
        String s4 = "Bell";
        s4.concat("Ring"); // here the value wont change, String is immutable.
        System.out.println("trying to change the value,but not changed  "+ s4);
        s4 = s4.concat("Ring");// it will change now, we are pointing to the same location
        System.out.println("Pointing to that, now it will change " + s4);
        String s5 = "Bell";// it wont create the new memory, it points to "s4- Bell" location only
        String s6 = "Bell";
        String s7 = " Bell";
        String s8 = "bell";  
        String s9 = new String("Bell");  
        //String Comparisions  - equals gives boolean value true or false
        System.out.println(s4.equals(s5)); //false, chaned the s4 value at 18th line
        System.out.println(s6.equals(s5));  // true , both are same
        System.out.println(s4.equals(s7));  // false, it looks same but space is there
        System.out.println(s6.equals(s8));  // false case sensitive of 1st letter
        System.out.println(s6.equalsIgnoreCase(s8));//for ignoreCase it checks the string, ignore the caps
        System.out.println(s6.equals(s9)); // true, equal checks only the string value
        System.out.println(s6 == s8);//false,"==" checks both strings and references(memory location also)
        // s1 == s2 (0) , s1 > s2 (positive value) , s1 < s2 (negative value)
        System.out.println(s6.compareTo(s5)); //0 same
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareTo(s8));// lower and upper case also
        System.out.println(s8.compareTo(s6));
        System.out.println(s6.compareToIgnoreCase(s8));// checks ony string value
    }
}
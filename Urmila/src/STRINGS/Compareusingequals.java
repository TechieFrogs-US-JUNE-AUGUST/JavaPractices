package strings;

public class Compareusingequals
 {
    public static void main(String[]args)
    {
     String s1 = "Hanshu";
     String s2 =  "Hanshu";
     String s3 = new String("Hanshu");
     //String s4 = "hanshu";
     System.out.println(s1==s2); // both refer to same instance
     System.out.println(s1==s3); //s3 refers to instance created in nonpool
     //System.out.println(s1==s4);
    }
}
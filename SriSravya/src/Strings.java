public class Strings {
    public static void main(String[] args) {
        String s="Sri Sravya";         //in heap and const. pool
        String s1=new String();        //some memory in heap
        s1="Hello";                   //it creats new instance and points memory alloc to s1
        String s2=new String("Welcome");       //in heap
        char ch[] = {'h','i'};
        String s3=new String(ch);
        System.out.println(s1+ "   " +s2+"    " +s3);

        String str="Sri";
        String str1="Sri";
        String str2=new String("SriSravya");
        //str.concat("Sravya");
        str=str.concat("Sravya");
        System.out.println(str);
        System.out.println(str+ "  "+str1);
        System.out.println(str.equals(str1));   //only checks string is same or no without considering case sensitive etc
       // System.out.println(str.equals(str2));
        System.out.println(str == str2);        //along with string value it checks obj ref too i.e address whether in heap or const pool
        System.out.println(str+ " "+str1+" "+str2);
        System.out.println(str1.compareTo(str));       //it checks with length....s1==s2-->0 ; s1>s2-->+ve value; s1<s2--> -ve value
       // System.out.println(str.compareTo(str1));
       System.out.println(str1.compareToIgnoreCase(str2));   //it also checks the number of strings and ignores case sensitive etc
    }
}

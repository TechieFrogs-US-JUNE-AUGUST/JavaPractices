public class Strings1 {
    public static void main(String[] args) {
        String s="Sri Sravya";
         //index= 0123456789
        System.out.println(s.substring(2));            //prints from 2nd index
        System.out.println(s.substring(2, 6));         //starting with 2nd index and after 6th index it doesn't print anything 
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());                 //eliminates spaces before and after the string
        System.out.println(s.startsWith("S"));
        System.out.println(s.endsWith("vya"));
        System.out.println(s.charAt(4));
        System.out.println(s.length());

        int a=50;
        String s1=String.valueOf(a);            //valueof() converts any type such as int,float etc into string
        System.out.println(s1+10);

        String s2="My name is Sri Sravya. name can be also written as SriSravya";
        System.out.println(s2.replace("name", "fullname"));
        System.out.println(s2.replace("S", "K"));               //replaces char
    }
}

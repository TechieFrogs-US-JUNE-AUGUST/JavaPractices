package StringsAssignment;

public class StringsAssignment13 {
    public static void main(String[] args) {
        StringBuffer strbuf=new StringBuffer("Hi Team");
        strbuf.append(", welcome");
        System.out.println(strbuf.length());
        System.out.println(strbuf);
        strbuf.delete(0, strbuf.length()); // deleting the string from length 0 to total length
        System.out.println(strbuf.length());
        System.out.println(strbuf);
    }
}

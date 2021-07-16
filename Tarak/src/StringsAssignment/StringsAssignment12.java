package StringsAssignment;

public class StringsAssignment12 {
    public static void main(String[] args) {
    StringBuffer strbuf=new StringBuffer("Hi Team");
        strbuf.append(", welcome");
        System.out.println(strbuf.length());
        System.out.println(strbuf);
        strbuf.setLength(0);  // setting length of string to 0
        System.out.println(strbuf.length());// hence output of string length is 0
        System.out.println(strbuf);// as length set to 0 no output is printed
    }
}

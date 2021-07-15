public class Astring14{
    public static void main(String[] args){
        StringBuffer so = new StringBuffer("Clear the String using Object");
        System.out.println(so);
        System.out.println(so.length());
        so = new StringBuffer();// assigning the new value with new object
        System.out.println(so);// not giving the string
        System.out.println(so.length());// length becomes 0
    }
}    
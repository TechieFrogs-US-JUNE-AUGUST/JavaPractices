public class Astring16{
    public static void main(String[] args){
        String cap = new String("capital");
        System.out.println(cap);
        cap = cap.toUpperCase();// changing the string to cap and assigning back
        System.out.println(cap);
        String cap1 = new String("Capital");
        System.out.println(cap1);
        cap1 = cap1.toUpperCase();// changing the string to cap and assigning back
        System.out.println(cap1);
        String cap2 = new String(" capiTal");
        System.out.println(cap2);
        cap2 = cap2.toUpperCase();// changing the string to cap and assigning back
        System.out.println(cap2);
        System.out.println(cap2.trim());// to trim the spaces at starting and ending of the string
    }
}   
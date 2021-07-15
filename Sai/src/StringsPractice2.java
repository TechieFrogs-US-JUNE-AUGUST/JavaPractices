public class StringsPractice2{
    public static void main(String[] args){
        String s4 = "Bell";
        s4 = s4.concat("Ringing");
        String s5 = "Tele";// it wont create the new memory, it points to "s4- Bell" location only
        String s6 = "Bell ";
        String s7 = " Bell";// space also inclues in the part of the string
        String s8 = "bell";  
        String s9 = new String("Bell");
        // string index starts with 0 1 2 3...
        System.out.println(s4.substring(3));
        System.out.println(s4.substring(6));
        System.out.println(s5.substring(3));
        System.out.println(s4.substring(0,11));
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);

        //Trim - it removes spaces staring and ending
        System.out.println(s7.trim());
        String s10 = "  Hello  ";// trims the spaces starting and ending of the string
        System.out.println(s10.trim());
        String s11 = "  Say Hello  ";
        System.out.println(s11.trim());// wont remove the spaces in the middle of the string
        // startsWith, endsWith  -- gives Boolean values True or False
        System.out.println(s9.startsWith("B"));//true
        System.out.println(s7.startsWith("B"));// false , starts with space
        System.out.println(s9.endsWith("ll")); //true
        
        //charAt - index value
        System.out.println(s9.charAt(2));
        System.out.println(s11.charAt(5)); // space
        System.out.println(s11.charAt(3));
        //System.out.println(s11.charAt(15));// we cannot acces, length is lesser than 15
        System.out.println(s11.length());
        int i = 100;
        String s12 = "100";
        s12 = s12 + i; // converting interger value to string type
        System.out.println(s12);
        String s13 = String.valueOf(i);// converting the interger value to String value
        System.out.println(s13); // print 100 as string 100 not int 100
        // string replace have 2 parameters sestination and new string
        System.out.println(s9.replace("Bell", "Sell"));// here it changes the Bell to Sell
        System.out.println(s9);// here same as previous

    }
}
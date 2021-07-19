public class Astring19{
    public static void main(String[] args){
        String str1 = new String("String1 contains String2");
        String str2 = new String("String2");
        boolean check = str1.contains(str2);// checking gives true or false, so boolean
        // cheching for the string 2 value in string 1
        if(check)// boolean value is checking here
            System.out.println(str2 + " is in String1");
        else
            System.out.println(str2 + " is not in String1");
        String str3 = new String("String3");
        boolean check1 = str1.contains(str3);
        if(check1)// boolean value is checking here
            System.out.println(str3 + " is in String1");
        else
            System.out.println(str3 + " is not in String1");
    }
}
public class Astring20{
    public static void main(String[] args){
        String str1 = new String("String1 contains String2");
        String str2 = new String("String2");
        int check = str1.indexOf(str2);// checks the string2 is in string 1
        // indexOf gives - "0" if the string is there, if not it gives - "-1"
        if(check == -1)
            System.out.println(str2 + " is not in String1");
        else
            System.out.println(str2 + " is in String1");
        String str3 = new String("String3");
        int check1 = str1.indexOf(str3);
        if(check1 == -1)// boolean value is checking here
            System.out.println(str3 + " is not in String1");
        else
            System.out.println(str3 + " is in String1");
    }
}
public class Astring19{
    public static void main(String[] args){
        String str1 = new String("String1 contains String2");
        String str2 = new String("String2");
        boolean check = str1.contains(str2);
        if(check)
            System.out.println(str2 + " is in String1");
        else
            System.out.println(str2 + " not in String1");
    }
}
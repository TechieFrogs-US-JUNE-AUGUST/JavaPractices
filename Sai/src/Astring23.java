public class Astring23{
    public static void main(String[] args){
        int p = 0;
        String str = "Checking for punctuations, in this S!ring";
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='!' || str.charAt(i)==',' || str.charAt(i)=='.' || str.charAt(i)=='?')
                p++; //checking for spectial charecters, then only p increases
        }
        System.out.println("Total punctions in the string : "+ p);
    }
}
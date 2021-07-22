package strings;

public class String30 {
    public static void main(String[] args) {
        String str="Strings Assignment Program 30";
        System.out.println("Original Sentence : " +str);
        str=str.replaceAll("\\s", "");//used to remove and replace all the whitespaces
        // \\s finds all the white space char(tab,space,new line) and relaced with empty string literal 
        System.out.println("Replaced Sentance :" +str);
    }
    
}

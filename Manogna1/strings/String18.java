package strings;


public class String18 {
    public static void main(String[] args) {
        String str="StringsAssignment";
        System.out.println("characters in the string " +str + ":");
        
        for(char c:str.toCharArray())//converts string to CharArray and assigns the value of each character to c
        {
            System.out.print(c + ", ");
        }
        System.out.println();
    }
    
}

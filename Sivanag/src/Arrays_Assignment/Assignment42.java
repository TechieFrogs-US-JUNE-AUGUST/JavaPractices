package Arrays_Assignment;

public class Assignment42 {
    public static void main(String[] args) {
        char[] ch={'S','i','v','a','n','a','g'};
        String string1="Hammsika";
    String string=String.valueOf(ch);
    System.out.println(string);
    char[] ch1= string1.toCharArray();
    for(int i=0;i<ch1.length;i++)
    {
        System.out.print(ch1[i]+" ");
    }
    System.out.println();
        
    }
    
}

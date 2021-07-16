import java.util.Scanner;
public class Astring32  {    
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();    
        char ch = '-';      
        str = str.replace(' ', ch); // is used to repleace the character    
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(str);  
        sc.close();  
    }    
}      
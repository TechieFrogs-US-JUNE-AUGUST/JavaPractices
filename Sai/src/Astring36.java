import java.util.Scanner;
public class Astring36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        StringBuilder sb=new StringBuilder(str);  
        System.out.println(sb.reverse()); //reverse is uded to reverse the entire string
         sc.close(); 
    }
}
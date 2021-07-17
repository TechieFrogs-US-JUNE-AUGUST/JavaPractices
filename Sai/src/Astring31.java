import java.util.Scanner;
public class Astring31{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        sc.close();
    }
}
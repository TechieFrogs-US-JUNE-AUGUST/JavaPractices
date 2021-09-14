//import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        String string = "the capital of minnesota is saint paul";
        char ch = 'y';
        search(string , ch);
    }
        static void search(String string, char ch){
            int index = string.indexOf('y');
            System.out.println("Index of the y character : "+ index);
        }
}

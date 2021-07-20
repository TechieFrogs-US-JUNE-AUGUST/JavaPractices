import java.util.Scanner;
public class Astring18 {
    public static void main(String[] args){
        //String name = "Programiz";
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give the input String : ");
        String name = scannerObj.nextLine();
        System.out.println("Characters in string \"" + name + "\":");
        for(char c : name.toCharArray()) { //loop through each index character using for each loop
            System.out.print(c + ", "); //each loop it will execute
          }
        scannerObj.close();
    }    
}

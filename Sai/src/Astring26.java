import java.util.Scanner;
public class Astring26{
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Give the String");
        String string = scannerObj.nextLine();
        int stringLength = string.length();
        System.out.println("How many parts you want : ");
        int parts = scannerObj.nextInt();
        int subString = stringLength/parts;
        String[] partsArray = new String[parts];
        int temp = 0;
        if(stringLength % parts != 0){
            System.out.println("We can not divide the string in "+ parts + " equal parts");
        }
        else{
            for(int index = 0; index < stringLength ; index = index+subString){
                String equalpart = string.substring(index, index+subString);
                partsArray[temp] = equalpart;
                temp++;
            }
        System.out.println(parts + " of equal strings of a string "+ string);
           for(int index = 0 ; index < partsArray.length ; index++)
               System.out.println(partsArray[index]);
        }
        scannerObj.close();
    }
    
}

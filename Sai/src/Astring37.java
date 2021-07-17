import java.util.Scanner;
public class Astring37{
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter sentence");
        String string = scannerObj.nextLine(); 
        System.out.println("Duplicates in- "+ string);
        int count;
        for(int i = 0; i < string.length(); i++) {// to check evry index location
          count=1;
          char c = string.charAt(i);//to check every character
            if(c == ' ') // it checks any spaces, we need only the duplicate characters
            continue;
            for(int j = i + 1; j < string.length(); j++) {
              if(c == string.charAt(j)) {
                count++;
                // remove the char so that it is not picked again
                // in another iteration
                string = string.substring(0, j) + string.substring(j+ 1);
              }
        }
        if(count > 1) {
           System.out.println(c + " found " + count + " times");
        }
        }scannerObj.close();
}
}
//Uppercase--> 65-90;   Lowercase-->97-122;   Digits-->48-57
package TcsCoding_Assignment;
import java.util.Scanner;

public class Prog4{
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
        System.out.println("Enter The message: ");
        String message= scannerObj.nextLine();
        System.out.println("Enter a key: ");
        int key= scannerObj.nextInt();
        scannerObj.close();

        customCeaserCipher(message, key);                   //calling method by passing message and key values as parameters
    }

    static void customCeaserCipher(String message, int key){         //method with 2 parameters
        String str= "";
        char ch= ' ';

        if(key<0){
            System.out.println("INVALID INPUT");
        }
        else{
            for(int i=0; i<message.length(); i++){
                char c= message.charAt(i);
                if(c>=65 && c<=90){                         //condition for uppercase
                    ch= (char)((c+key-65) % 26 + 65);      //we have 26 chars so %26 and starting letter 'A' ASCII value is 65 for uppercase so adding with 65
                }
                 else if(c>=97 && c<=122){                  //condition for lowercase
                    ch= (char)((c+key-97) % 26 + 97);      //we have 26 chars so %26 and starting letter 'a' ASCII value is 65 for lowercase so adding with 97
                }
                else if(c>=48 && c<=47){                    //condition for digits from 0-9      
                    ch= (char)((c+key-48) % 10 + 48);       //we have 10 digits and starting digit '0' ASCII value is 48 so adding 48
                }
                else{                                //if we have alphanumeric char we will do nothing
                ch =c;
               }
            str= str+ch;                            //we formed new string 'str' from the above chars
        }
        System.out.println(str);                   //printing the new string which is ceasercipher
    }
  }
}
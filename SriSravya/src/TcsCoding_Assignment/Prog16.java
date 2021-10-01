package TcsCoding_Assignment;
import java.util.Scanner;

public class Prog16 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);

        String words[]= new String[3];               //declaring an array with size 3
        System.out.println("Enter 3 words: ");      //taking i/p from user
        for(int j=0; j<words.length; j++){
            words[j]= scannerObj.next();

            if(j == 0){                              //for first word
                char a[]= words[j].toCharArray();   //converting the string(1st word) to char
                for(int i=0; i<a.length; i++){
                    if(a[i]=='a'|| a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u'|| a[i]=='A'|| a[i]=='E'|| a[i]== 'I'|| a[i]== 'O'|| a[i]=='U')
                    a[i]= '%';                     //converting the vowel chars to '%'
                }
                for(int i=0; i<a.length; i++){        //prints the 1st word
                System.out.print(a[i]);
            }
            System.out.print(" ");
        }
            if(j == 1){                              //for second word
                char a[]= words[j].toCharArray();    //converting the string(2nd word) to char
                for(int i=0; i<a.length; i++){
                    if(!(a[i]=='a'|| a[i]=='e'|| a[i]=='i'|| a[i]=='o'|| a[i]=='u'|| a[i]=='A'|| a[i]=='E'|| a[i]== 'I'|| a[i]== 'O'|| a[i]=='U'))
                    a[i]= '#';                      //converting the consonant chars to '#'
                }
                for(int i=0; i<a.length; i++){      //prints the 2nd word
                System.out.print(a[i]);
            }
            System.out.print(" ");
        }
            if(j == 2){                              //for third word
                char a[]= words[j].toCharArray();    //converting the string(3rd word) to char
                for(int i=0; i<a.length; i++){
                    if(Character.isLetter(a[i])&& Character.isLowerCase(a[i]))        
                    a[i]= Character.toUpperCase(a[i]);     //converting the 3rd word chars to uppercase
            }
            for(int i=0; i<a.length; i++){           //prints the 3rd word
                System.out.print(a[i]);
            }
            System.out.print(" ");
        }
    }
            scannerObj.close();
        }
    }


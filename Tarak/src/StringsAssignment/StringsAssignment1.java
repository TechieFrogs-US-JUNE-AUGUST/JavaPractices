package StringsAssignment;

import java.util.Scanner;

public class StringsAssignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write your Sentence");
        String sentence=sc.nextLine();
        int vowels=0,spaces=0,consonents=0,digits=0;
        sentence=sentence.toLowerCase();   // converting into lower case
        for(int i=0;i<sentence.length();i++){  
            char ch=sentence.charAt(i);   // passing each character of string as i
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){  // checking for vowels
                vowels++;
            }
            else if (ch>='a' && ch<='z' ){  // after vowels checking for consonents
                consonents++; 
            }
            else if(ch>='0' && ch<='9'){ // checking for numbers
                digits++;
            }
            else if(ch==' '){  // checking for spaces
                spaces++;
            }
        }
        System.out.println(" no of vowels: "+vowels);
        System.out.println(" no of consonents: "+consonents);
        System.out.println(" no of digits: "+digits);
        System.out.println(" no of spaces: "+spaces);
    }
}

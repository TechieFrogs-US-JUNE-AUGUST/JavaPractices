//DIVIDE A STRING IN N EQUAL PARTS
package Strings_Assignment;

public class Prog26 {
    public static void main(String[] args) {
        String str= "sravyavenkat";
        int len= str.length();
        int n=2, temp=0;
        int chars= len/n;
        String equalStr[]= new String[n];                  //stores the array of string
        if(len%n!=0){                                           //checking if string can be divided into equal parts or not
           System.out.println("This string cannot be divided into " +n +"equal parts");
        }
        else{
            for(int i=0; i<len; i=i+chars){
                String part= str.substring(i, i+chars);       //dividing string in n equal parts using substring()
                equalStr[temp]= part;
                temp++;
            }
            System.out.println(n+ " equal parts of given string are: ");
            for(int i=0; i<equalStr.length; i++){
                System.out.println(equalStr[i]);
            }
        }
    }
}

//Program to find maximum occuring character in a given string.

package CodingAssessment_Questions;

public class Prog3_20{
    public static void main(String[] args) {
        String s="Sri Sravya";
        int freq[]= new int[s.length()];             //initialsing a 1D array and giving size as string length
        char minChar= s.charAt(0), maxChar= s.charAt(0);
        int i,j, min,max;
        char string[]= s.toCharArray();          //converts string to char array

        for(i=0; i<string.length; i++){            //count each word in given string and store in array freq
            freq[i]= 1;
            for(j=i+1; j<string.length; j++){
                if(string[i]==string[j] && string[i]!=' ' && string[i]!='0'){
                    freq[i]++;
                    string[j]='0';                     //setting to '0' to avoid printing visited char
                }
            }
        }
        min= max= freq[0];                         //determining min amd max occuring char
        for(i=0; i<freq.length; i++){               
            if(min>freq[i] && freq[i]!='0'){         //if min is > freq of char, then store freq in min and corresponding char in minChar
                min= freq[i];
                minChar= string[i];
            }
            if(max< freq[i]){                       //if max is < freq of char, then store freq in max and corresponding char in maxChar
                max= freq[i];
                maxChar= string[i];
        }
    }
    System.out.println("Minimum occuring character: " +minChar);
    System.out.println("Maximum occuring character: " +maxChar);
  
    }
}
